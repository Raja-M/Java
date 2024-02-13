package collections;


import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main( String[] args ){

        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("a" , 1 );
        ht.put("b" , 2 );
        ht.put("c" , 3 );
        ht.put("d" , 4 );
        ht.put("e" , 5 );

        System.out.println(" Hash Table : " + ht);

        ht.remove("d");
        System.out.println(" Hash Table After remove : " + ht);

        Enumeration<String> htKeys = ht.keys();

        while (htKeys.hasMoreElements()){
            String htKey = htKeys.nextElement();
            System.out.println( " Key : " + htKey + " , Value : " + ht.get(htKey));
        }
    }
}
