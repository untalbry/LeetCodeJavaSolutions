package LongesConsecutiveSequence;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {};
        System.out.println(longestConsecutive(nums));
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int value : nums) {
            set.add(value);
        }
        int maxSequence = 1;
        for (int value : set) {
            if (!set.contains(value - 1)) {
                int currentNum = value;
                int currentSequence = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSequence += 1;
                }
                maxSequence = Math.max(maxSequence, currentSequence);
            }
        }
        return maxSequence;
    }
}
