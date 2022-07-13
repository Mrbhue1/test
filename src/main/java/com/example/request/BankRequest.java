package com.example.request;

import com.example.pojo.AuthInfo;
import com.example.pojo.ServiceInfo;
import com.example.pojo.SvcHeader;
import com.example.pojo.TxnInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


@XmlRootElement(name = "FIGWebReqSvc")
@Data
@XmlAccessorType(XmlAccessType.FIELD)
//@AllArgsConstructor
public class BankRequest{
    @XmlAttribute
    private String spv;
    @XmlElement(name = "SvcHeader")
    private SvcHeader svcHeader;
    @XmlElement(name = "TxnInfo")
    private TxnInfo txnInfo;
    @XmlElement(name = "AuthInfo")
    private AuthInfo authInfo;
    @XmlElement(name = "ServiceInfo")
    private ServiceInfo serviceInfo;
}
