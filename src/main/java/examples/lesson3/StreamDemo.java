package examples.lesson3;

import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.forEach(System.out::println);

        int i = 0;

        Map<String, Integer> map = new HashMap<>();


        list.stream()
                .filter(integer -> integer % 2 != 0)
                .map(integer -> integer * 3)
                .filter(integer -> integer < 20)
                .forEach(System.out::println);


    }
}
