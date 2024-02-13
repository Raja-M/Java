package collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {
    public static void main (String[] args){
        System.out.println("ArrayList Demo..");

        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        list.add("element3");
        System.out.println( list );

        list.add(null);
        list.add(null);

        System.out.println( list );

        List<Integer> listNum1 = new ArrayList<>( List.of( 1, 2, 3, 4));
        List<Integer> listNum2 = new ArrayList<>(Arrays.asList(1, 2, 3,4));
        List<Integer> listNum3 = Stream.of( 1, 2, 3, 4 ).collect(Collectors.toCollection( ArrayList::new));

        Stream.of( "a", "b" , "c").filter( e -> e == "b").forEach(System.out::println);
        listNum1.forEach( e -> System.out.println( " Num : " + e ));

        listNum1.removeIf( e -> e == 3 );
        System.out.println( " After : "  );
        listNum1.forEach( e -> System.out.println( " Num : " + e ));

    }
}


