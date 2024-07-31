package Streams;

import java.util.Arrays;
import java.util.List;

public class MapAverage {

    public static void main( String[] args){

        List<Integer> nums = Arrays.asList( 1, 2, 3, 4, 5,6);

        double numAvg = nums.stream().mapToInt( e -> e).average().getAsDouble();
        System.out.println( "Average : " + numAvg);
    }
}
