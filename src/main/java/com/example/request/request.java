package com.example.request;

import com.example.pojo.SvcHeader;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Request")
public class request {

    private SvcHeader svcHeader;
}
