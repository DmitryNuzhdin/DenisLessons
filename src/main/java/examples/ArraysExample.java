package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysExample {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[] intArray2 = intArray.clone();

        String[] stringArray = new String[]{"a", "b"};

        intArray2[0] = 100;

        Integer i2 = 0;

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(1);
        linkedList.poll();

        list.add(1);
        list.add(2);
        System.out.println(list.size());
        System.out.println(list.get(1));

//        for(int i = 0; i < 4; i++){
//            System.out.println(intArray[i]);
//        }
//        for(int i: intArray){
//            System.out.println(i);
//        }

    }
}
