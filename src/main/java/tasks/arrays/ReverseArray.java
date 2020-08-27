package tasks.arrays;

import java.util.ArrayList;

public class ReverseArray {
    public static String[] reverseArray(String[] array){
        //метод дожен возвращать НОВЫЙ массив который является копией этого, но записанный задом наперед
        //(последний элемент становится первым итд)
        ArrayList<String> res = new ArrayList<>();
        int k = array.length - 1;
        while (k >= 0) {
            res.add(array[k]);
            k = k - 1;
        }
        int size = res.size();
        return res.toArray(new String[size]);
    }
}

