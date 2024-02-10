# 347. Top K Frequent Elements
The top K frequent elements is a problem where we have to return the `K` frequent elements in an `array`. For this problem, we need to remember ´hashing´ again, because for this problem, we can hash every number, where the number is the key in a `Map` and the value is the frequency for that number.

So first we need to create a `Map`  : 

```Java 
Map<Intger, Integer> freqMap = new HashMap<>(); 
// Array for return the k frequent numbers
int[] KFrequent = new int[k]; 
```

After that, we need to think about how we are going to map the frequency, and for this, we can use the method `getOrDefault,` which is useful for setting a default value for a new key. We can increment it by one if it already has a value in this way:

```Java
freqMap.put(freq, freqMap.getOrDefault(freq, 0) + 1); 
```

So, what this does is to assign a value for `freq`, which is the key of our map. The value we are going to assign is the current value plus one. If it does not have a value, it returns the default value, which in this case is `0`.
yes 


