package javautil;

import  java.sql.SQLOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateTimeOldVSNew {

    /*

Old API:
Uses java.util.Date and java.util.Calendar.
Less intuitive and thread-unsafe.
New API:
Uses java.time.LocalDate, java.time.LocalDateTime, and java.time.ZonedDateTime.
More readable, immutable, and thread-safe.
     */

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

        cal.add(Calendar.MONTH, 1);
        System.out.println("Old java.util.Calendar (1 month added): " + cal.getTime());

        // New Date-Time API
        LocalDate localDate = LocalDate.now();
        System.out.println("New java.time.LocalDate: " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("New java.time.LocalDateTime: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("New java.time.ZonedDateTime: " + zonedDateTime);

        // Formatting with DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted LocalDateTime: " + localDateTime.format(formatter));

        // Parsing a date string
        String dateStr = "2023-10-01";
        LocalDate parsedDate = LocalDate.parse(dateStr);
        System.out.println("Parsed LocalDate: " + parsedDate);


    }
}
