# Intuition
Two Pointer Approach 
# Approach
 If i find the element equal to value i just swapped with the last element of the array .
# Complexity
- Time complexity:
O(N)
- Space complexity:
O(1)
# Code
```java []
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int end=n-1;
        while(i<=end){
            if(nums[i]==val){
                swap(nums, i, end);
                end--;
            }else{
                i++;
            }
        }
        return end+1;
    }
    private void swap(int[] nums, int i, int end) {
        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;
    }
}
```