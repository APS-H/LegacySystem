package com.example.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.example.legacy.entity.Item;
import com.example.legacy.entity.Items;
import com.example.legacy.entity.Order;
import com.example.legacy.entity.Orders;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;

@WebService
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

    @WebMethod
    public String getOrderService() throws Exception {
        List<Order> res = getOrders();
        Orders ods = new Orders(res);
        JavaToXml<Orders> jtx = new JavaToXml<>();
        return jtx.JavaToXml(ods);

    }
public static void main(String args[]) throws Exception {
        OrderData s=new OrderData();
        System.out.println(s.getOrderService());
}

}