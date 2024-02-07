# 49. Group Anagrams 
For this problem, we need to remember how we know for sure if a word is an anagram of another. To do that, we could gather all the letters in a word and sort them. If both of them have the same letters, they are anagrams of each other.
```Java
public static String anagram(String s) {
  char[] array = s.toCharArray();
  Arrays.sort(array);
  return new String(array);
}
```
So in our solution, we have to map all the words with a key. Our key is the word with sorted letters. So instead of just knowing if a word is an anagram of another, we are going to store the word in the value of its corresponding key

```Java
Map<String, List<String>> group = new HashMap();
String base = anagram(str);
if(!group.containsKey(base)){
  group.put(base, new ArrayList<>());
}
group.get(base).add(str);
```
And to finish, we just need to loop over the `String array` and verify each `String`: 

```Java
public List<List<String>> groupAnagrams(String[] strs) {
  Map<String, List<String>> group = new HashMap();
  for(String str: strs){
    String base = anagram(str);
    if(!group.containsKey(base)){
      group.put(base, new ArrayList<>());
    }
    group.get(base).add(str);
  }
  return new ArrayList<>(group.values());
}
```
This solution has a complexity of `O(n)`, where n is the length of the `String array`.
