package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExamples {

    public static void main ( String[] args){
        List<Integer> list = Arrays.asList( 1, 3, 4, 5, 6, 10,12,14,15,16,18,20,22,24,25,26,27,28,29,30);
        Integer sum = list.stream().reduce(0, (a,b) -> a+b );
     //   if (sum.isPresent()){
            System.out.println("Sum of the numbers : " + sum );
      //  }

    }

}
