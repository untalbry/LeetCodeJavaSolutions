# 49. Group Anagrams 
For this problem we need to rememver how we know for sure if a word is anagram of another. 
To do that could get all the letters in a word and sorted, if bouth of them had the same letters, they are anagram of each other. 
```Java
public static String anagram(String s) {
  char[] array = s.toCharArray();
  Arrays.sort(array);
  return new String(array);
}
```
Soo in our solution we have to map all the words, with a key. Our key is the word with sorted letters. So insted of just knowing if a word is an anagram of an other
we know going to store the word in the value of his corresponded key: 

```Java
Map<String, List<String>> group = new HashMap();
String base = anagram(str);
if(!group.containsKey(base)){
  group.put(base, new ArrayList<>());
}
group.get(base).add(str);
```
And to finish we just need to loop over the `String's` array an verify each `String` 

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
