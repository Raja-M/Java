package javafeatures;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.classexamples.Cust;
import core.classexamples.CustAddr;

import java.util.ArrayList;
import java.util.List;

public class CustDetails {

    public void getCustDetails(){

        List<CustAddr> custAddrList = new ArrayList<>();

        CustAddr custAddr = new CustAddr();


        custAddr.setAddrId(123456L);
        custAddr.setStreetName("Streeet1");
        custAddr.setCityName("City1");
        custAddr.setState("State1");

        System.out.println("Customer Address : " + custAddr);
        custAddrList.add(custAddr);

        CustAddr custAddr2 = new CustAddr();


        custAddr2.setAddrId(1234567L);
        custAddr2.setStreetName("Streeet2");
        custAddr2.setCityName("City2");
        custAddr2.setState("State2");

        System.out.println("Customer Address2 : " + custAddr2);
        custAddrList.add(custAddr2);

        Cust cust = new Cust();

        cust.setCustID(1234L);
        cust.setCustName("Testcust");
        cust.setCustType("prime");
        cust.setCustAddrList(custAddrList);

        System.out.println("Customer : " + cust);

        ObjectMapper mapper = new ObjectMapper();
        String custJsonString;
        try {
            custJsonString = mapper.writeValueAsString(cust);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println( " Customer Json : " + custJsonString );
        System.out.println("Customer name : " + cust.getCustName() + " and Customer City : " + cust.getCustAddrList().get(0).getCityName());

        List<CustAddr> custAddrList2 = cust.getCustAddrList();
        for(CustAddr custaddr : custAddrList2){
            System.out.println("Customer Address : " + custaddr);
        }

    }
}
