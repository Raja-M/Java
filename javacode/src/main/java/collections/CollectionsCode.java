package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsCode {

    public static void main ( String[] args){
        System.out.println(" Collections Code ");

        Stream< Integer > strm = Stream.of ( 1, 2, 3, 4, 5 );

        List< Integer > list = strm.collect(Collectors.toList() );
        ArrayList< Integer > arrayList = new ArrayList<>(list);
        // System.out.println(" Array List : " + arrayList);
    }
}
