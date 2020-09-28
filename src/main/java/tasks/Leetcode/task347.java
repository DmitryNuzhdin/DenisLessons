package tasks.Leetcode;
import java.util.*;

//Given a non-empty array of integers, return the k most frequent elements.

public class task347 {
    public static Object[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList();
        Integer maxCount = 0;
        Map<Integer, Integer> iMap = new HashMap<>();
        for (int num : nums) {
            iMap.merge(num, 1, Integer::sum);
        }
        //System.out.println(iMap);

        for(Integer key: iMap.values())
            if (key > maxCount) {
                maxCount = key;
            }

        //System.out.println(maxCount);

        ArrayList<LinkedList<Integer>> iList= new ArrayList<>(maxCount+1);
        for (int i = 0; i <= maxCount+1; i++){
            iList.add(i, new LinkedList());
        }

        iMap.forEach((key, value) -> iList.get(value).add(key));


        for (int j = maxCount+1; j >= 0; j--){
            for (Integer l : iList.get(j)) {
                if (k > 0 ) {
                    res.add(l);
                    k--;
                }

            }
        }
        //System.out.println(res);
        return res.toArray();
    }


    public static void main(String[] args) {
        int[] num = {1,3,2,2,2,3,4,4,4,4,4,0};
        System.out.println(Arrays.toString(topKFrequent(num, 3)));
    }
}
