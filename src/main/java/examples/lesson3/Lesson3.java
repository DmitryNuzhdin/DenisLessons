package examples.lesson3;

import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {
        String exampleString = "abc";

        Object object = exampleString;
        exampleString.length();

        if (object instanceof String) {
            String s = (String) object;
            System.out.println(s);
        }



        Map<Integer, String> map = new HashMap<>();
        map.put(5, "AAA");
        map.put(5, "BBB");
        System.out.println(map.get(5));

        Person person = new Person("Ivan", "Petrov");
        System.out.println(person.hashCode());
        System.out.println(person.hashCode());

        Map<Person, String> adressMap = new HashMap<Person, String>();
        Set<String> set = new HashSet<>();

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(1, 10);
        treeMap.put(3, 30);
        treeMap.put(7, 70);

        System.out.println();

        System.out.println("------------");

        adressMap.put(person, "Moscow ....");
        System.out.println(adressMap.get(person));
        //person.firstName = "";
        System.out.println(adressMap.get(person));

        System.out.println(new Person("", "").hashCode());
        System.out.println(new Person("", "").hashCode());
        System.out.println(new Person("", "").hashCode());

        class Node{
            Person key;
            String value;
        }

        //List<Node>[16] data;


    }
}
