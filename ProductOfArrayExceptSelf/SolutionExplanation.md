# 238. Product of Array Except Self

To solve this problem with `O(n)` complexity, we need to loop over the given array. However, we can iterate in a different way.

We can traverse the `nums` array from left to right, multiplying its elements in parallel with an auxiliary array (`leftProducts`) and saving them in the next index of our auxiliary array.

```java
int[] leftProducts = new int[n];
leftProducts[0] = 1; // We need to initialize the first index in the array to 1 for our first multiplication

for (int i = 1; i < n; i++) {
    leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
}
```
In this iteration, we can ensure that we are multiplying, in the last index of leftProducts, all the numbers that are to the left of the last index of the nums array, except the last value of nums.

Now, for each position i, the cumulative product of all elements to the right of `nums[i]` is calculated. The resulting value is stored in `rightProducts[i]`. This is done by multiplying the next element (`nums[i + 1]`) by the previously accumulated product (`rightProducts[i + 1]`).

```Java
int[] rightProducts = new int[n];
rightProducts[n - 1] = 1; // We need to initialize the last index in the array to 1 for our first multiplication

for (int i = n - 2; i >= 0; i--) {
    rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
    leftProducts[i] *= rightProducts[i];
}

return leftProducts;
```
Finally, the array `leftProducts` is returned, which now contains the product of all elements except itself at each nums position.