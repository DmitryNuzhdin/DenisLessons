package tasks.Leetcode;

import java.util.Arrays;

public class task88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int flag = 0;
        for(int i = m; i < nums1.length; i++)
        {
            nums1[i] = nums2[flag];
            flag++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        //смотри, здесь начинается выполнение программы, это метод main
        //в нем идет вызов метода gcd с параметрами a и b
        //тоесть здесь ты можешь только менять a и b, а весь код пишешь выше, внутри public static int gcd ....
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
