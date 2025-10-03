package javautil;

import  bjava.sql.SQLOutput;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateTimeOldVSNew {

    public static void main ( String [] args){

        Date utilDate = new java.util.Date();

        System.out.println(" UtilDate : " + utilDate);
        System.out.println(" UtilDate Func :" + utilDate.getTime());


        long millis = System.currentTimeMillis();
        Date sqlDate = new java.sql.Date(millis);

        System.out.println("SqlDate : " + sqlDate);
        System.out.println("SqlDate Func getTime : " + sqlDate.getTime());

        Calendar cal = Calendar.getInstance();
        System.out.println(" Calendar Time : " + cal.getTime());

        cal.add( cal.MONTH , 4 );
        System.out.println(" Calendar add 4 months : " + cal.getTime());

        TimeZone zone = TimeZone.getDefault();
        System.out.println("Time Zone is : " + zone.getID() + "  : " + zone);
        String[] zones = TimeZone.getAvailableIDs();
        System.out.print(" Time Zones : + ");
        Arrays.stream( zones).forEach( System.out::println);


    }
}
