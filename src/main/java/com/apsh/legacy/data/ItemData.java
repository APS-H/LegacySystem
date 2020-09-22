package com.apsh.legacy.data;

import com.apsh.legacy.entity.Item;
import com.apsh.legacy.entity.Items;
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
        Transformer<Items> jtx = new Transformer<>();
        return jtx.java2Xml(its);

    }

}