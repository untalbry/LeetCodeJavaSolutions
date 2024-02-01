package ProductOfArrayExceptSelf;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] { 1,1};
        int[] product = productExceptSelf(nums);
        printArray(product);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] leftProducts = new int[n];
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        int[] rightProducts = new int[n];
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
            leftProducts[i] *= rightProducts[i]; 
        }
        
        return leftProducts;
    }



}
