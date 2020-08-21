package examples;

import java.util.Objects;

public class Lesson1 {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;
        float f;
        double d;
        boolean b = true;
        char c = 'a';
        {
            int i2 = 2;
        }

        String string =  "123";
        String string2 = new String(string);

        if (string.equals("123")) {
            System.out.println("!!!");
        } else if (string.equals("111")){
            System.out.println(":(");
        }

        while (b) {
            System.out.println("Cycle");
            b = false;
        }

        for (int ii = 0; ii < 10; ii++){
            System.out.println("ii = " + ii);
        }

        if (Objects.equals(string2, "123")){
            System.out.println("!!!");
        }

        Lesson1 lesson1 = new Lesson1();

        System.out.println(string);

        System.out.println(string == string2);
        System.out.println(Objects.equals(string, string2));



    }
}
