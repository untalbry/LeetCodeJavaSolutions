# Valid Anagram Solution

A anagram is a word formed by rearranging the letters in other word, using all the original letters exactly once. 
Here are some examples :

1. `lisent -> silent `

Saying that, we can already thing in some conditions for identify an anagram, like for example that bouth of them must have the same length otherwise they are not anagram:

```Java
if(s.length() != s.length()) return false;
```

Now, for the next step, we can create an array of 26 elements (because there are 26 letters in the English alphabet), to store the letters that are in the word.<br>
To know where we need to store, we have to think about how Java represents characters. The answer to this is that Java uses `Unicode`. <br> 

Each letter has a value, so we can do a subtraction of `'a'` and a letter from the word, that can give us a unique position to store that letter. So by adding 1 in a field of the array we can represent the frequency of appearance of each word.

``` Java
    int[] lettersMap = new int[26];
    for(char c: s.toCharArray()){
        lettersMap[c - 'a']++;
    }
```
We can do the same for the other word but, we can do the opposite of the before case. Instead of adding 1 we can subtract 1.

``` Java
    for(char c: t.toCharArray()){
        lettersMap[c - 'a']--;
    }

```
If adding and subtracting in each loop gives us a value of `'0'` in the array, it means that both words have the same amount of that letter; otherwise the words are not anagrams of each other.

 ```Java
    for(int i: lettersMap){
        if(i!=0)return false;
    }
 ```
This solution has a time complexity of `O(n+m)` for each letter in each word. 
