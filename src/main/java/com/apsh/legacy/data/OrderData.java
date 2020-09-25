package com.apsh.legacy.data;

import com.apsh.legacy.entity.Order;
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
public class OrderData {

    static private final String file = "schema/order.csv";

    public List<Order> getOrders() {
        List<Order> res = new ArrayList<>();
        try {
            // 读取物品
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            for (String[] line : contents)
                res.add(new Order(line[0], line[1], Integer.valueOf(line[2]), line[3]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public Order getOrderbyId(String id) {
        return null;
    }
}