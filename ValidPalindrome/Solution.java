package ValidPalindrome;


public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
      // | RunTime : 3 ms | Memory: 42.84 MB
    public static boolean isPalindrome(String s){
        if(s == null || s.isEmpty()) return true; 
        s = s.toLowerCase(); 
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--; 
        }
        
        return true;
    }
    
}