package com.apsh.legacy.data;

import com.apsh.legacy.entity.Shift;
import com.apsh.legacy.entity.Shifts;
import com.apsh.legacy.util.Transformer;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@WebService
@Component
public class ShiftData {

    static private String file = "schema/shift.csv";

    public List<Shift> getShifts() {
        List<Shift> res = new ArrayList<>();
        try {
            // 读取物品
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            for (String[] line : contents) {
                if (line[2].length() == 0)
                    line[2] = "00:00-00:00";
                String[] interval = line[2].split("-");
                res.add(new Shift(line[0], line[1], interval[0], interval[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @WebMethod
    public String getShiftService() throws Exception {
        List<Shift> res = getShifts();
        Shifts sfs = new Shifts(res);
        Transformer<Shifts> jtx = new Transformer<>();
        return jtx.java2Xml(sfs);

    }

}