# JumpGame II leetcode_45

## Introduction
This project implements a solution for the "Jump Game II" problem, where the goal is to determine the minimum number of jumps required to reach the last index in an array of integers.

## Problem Statement
You are given an array of integers `nums` where each element represents the maximum number of steps you can jump forward. You need to find the minimum number of jumps to reach the last index, starting from the first index. 

### Example:
Input: `nums = [2, 3, 1, 1, 4]`  
Output: `2`  
Explanation: The minimum number of jumps to reach the last index is `2`. Jump 1 step from index 0 to 1, then 3 steps to the last index.

## Approach
1. Initialize a pointer `i` to traverse the array and a `count` to store the number of jumps.
2. Iterate over the array, checking the maximum reachable index from the current position.
3. If from the current position, you can directly jump to the end of the array, increase the `count` and break.
4. Otherwise, calculate the farthest position you can jump to from any of the next possible positions.
5. Update the current position to this new farthest point and increase the jump count.
6. Repeat the process until you reach the last index.

## Code

```java
class Solution {
    public int jump(int[] nums) {
        int i = 0;
        int count = 0;
        int n = nums.length;
        while (i != n - 1) {
            if (i + nums[i] >= n - 1) { 
                count++;
                break;
            }
            int maxReached = 0;
            int nextPos = 0;
            for (int j = i + 1; j <= i + nums[i] && j < n - 1; j++) {
                if (j + nums[j] > maxReached) {
                    maxReached = j + nums[j];
                    nextPos = j;
                }
            }
            i = nextPos; 
            count++;
        }
        return count;
    }
}
