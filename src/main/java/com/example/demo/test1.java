package com.example.demo;

import com.example.newTest.Devices;
import com.example.request.BankRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class test1 {

    public void obj2xml(BankRequest bankRequest) throws JAXBException {

        JAXBContext jaxbContext=JAXBContext.newInstance(BankRequest.class);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        File file=new File("src/main/java/com/example/Data/bank.xml");
        marshaller.marshal(bankRequest,System.out);
        marshaller.marshal(bankRequest,file);
    }

    public void xml2Obj() throws JAXBException {

        JAXBContext jaxbContext=JAXBContext.newInstance(BankRequest.class);
         Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
//        unmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        File file=new File("src/main/java/com/example/Data/bank.xml");
        BankRequest bankRequest= (BankRequest) unmarshaller.unmarshal(file);
        System.out.println(bankRequest.getAuthInfo());
        System.out.println(bankRequest.getSvcHeader());

    }

}