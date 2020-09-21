package com.example.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.legacy.entity.Item;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;

@Service
public class ItemData {

    static private String file = "schema/item.csv";

    public List<Item> getItems() {
        List<Item> res = new ArrayList<>();
        try {
            // 读取物品
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            for (String[] line : contents)
                res.add(new Item(line[0], line[1], line[2], line[3], line[8]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}