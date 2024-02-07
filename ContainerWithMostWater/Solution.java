package ContainerWithMostWater;

public class Solution {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    //Runtime: 2ms | Memory: 58.09mb
    public static int maxArea(int[] height){
        int left = 0; 
        int right = height.length -1; 
        int max= 0; 
        while(left<right){ 
            int minHeight = Math.min(height[left] ,  height[right]);
            int area = minHeight * (right-left);
            if(area> max){    
                max =  area; 
            }
            while(left<right && height[left] <= minHeight){
                left++;
            }
            while (left<right && height[right]<= minHeight) {
                right--; 
            }
        }
        return max; 
    }
    
}