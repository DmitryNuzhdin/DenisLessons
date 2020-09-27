package tasks.Leetcode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//Given two strings s and t , write a function to determine if t is an anagram of s.
public class task242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        else {
            Map<String, Integer> sMap = new HashMap<>();
            Map<String, Integer> tMap = new HashMap<>();

            String[] sArray = s.split("");
            String[] tArray = t.split("");

            for (int k = 0; k <= s.length() - 1; k++) {
                sMap.merge(sArray[k], 1, Integer::sum);
            }

            for (int k = 0; k <= t.length() - 1; k++) {
                tMap.merge(tArray[k], 1, Integer::sum);
            }

            return sMap.equals(tMap);
            }
        }
    public static void main(String[] args) {
        System.out.println(isAnagram("anrgram", "nagaram"));
    }
}
