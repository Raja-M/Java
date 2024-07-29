package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args){

        System.out.println("program starting");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        List<Integer> newNum = nums.stream().map(e -> e+5).filter(e->e>7).collect(Collectors.toList());

        newNum.forEach(  System.out::println  );

    }
}
