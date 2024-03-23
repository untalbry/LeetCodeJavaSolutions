package trappingrainwater;

public class Solution {
    public static void main(String[] args) {
        int[] height = new int[] {5,4,1,2};
        System.out.println(trap(height));
    }
    //Runtime 1ms | Memory: 46.52mb
    public static int trap(int[] height) {
        int left =  0, right = height.length -  1;
        int maxLeft =  0, maxRight =  0; 
        int water =  0;
    
        while (left < right) {
            if (height[left] < height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
                right--;
            }
        }
    
        return water;
    }

}