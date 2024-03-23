package twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // | RunTime : 2 ms | Memory: 44.45MB, complexity : O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[] { complementMap.get(complement), i };
            }
            complementMap.put(nums[i], i);
        }
        return new int[] { 0, 0 };

    }
}
