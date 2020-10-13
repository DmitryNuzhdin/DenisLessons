package tasks.Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class task121 {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minVal = prices[0];
        int p = 0;
        for (int i = 0; i < prices.length-1; i++) {
            minVal = Math.min(minVal, prices[i]);
            p = Math.max(p, prices[i] - minVal);
        }
        return p;
    }

    public static void main(String[] args) {
        //смотри, здесь начинается выполнение программы, это метод main
        //в нем идет вызов метода gcd с параметрами a и b
        //тоесть здесь ты можешь только менять a и b, а весь код пишешь выше, внутри public static int gcd ....
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
