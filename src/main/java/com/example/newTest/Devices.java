package com.example.newTest;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.reflect.Field;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class Devices {
    private String name;
    private Date date;
    private Specification specification;

}
