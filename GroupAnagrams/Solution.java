package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    // Runtime: 6 ms | Memory: 47.83 MB
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap();
        for(String str: strs){
            String base = anagram(str);
            if(!group.containsKey(base)) group.put(base, new ArrayList<>());
            group.get(base).add(str);
        }
        return new ArrayList<>(group.values());
    }

    public static String anagram(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);

    }
}
