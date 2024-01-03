import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] KFrequent = new int[k];
        int index = 0;

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int freq : nums) {
            freqMap.put(freq, freqMap.getOrDefault(freq, 0) + 1);
        }
        for (int i : freqMap.keySet()) {
            int freq = freqMap.get(i);
            list.get(freq - 1).add(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j : list.get(i)) {
                if (index >= k)
                    return KFrequent;
                KFrequent[index] = j;
                index++;
            }
        }
        return KFrequent;
    }

}