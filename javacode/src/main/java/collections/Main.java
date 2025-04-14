package collections;

import Streams.EmployeeSalary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main( String[] args){

        System.out.println(" Collection class started ");
/*
        List<String> list = new ArrayList<>();
        String[] names = { "Anna", "Bob", "Carol" , "David"};
        list.addAll( Arrays.asList(names));

        System.out.println(list);
*/

        List<Card> deck = Card.getStandardDeck();

        Card.printDeck( deck);
        EmployeeSalary empsal = new EmployeeSalary();
        empsal.getEmpSalary();

    }
}
