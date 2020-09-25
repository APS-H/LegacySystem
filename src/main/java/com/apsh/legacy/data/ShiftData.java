package com.apsh.legacy.data;

import com.apsh.legacy.entity.Shift;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ShiftData {

    static private final String file = "schema/shift.csv";

    public List<Shift> getShifts() {
        List<Shift> res = new ArrayList<>();
        try {
            // 读取物品
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))
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

}