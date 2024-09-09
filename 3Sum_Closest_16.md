# Intuition
Two Pointer Approach.
# Approach
- Declare a variable to store the value of the close sum.
-  Initially take the current looping element and low i.e i+1 and high i.e n-1 which contributes to the three integers sum .
- Iterate for each i element from low to high to check all the possible solutions.
- If we find the current sum is closest to the target value than the closest sum update the value of closest sum.
-  If the current sum is equal to the target value return the current sum or target value as the clsoest sum
- Else Increase the low value if current sum is lesser  than the target that need to be acheived .(Since we are given a sorted array.)
- Or Else lower the value of high in the other case.
# Complexity
- Time complexity:  $$O(n^2)$$

- Space complexity: $$O(1)$$


# Code
```java []
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int low= i+1;
            int high = n-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while(low<high){
                int curr_sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(target - curr_sum) < Math.abs(target - closestSum)){
                    closestSum = curr_sum;
                }
                if(curr_sum == target){
                    return curr_sum;
                }else if(curr_sum < target){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return closestSum;
    }
}
```