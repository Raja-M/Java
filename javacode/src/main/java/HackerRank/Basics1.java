package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Basics1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        double payment = scanner.nextDouble();
//        scanner.close();
//        System.out.println("Payment : " + payment);
//
//        DecimalFormat usdecimalFormat = new DecimalFormat("$#,###.00");
//        DecimalFormat indiadecimalFormat = new DecimalFormat("Rs,#,###.00");
//        DecimalFormat chinadecimalFormat = new DecimalFormat("'\u00A5'#,###.00");
//        DecimalFormat francedecimalFormat = new DecimalFormat("#,###.00 €");
//
//        String formattedPayment = chinadecimalFormat.format(payment);
//        System.out.println("Formatted Payment : " + formattedPayment);
//        //System.out.println(N );
//
//        String s = "Hello World";
//
//        System.out.format( " the String is : %-20s \n", s);
//
//        // format string align center
//        int len = s.length();
//        int spaces = (20 - len) / 2;
//        String format = "%"+spaces+"s%s%"+spaces+"s";
//        System.out.format(format, "", s, "").println();
//
//        System.out.println( "2 pow 0" + " : " + Math.pow(2,0) );
//
//        Calendar cal = Calendar.getInstance();
//        System.out.println(" Calendar : " + cal.getTime());
//        // get the day name from calendar
//        cal.set( 2015, 8, 5 );
//        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        int day = cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println("day :" + day);
//        System.out.println(" Day of the week : " + days[day - 1]);
//
//        //write code calculate compound interest
//        double principal = 1000;
//        double rate = 5;
//
//        double time = 2;
//        double amount = principal * Math.pow((1 + rate / 100), time);
//        double compoundInterest = amount - principal;
//        System.out.println("Compound Interest : " + compoundInterest);
//        System.out.println("Amount : " + amount);
//        System.out.println("Principal : " + principal);
//        System.out.println("Rate : " + rate);
//        System.out.println("Time : " + time);
//        System.out.println("Simple Interest : " + (principal * rate * time) / 100);
//
        String s = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        int k = 1;
        int endPoint = s.length()-k;

        System.out.println( "End Point : " + endPoint);
        String[] strList = new String[endPoint+1];

        System.out.println(  endPoint );

        for( int i = 0; i < endPoint; i++){
            System.out.println(" SubString : "+ s.substring(i, i+k) + " : " + i);
            strList[i] =  s.substring(i, i+ 1) ;
        }
        System.out.println( strList[4] );

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//
//        double d = scan.nextDouble();
//
//        String s = scan.next();
//        // Write your code here.
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

    }

}
