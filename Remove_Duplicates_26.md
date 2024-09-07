# Intuition
Two Pointer Approach
# Approach
1) one pointer tracks the current array elements.
2) second pointer traverses the entire array.
3) 1st pointer keeps the track of uniquely represented elements in the array.
# Complexity
- Time complexity:
 $$O(n)$$

- Space complexity:
 $$O(1)$$ 

# Code
```java []
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }  
        }
        return i+1;
    }
}
```