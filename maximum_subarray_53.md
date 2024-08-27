# Intuition
By Using KADANE'S ALGORTIHM 
# Approach
1) Add every elemenmt in the array to sum.
2) If sum is negative dont take it make the sum=0.
3) If the sum we have is positive sum carry it forward.
# Complexity
- Time complexity:
$$O(n)$$

- Space complexity:
 $$O(1)$$

# Code
```java []
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;
        }
        return maxi;
    }
}
```