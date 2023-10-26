package collections;

import java.util.ArrayList;
import java.util.List;

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
    }
}
