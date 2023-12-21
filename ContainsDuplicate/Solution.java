package ContainsDuplicate;

import java.util.HashSet;

public class Solution {
    //| RunTime : 8 ms | Memory: 55 MB
    public boolean containsDuplicate(int[] nums){
         HashSet<Integer> numbers = new HashSet<>();
       for(int num: nums){
           if(!numbers.add(num)){
               System.gc();
               return true;
           }
       }
        return false; 
    }
}
