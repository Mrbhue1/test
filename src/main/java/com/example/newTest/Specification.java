package com.example.newTest;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Specification {
    private String type;
    private String Processor;
    private String RAM;
    private String ROM;
}
