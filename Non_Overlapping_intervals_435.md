# Intuition
The problem can be approached using the greedy algorithm. The idea is to select the maximum number of non-overlapping intervals. By sorting the intervals based on their end times, we can ensure that we always consider the interval that finishes the earliest, thus leaving the most room for subsequent intervals.

# Approach
1. Sort the intervals based on their end times.
2. Initialize a counter `c` to 1 to include the first interval and a variable `k` to track the last included interval.
3. Iterate through the intervals, and for each interval, check if it starts after or when the last included interval ends.
4. If it does, increment the counter `c` and update `k` to the current interval.
5. Finally, return the total number of intervals minus the counter `c` to get the number of intervals to remove.

# Complexity
- Time complexity: $$O(n \log n)$$
  - Sorting the intervals takes $$O(n \log n)$$ time.
  - Iterating through the intervals takes $$O(n)$$ time.
- Space complexity: $$O(1)$$
  - We are using a constant amount of extra space.

# Code
```java
//Activity Selection Problem 
//Greedy Approach
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0; //initially return if length is zero 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1])); //compare 2nd elements
        int c = 1; //include first one
        int k = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[k][1]) {
                c++;
                k = i;
            }
        }
        return intervals.length - c; 
    }
}
