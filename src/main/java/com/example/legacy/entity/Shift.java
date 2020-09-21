package com.example.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shift {

    private String code;

    private String name;

    private String beginTime;

    private String endTime;

}