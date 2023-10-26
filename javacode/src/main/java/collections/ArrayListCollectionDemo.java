package collections;

import java.util.Collection;
import java.util.ArrayList;


public class ArrayListCollectionDemo {

    public static void main( String[] args){


        System.out.println("Hello World !!");

        Collection<String> fruitcollection = new ArrayList<>();
        fruitcollection.add( "banana");
        fruitcollection.add( "apple");
        fruitcollection.add( "mango");
        System.out.println(fruitcollection);

        fruitcollection.remove("banana");

        System.out.println(fruitcollection);

        fruitcollection.forEach( (e) -> System.out.println(e) );



    }
}
