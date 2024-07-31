package javautil;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Optional;

public class OptionalExample {

    public static void main ( String[] args){
        String nullVal  = null ;
        Optional<String>  noVal =    Optional.empty(); // null  ;//
        Optional<String > hasVal = Optional.of( "SomeValue");

        System.out.println("Null val :" + nullVal);
        System.out.println(" no Val : " + noVal);

        //You will get null pointer Exception for below
        //int strLen = nullVal.length();
        //System.out.println(" nullVal Length : " + strLen);

        String noValCopy = noVal.orElse("No Value");
        System.out.println(" noValCopy : " + noValCopy);

       //  System.out.println(" noVal value : " + noVal.get());  // Throws no such value exception
        if (  noVal.isPresent()){
            System.out.println(" NoValue  value : " + noVal.get());
        }else{
            System.out.println(" NoValue  is Empty " );
        }



    }
}
