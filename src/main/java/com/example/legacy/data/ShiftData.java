package com.example.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.legacy.entity.Shift;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;

@Service
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
                String[] interval = line[2].split("-");
                res.add(new Shift(line[0], line[1], interval[0], interval[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}