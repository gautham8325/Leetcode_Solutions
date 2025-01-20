# Intuition

The problem is to find the contiguous subarray within a one-dimensional array of numbers which has the largest product. The first thought is to iterate through the array and keep track of the maximum and minimum products encountered so far.

# Approach

1. Initialize three variables: `ans` to store the maximum product found, `max_pro` to keep track of the maximum product ending at the current position, and `min_pro` to keep track of the minimum product ending at the current position.
2. Start iterating from the second element of the array.
3. For each element, if the element is negative, swap `max_pro` and `min_pro`. This step ensures that the maximum product is correctly updated when a negative number is encountered.
4. Update `max_pro` to be the maximum of the current element itself or the product of the current element and `max_pro`.
5. Update `min_pro` to be the minimum of the current element itself or the product of the current element and `min_pro`.
6. Update `ans` if `max_pro` is greater than `ans`.
7. Return `ans` as the result.

# Complexity

- Time complexity: $$O(n)$$, where $$n$$ is the length of the array. We only iterate through the array once.
- Space complexity: $$O(1)$$, as we are using a constant amount of extra space.

# Code

```java
class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max_pro = nums[0];
        int min_pro = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = min_pro;
                min_pro = max_pro;
                max_pro = temp;
            }
            max_pro = Math.max(nums[i], max_pro * nums[i]);
            min_pro = Math.min(nums[i], min_pro * nums[i]);
            ans = Math.max(ans, max_pro);
        }
        return ans;
    }
}

