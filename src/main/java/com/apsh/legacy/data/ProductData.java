package com.apsh.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.apsh.legacy.entity.Product;
import com.apsh.legacy.entity.ProductItem;
import com.apsh.legacy.entity.ProductResource;
import com.apsh.legacy.entity.ProductTech;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;

@Service
public class ProductData {

    static private String file = "schema/product.csv";

    static private String resourceFile = "schema/resource.csv";

    public List<Product> getProducts() {
        List<Product> res = new ArrayList<>();
        try {
            // 读取资源获取类型
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(resourceFile), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            Map<String, String> resourceNameMap = new HashMap<>();
            for (String[] line : contents)
                resourceNameMap.put(line[0], line[1]);
            // 读取产品
            reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            contents = reader.readAll();
            Product product = null;
            ProductTech tech = null;
            for (String[] line : contents) {
                if (line[0].length() != 0) {
                    if (product != null) {
                        product.getTechs().add(tech);
                        res.add(product);
                    }
                    product = new Product();
                    product.setItemCode(line[0]);
                    product.setTechs(new ArrayList<>());
                }
                if (line[1].length() != 0) {
                    if (tech != null)
                        product.getTechs().add(tech);
                    tech = new ProductTech();
                    tech.setName(line[1]);
                    tech.setEmployerCount(Integer.valueOf(line[13]));
                    tech.setMaterials(new ArrayList<>());
                    tech.setResources(new ArrayList<>());
                }
                if (line[2].length() != 0) {
                    ProductItem item = new ProductItem(line[2], Double.valueOf(line[4]));
                    tech.getMaterials().add(item);
                }
                if (line[6].length() != 0) {
                    String name = resourceNameMap.containsKey(line[6]) ? resourceNameMap.get(line[6]) : "cnm";
                    ProductResource resource = new ProductResource(line[6], name, Integer.valueOf(line[10].split("个")[0]), Double.valueOf(line[12].split("H")[0]));
                    tech.getResources().add(resource);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}