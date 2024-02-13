package collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main ( String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.add( i );
        }
        System.out.println( " LinkedList : " + linkedList);

        linkedList.add( 1, 100);
        System.out.println( " LinkedList 100 : " + linkedList);

        linkedList.set( 3, 200);
        System.out.println( " LinkedList 200 : " + linkedList);

        linkedList.remove( 6 );
        System.out.println( " LinkedList removed 5 : " + linkedList);
        System.out.println( " LinkedList get 200 : " + linkedList.get(3));
        linkedList.clear();
        System.out.println( " LinkedList cleared : " + linkedList);
    }

}
