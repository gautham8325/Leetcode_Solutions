# Intuition

The problem requires us to find a target value in a rotated sorted array. A rotated sorted array means that some portion of the array has been shifted to the end while maintaining the sorted order. The key insight is to use binary search to efficiently locate the target value.

## Approach

1. Initialize two pointers, `low` and `high`, to the start and end of the array, respectively.
2. Use a while loop to perform binary search while `low` is less than or equal to `high`.
3. Calculate the midpoint `mid` of the current range.
4. If the value at `mid` is equal to the target, return `mid`.
5. Determine which part of the array is sorted:
   - If `nums[low] <= nums[mid]`, the left part is sorted.
     - Check if the target lies within this sorted part. If yes, adjust `high` to `mid - 1`. Otherwise, adjust `low` to `mid + 1`.
   - Otherwise, the right part is sorted.
     - Check if the target lies within this sorted part. If yes, adjust `low` to `mid + 1`. Otherwise, adjust `high` to `mid - 1`.
6. If the target is not found, return -1.

## Complexity

- Time complexity: $$O(\log n)$$
  - The binary search algorithm reduces the search space by half in each iteration, leading to a logarithmic time complexity.
- Space complexity: $$O(1)$$
  - The algorithm uses a constant amount of extra space.

## Code

```java
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
