package com.example.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.example.legacy.entity.Employer;
import com.example.legacy.entity.Employers;
import com.example.legacy.entity.Item;
import com.example.legacy.entity.Items;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;

@WebService
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
    @WebMethod
    public String getItemService() throws Exception {
        List<Item> res = getItems();
        Items its = new Items(res);
        JavaToXml<Items> jtx = new JavaToXml<>();
        return jtx.JavaToXml(its);

    }

}