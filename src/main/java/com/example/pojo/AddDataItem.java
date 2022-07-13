package com.example.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public
class AddDataItem {
    @XmlAttribute
    private String name="hdh";
    @XmlAttribute
    private String value="ksagd";
}