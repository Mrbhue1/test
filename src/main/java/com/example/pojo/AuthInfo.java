package com.example.pojo;

import javax.xml.bind.annotation.*;


//@XmlRootElement
@lombok.Data
//@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AuthInfo")
public class AuthInfo {

    @XmlAttribute
    private char prov;
    @XmlAttribute
    private String enc="SSHA256";
    @XmlAttribute
    private String rc="New";
    @XmlElement(name = "Data")
    private Data data;
    @XmlElement(name = "Fmt")
    private Fmt fmt;
    @XmlElement(name = "Meta")
    private Meta meta;
    @XmlElement(name = "EncInfo")
    private EncInfo encInfo;

    @XmlElement(name = "Uses")
    private Uses uses;


}






