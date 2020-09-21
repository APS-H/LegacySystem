package com.example.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.legacy.entity.Order;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;

@Service
public class OrderData {

    static private String file = "schema/order.csv";

    public List<Order> getOrders() {
        List<Order> res = new ArrayList<>();
        try {
            // 读取物品
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            for (String[] line : contents)
                res.add(new Order(line[0], line[1], Integer.valueOf(line[2]), line[3]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}