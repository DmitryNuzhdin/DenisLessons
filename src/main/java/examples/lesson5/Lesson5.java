package examples.lesson5;

public class Lesson5 {
    private static double plus1(int toCount){
        System.out.println(toCount - 1000000);
        int[] array = new int[10000];
        array[0] = 1;
        if (toCount == 0) return 0;
        double other = plus1(toCount - 1);
        double out = 1 + other;
        return out;
    }

    public static void main(String[] args) {
        System.out.println(plus1(1000000));


    }
}
