package longuestPalindromSubstring;

public class Solution {
    /*
     * Given a string s, return the longest palindromic substring in s.
     * 
     * Example 1:
     * 
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * 
     * Example 2:
     * Input: s = "cbbd"
     * Output: "bb"
     * 
     * 
     * Constraints:
     * 
     * 1 <= s.length <= 1000
     * s consist of only digits and English letters.
     */

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aada"));
    }

    public static String longestPalindrome(String s) {
        System.out.println(isPalindrome(new StringBuilder(s)));
        StringBuilder longest = new StringBuilder(s.charAt(0));

        return "";
    }

    public static boolean isPalindrome(StringBuilder s) {
        StringBuilder sr = new StringBuilder(s.reverse());
        s.reverse();
        System.out.println(s + "?=" + sr);
        return compare(s, sr);
    }

    public static boolean compare(StringBuilder one, StringBuilder two) {
        if (one.length() != two.length())
            return false;
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(i))
                return false;
        }
        return true;
    }
}