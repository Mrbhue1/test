package com.example.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@Data
@XmlRootElement
public class TxnInfo {

    private Integer funcCode;
    private String pan;
    private String procCode;
    private String txnDateTime;
    private Integer mcc;
    private String posEntryMode;
    private Integer posCode;
    private Integer acqId;
    private String track2Data;
    private Integer rrn;
    private Integer terminalId;
    private Integer agentId;
    private Integer caId;
    private Integer caLocn;
    private String teminalData;
    private Integer serviceChrg;
    private Integer txnMode;
    private Integer orgTxnRefId;
    private Integer narration;
    private String txnHamac;
    private Integer uniqueNo;
    private Date expDate;
    private Date setlDate;
    private Integer posCaptCode;


}
