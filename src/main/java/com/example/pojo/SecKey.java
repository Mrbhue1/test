package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
//@XmlRootElement(name="SecKey")
@XmlAccessorType(XmlAccessType.FIELD)
public class SecKey {
    @XmlAttribute
    String ci="hj";
    @XmlAttribute
    String ki="gj";
    @XmlValue
    String skeyValue="gyyuoiuupoj";
}
