package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main (String[] args){

        Emp e = new Emp( "test", 1000);

        System.out.println("ArrayList Demo..");

        List<String> list = new ArrayList<>();
        System.out.println("Init size of Array : " + list.size());
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        list.add("element3");

        System.out.println("Size of Array now: " + list.size());

        System.out.println( list );

        list.add(null);
        list.add(null);

        System.out.println( list );

        String[] li = {"one", "two"}; //new String[]{"one", "two"};
        List<String> listColl = new ArrayList<>(List.of(li));
        System.out.println("li : " + Arrays.toString(li) + "  li[0] " + li[0]);
        System.out.println("list coll : " + listColl);

        String[] strArray = new String[ list.size()];
        strArray = list.toArray(strArray);

        for( String s : strArray){
            System.out.println( " String element : " + s);
        }

        String[] strArrayList = {"one" , "two", "three"};
        System.out.println( "StrArrayList : " +  strArrayList );
    }
}
