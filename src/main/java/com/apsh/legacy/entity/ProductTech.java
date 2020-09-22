package com.apsh.legacy.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTech {

    private String name;

    private Integer employerCount;

    private List<ProductItem> materials;

    private List<ProductResource> resources;

}