package collections;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){

        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put( "John", 10000);
        hMap.put( "Mike", 2000);
        hMap.put( "Peter" , 40000);
        hMap.put( "Sean", 50000);
        hMap.put( null, -1);


        System.out.println(" hMap :" + hMap);

        for(Map.Entry<String, Integer> e : hMap.entrySet()){
            System.out.println(" Key : " + e.getKey() + " Value  : " + e.getValue());
        }
    }
}
