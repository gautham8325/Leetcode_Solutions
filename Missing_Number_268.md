# Intuition
Maths logic , using Subtraction
# Approach
1) find the sum of all the elements upto n.
2) subtract it from the sum of the all the elements in the array 
3) you get missing number from the subtraction.
# Complexity
- Time complexity:
 $$O(n)$$

- Space complexity:
 $$O(1)$$

# Code
```java []
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x= n*(n+1);
        int y=x/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return y-sum;
    }
}
```