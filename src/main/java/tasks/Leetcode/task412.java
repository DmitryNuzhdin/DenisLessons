package tasks.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task412 {
    public static List<String> fizzBuzz(int n) {
        //IntStream intStr = IntStream.range(1,n);
       // List<String> listOfStrings = intStr.mapToObj()

                //map(String::valueOf).collect(Collectors.toList());
        return IntStream.range(1, n + 1).mapToObj(i -> i % 15 == 0 ? "FizzBuzz": i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}




