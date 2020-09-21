package com.example.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private String code;

    private String description;

    private String attribute;

    private String unit;

    private String preparation;

}