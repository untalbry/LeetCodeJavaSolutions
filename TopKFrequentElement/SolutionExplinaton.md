# 347. Top K Frequent Elements
The top K frequent elements is a problem where we have to return the `K` frequent elements in an `array`. For this problem, we need to remember ´hashing´ again, because for this problem, we can hash every number, where the number is the key in a `Map` and the value is the frequency for that number.

So first we need to create a `Map`  : 

```Java 
Map<Intger, Integer> freqMap = new HashMap<>(); 
// Array for return the k frequent numbers
int[] KFrequent = new int[k]; 
```

After that, we need to think about how we are going to map the frequency, and for this, we can use the method `getOrDefault,` which is useful for setting a default value for a new key. We can increment it by one if it already has a value in this way. This we have to use it by looping over the `nums` array:

```Java
for (int freq : nums) {
    freqMap.put(freq, freqMap.getOrDefault(freq,0) + 1);
}
```

So, what this does is to assign a value for `freq`, which is the key of our map. The value we are going to assign is the current value plus one. If it does not have a value, it returns the default value, which in this case is `0`.
<br> 

Now, we need to remember that we can have the same frequency for more than one number. So, we need to collect all the numbers with the same frequency, regardless of how many numbers share that frequency. To achieve this, we define an `ArrayList` of `Integer ArrayList`:

```Java
ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
```
Before use it, we need to initialize with `new` empty `ArrayList` for each frequency: 

```Java
for(int i = 0; i<n; i++){
    list.add(new ArrayList<>());
}
```

Next, we can loop over the keys in the map, retrieve the value associated with each key (the frequency value), and add the key (the number) to the list at the position corresponding to the frequency value minus 1, ensuring the correct placement:

```Java
for(int i : freqMap.keySet()){
    int freq = freqMap.get(i);
    list.get(freq - 1).add(i);
}
```

And to conclude, we need to iterate over the `length` of `nums` and iterate over the `ArrayList` named `list`. I define a variable named index to keep track of how many elements I've stored in the array `KFrequent`. If it is less than `k`, we can store a value in the array; otherwise, we `return` the `KFrequent` array.

```Java
for (int i = n - 1; i >= 0; i--) {
    for (int j : list.get(i)) {
        if (index >= k)
            return KFrequent;
        KFrequent[index] = j;
        index++;
    }
}
return kFrequent
```




