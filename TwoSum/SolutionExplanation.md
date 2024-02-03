# Two Sum

The "two sum" problem is a problem that consists of finding the two numbers that add up to the `target`.

For this solution I thought about: "How can I be sure that by adding 2 numbers I can find the target?" and the solution is quite simple but not obvious.

You just have to subtract the element `n` from the array with the target, if the array contains that number, we have found the two numbers.

```Java
    int complement = target - nums[i]; 
```

For this you must know about `HashMaps` again. This class has an method for return `true` if it contains the key. 

The key in a `HashMap` are hashed using their `hashCode` method. The hash code is an integer that represent the key and is used to determine the bucket location where the key-value pair will be stored. 

