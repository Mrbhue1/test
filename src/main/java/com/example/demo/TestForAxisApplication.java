package com.example.demo;

import com.example.pojo.*;
import com.example.request.BankRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBException;
import java.util.Date;

@SpringBootApplication
public class TestForAxisApplication {

	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(TestForAxisApplication.class, args);
		BankRequest bankRequest = new BankRequest();

		//AuthIfo initialized

		AuthInfo authInfo = new AuthInfo();
		authInfo.setEncInfo(new EncInfo("PFDK2",new SecKey(),"hmac"));
		authInfo.setData(new Data("ddkjjd"));
		authInfo.setFmt(new Fmt("hh"));
		authInfo.setMeta(new Meta("ndj",23,"jdj",87,8,"kdhs","dkhkds","hkj","oa","kjs"));
		authInfo.setUses(new Uses("pi","pa","pfa","bio","bt","pin","otp"));

		//TxnInfo
		TxnInfo txnInfo = new TxnInfo();
		txnInfo.setAcqId(145);
		txnInfo.setAgentId(4747);
		txnInfo.setCaId(695);
		txnInfo.setCaLocn(0270);
		txnInfo.setExpDate(new Date(13/07/22));
		txnInfo.setMcc(63);
		txnInfo.setFuncCode(1821);
		txnInfo.setNarration(2962);
		txnInfo.setOrgTxnRefId(180608842);
		txnInfo.setPan("BDWPH62469");
		txnInfo.setPosCaptCode(78146);

		//Svcheader
		SvcHeader svcHeader =  new SvcHeader();
		svcHeader.setTxnId(1234);
		svcHeader.setMsgFmtVer("5868db");
		svcHeader.setTspAuth("gsjdga");
		svcHeader.setTxnOrigin("ygduagd");
		svcHeader.setTspVdrId(58528);

		bankRequest.setAuthInfo(authInfo);
		bankRequest.setSpv("V 2.O");
		bankRequest.setTxnInfo(txnInfo);
		bankRequest.setServiceInfo(new ServiceInfo(new TxnReqInfo(28787,"INR",new PartyList(new PartyInfo(66,3873,8763873)),new AddDataItem())));
		bankRequest.setSvcHeader(svcHeader);





		test1 t = new test1();
		t.obj2xml(bankRequest);
		t.xml2Obj();

//		Specification specification=new Specification();
//		specification.setProcessor("A13 bionic chip");
//		specification.setRAM("8GB");
//		specification.setType("128GB");
//		specification.setType("SmartPhone");
//		Devices devices=new Devices();
//		devices.setName("Iphone");
//		devices.setDate(new Date());
//		devices.setSpecification(specification);
//		t.obj2xml(devices);
	}

}