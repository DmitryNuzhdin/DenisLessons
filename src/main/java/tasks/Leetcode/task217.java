package tasks.Leetcode;
import java.util.HashSet;

//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//Example 1:
//Input: [1,2,3,1]
//Output: true

public class task217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet h = new HashSet();
        for (int k = 0; k <= nums.length - 1; k++) {
            int i = nums[k];
            if (h.contains(i)) {
                return true;
            } else {
                h.add(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(containsDuplicate(nums));
    }
}
