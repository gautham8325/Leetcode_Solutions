# Intuition
1) ### Rotational Sorted Array:
     In a sorted array that has been rotated, there will be at most one point where an element is greater than the next element. For example:

    [3, 4, 5, 1, 2]: Here, 5 > 1 is the only point where the order breaks.
    [1, 2, 3, 4, 5]: A non-rotated sorted array with no breaks.
2) ### Circular Indexing: 
    To handle the array as if it is circular, when checking if nums[i] > nums[i+1], we use (i + 1) % n to wrap around the index when i is at the last element.
# Approach
1) ### Initialize Counter: 
    Start with a counter count set to 0, which will keep track of how many times the current element is greater than the next element.

2) Traverse the Array:

- Loop through each element in the array.
- For each element nums[i],
 check if it is greater than the next element nums[(i + 1) % n] (using modulo n to handle the circular nature).
- If nums[i] > nums[(i + 1) % n], increment the counter count.
3) ### Check Condition: 
    After looping through the entire array, if count is less than or equal to 1, the array can be sorted by rotating it. This is because there is at most one point where the array order breaks.
# Complexity
- Time complexity:
 $$O(N)$$

- Space complexity:
 $$O(1)$$

# Code
```java []
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                c++;
            }
        }
        return c<=1;
    }
}
```