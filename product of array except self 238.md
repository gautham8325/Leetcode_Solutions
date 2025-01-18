# Intuition

The goal is to compute the product of all elements in the array except for the current element, without using division. The first thought is to use two passes through the array to achieve this.

# Approach

1. **Initialize an array**: Create an array `res` to store the result, with the same length as the input array `nums`.
2. **First pass (left products)**: Iterate through the array from left to right, and for each element, store the product of all elements to its left in the `res` array.
3. **Second pass (right products)**: Iterate through the array from right to left, and for each element, multiply the current value in `res` by the product of all elements to its right.

# Complexity

- **Time complexity**: $$O(n)$$, where $$n$$ is the number of elements in the array. This is because we are iterating through the array twice.
- **Space complexity**: $$O(n)$$, as we are storing the result in an additional array of the same length as the input array.

# Code

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int rp = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rp;
            rp = rp * nums[i];
        }
        return res;
    }
}
