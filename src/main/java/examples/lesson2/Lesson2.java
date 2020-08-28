package examples.lesson2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {

//        int a = 5;
//
//        boolean b;
//        if (a > 5)
//            b = true;
//        else
//            b = false;
//
//        b = (a > 5) ? true : false;

        //Generate code  Ctrl - Insert
        //Method signature help Ctrl-P

        // C -> B -> A
        // D -> A

        new ArrayList<>();

        A a = new A(1, "abc");
        a.printData();
        System.out.println(A.s);

        A.printHi();

        List<Integer> list = new ArrayList<>();
        list = new LinkedList<>();

        list.add(5);
    }
}
