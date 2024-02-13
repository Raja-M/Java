package core;

public class JavaArrays {

    public static void main( String[]  args){

        System.out.println(" Arrays demo " );

        String[] array = new String[100];

        char[] charArray = new char[10];

        char[] chArrayInit = { 'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j'};

        String arrayStr = new String(chArrayInit);

        System.out.println( "chaArrayInit : " + chArrayInit.toString()  );

        System.out.println( "arrayStr : " + arrayStr );

        System.out.println( "String.valueof : " + String.valueOf(chArrayInit) );

    }
}
