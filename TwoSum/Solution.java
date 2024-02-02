package TwoSum;

public class Solution {
    // | RunTime : 0 ms | Memory: 44.45MB
    public int[] twoSum(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        for (; leftPointer < nums.length / 2; leftPointer++) {
            if (nums[leftPointer] + nums[rightPointer] == target) {
                return new int[] { leftPointer, rightPointer };
            }
            for (int j = leftPointer + 1; j < rightPointer; j++) {
                if (nums[leftPointer] + nums[j] == target) {
                    return new int[] { leftPointer, j };
                }
                if (nums[j] + nums[rightPointer] == target) {
                    return new int[] { j, rightPointer };
                }
            }
            rightPointer--;
        }
        return new int[] { 0, 0 };

    }
}
