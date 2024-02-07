# Two Sum


Your explanation of the "two sum" problem and the approach you've outlined make sense. Here's a slightly revised version of your explanation for clarity:

The "two sum" problem involves finding two numbers in an array that add up to a given target sum.

One approach to solve this problem is to consider: "How can I be certain that by adding two numbers from the array, I can obtain the target?" The solution to this question is simple yet not immediately obvious.

You can achieve this by subtracting each element n from the array from the target. If the resulting value exists in the array, then we have found the two numbers that sum up to the target.


```Java
int complement = target - nums[i]; 
```

For this, you must know about `HashMaps` again. This class has a method to return `true` if it contains the key.

The `keys` in a `HashMap` are `hashed` using their `hashCode` method. The hash code is an integer that represents the key and is used to determine the bucket location where the key-value pair will be stored. So, we simply loop over the given `nums` array, subtracting each element and looking for the `complement` number with the method `containsKey`. If it returns `true`, we return a `new int array` with the position of the `complement index` and the iterator (`i`) value:

```Java
Map<Integer, Integer> complementMap = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
  int complement = target - nums[i];
  if (complementMap.containsKey(complement)) {
    return new int[]{complementMap.get(complement), i};
  }
  complementMap.put(nums[i], i);
}
return new int[]{0,0};
```
This solution has an `O(n)` complexity were `n` is the value of `nums.legth`. 
