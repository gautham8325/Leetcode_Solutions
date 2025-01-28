# Intuition

The problem involves merging overlapping intervals. The first thought is to sort the intervals based on their starting times, which makes it easier to identify and merge overlapping intervals.

## Approach

1. Sort the intervals based on their starting times.
2. Initialize a list to store the merged intervals.
3. Iterate through the sorted intervals and compare the current interval with the previous one.
4. If the current interval overlaps with the previous one, merge them by updating the end time of the previous interval.
5. If the current interval does not overlap, add the previous interval to the merged list and update the previous interval to the current one.
6. Add the last interval to the merged list.

## Complexity

- Time complexity:
  The time complexity is $$O(n \log n)$$, where $$n$$ is the number of intervals. This is because we need to sort the intervals.

- Space complexity:
  The space complexity is $$O(n)$$, where $$n$$ is the number of intervals. This is because we need to store the merged intervals.

## Code

```java []
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int [] > merged = new ArrayList<>();
        int [] prev = intervals[0]; 
        for(int i=1;i<intervals.length;i++){
            int [] arr = intervals[i];
            if(prev[1]>=arr[0]){
                prev[1] = Math.max(prev[1],arr[1]);
            }else{
                merged.add(prev);
                prev = arr;
            }
        }
        merged.add(prev);
        return merged.toArray(new int [merged.size()][]);
    }
}
```
