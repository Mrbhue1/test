package com.example.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class PartyInfo {
    @XmlAttribute
    private final static String type="PERSON";
    @XmlAttribute
    private final static String categ="CUSTOMER";
    private Integer partyOrg;
    private Integer partyIdType;
    private Integer partyIdValue;

}