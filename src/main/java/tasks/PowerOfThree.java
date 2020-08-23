package tasks;

import java.util.Objects;

public class PowerOfThree {
    public static boolean powerOfThree(int a) {
        /*
        метод должен вернуть ответ - является -ли заданое число (a) степенью тройки
         */
        //System.out.println(a);

        if (Objects.isNull(a) || a < 0 || a == 2){
            return false;
        }

        else {
            int i = 0;
            while ( a>2 ) {
                i = i + a % 3;
                a = a / 3;
                }
            return i == 0 & a == 1;
        }
    }

    public static void main(String[] arg) {
        System.out.println(powerOfThree(33));
    }
}

