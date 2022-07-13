package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TxnReqInfo {
    private Integer amount;
    private String currCode;
    @XmlElement(name = "PartyList")
    private PartyList partyList;
    @XmlElement(name = "AddDataElement")
    private AddDataItem addDataItem;
}

