package com.example.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="ShiftDataPack")
public class Shifts {
    @XmlElementWrapper(name = "ShiftList")
    @XmlElement(name = "Shift")
    List<Shift> ShiftList;
}
