package com.example.legacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "attribute")
    private String attribute;
    @XmlElement(name = "unit")
    private String unit;
    @XmlElement(name = "preparation")
    private String preparation;
    @XmlTransient
    public String getCode() {
        return code;
    }
    @XmlTransient
    public String getDescription() {
        return description;
    }
    @XmlTransient
    public String getAttribute() {
        return attribute;
    }
    @XmlTransient
    public String getUnit() {
        return unit;
    }
    @XmlTransient
    public String getPreparation() {
        return preparation;
    }
}