package tasks.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
       int i, k, j;
       i = m + n - 1;
       k = m - 1;
       j = n - 1;
       while (i > 0)
        {
            if (nums1[k] >= nums2[j]) {
                nums1[i] = nums1[k];
                nums1[k] = nums2[j];
                k = k - 1;
                i = i - 1;
            }
            else {
                nums1[i] = nums2[j];
                nums2[j] = nums1[k];
                j = j - 1;
                i = i - 1;
            }
        }

        return nums1;
    }
    public static void main(String[] args) {
        //смотри, здесь начинается выполнение программы, это метод main
        //в нем идет вызов метода gcd с параметрами a и b
        //тоесть здесь ты можешь только менять a и b, а весь код пишешь выше, внутри public static int gcd ....
        int[] nums1 = {20,21,24,25,0,0,0};
        int m = 4;
        int[] nums2 = {19,22,23};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }
}
