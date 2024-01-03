<h1>347. Top K Frequent Elements</h1>

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in <strong>any order</strong>.

#### Example 1
Input: nums = `[1,1,1,2,2,3], k = 2`
Output: `[1,2]`

#### Example 2
Input: nums = `[1], k = 1`
Output: `[1]`

#### Constraints: 

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`
- `k` is in the range `[1, the number of unique elements in the array]`
- it is <strong>guaranteed</strong> that the answer is <strong>unique</strong>