package algorithm;

import java.util.HashMap;
import java.util.Map;
//using the space to exchange the time ,hashmap store the data and then the complement can be find quickly
public class FindRepeatNum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4};
        nums = twoSum(nums,6);
    }




}