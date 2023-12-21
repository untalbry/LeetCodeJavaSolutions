package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    // Runtime: 1537 ms | Memory: 47.22 MB
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        List<String> strsList = new ArrayList<>(Arrays.asList(strs));
        if (strs != null && strs.length == 0) {
            group.add(List.of(""));
            return group;
        }
        while (!strsList.isEmpty()) {
            String currentWord = strsList.get(0);
            List<String> anagramsList = strsList.stream()
                    .filter(word -> isAnagram(word, currentWord))
                    .collect(Collectors.toList());
            group.add(anagramsList);
            strsList.removeAll(anagramsList);
        }

        return group;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] lettersMap = new int[26];
        for (char c : s.toCharArray()) {
            lettersMap[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            lettersMap[c - 'a']--;
        }
        for (int i : lettersMap) {
            if (i != 0)
                return false;
        }
        return true;

    }
}
