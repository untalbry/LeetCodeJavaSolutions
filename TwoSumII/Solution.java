package TwoSumII;
public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[] { -3,3,4,90};
        int[] solution = twoSum(numbers, 0);
        for (int i : solution) {
            System.out.print("[" + i + "]");
        }
    }
      // | RunTime : 3 ms | Memory: 42.84 MB
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{};
    }
}