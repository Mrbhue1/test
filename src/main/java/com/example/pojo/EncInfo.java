package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EncInfo")
public class EncInfo{
    @XmlAttribute
    private String alg="PBKDF2";
    @XmlElement(name = "SecKey")
    private SecKey secKey=new SecKey();
    private String Hmac="PBKDF2";
}