package validanagram;

public class Solution {
    //| RunTime : 3 ms | Memory: 43.3 MB
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] lettersMap = new int[26];
        for(char c: s.toCharArray()){
            lettersMap[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            lettersMap[c - 'a']--;
        }
        for(int i: lettersMap){
            if(i!=0)return false;
        }
        return true;

    }
}
