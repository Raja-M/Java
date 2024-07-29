package core;

import java.util.Arrays;
import java.util.List;

public class JavaArrays {

    public static void main( String[]  args){

        System.out.println(" Arrays demo " );

        String[] array = new String[100];

        char[] charArray = new char[10];

        char[] chArrayInit = { 'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j'};

        for ( char ch : chArrayInit){
            System.out.println( ch);
        }

        String a[] = new String[]{ "a" , "b" , "c", "d", "e", "f", "g"};

        List<String> listc = Arrays.asList(a);

        System.out.println("String List : " + listc);

        String arrayStr = new String(chArrayInit);

        System.out.println( "chaArrayInit : " + chArrayInit.toString()  );

        System.out.println( "arrayStr : " + arrayStr );

        System.out.println( "String.valueof : " + String.valueOf(chArrayInit) );




    }
}
