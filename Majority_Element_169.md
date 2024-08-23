# Majority Element (LeetCode 169)

The problem is solved using Moore's Voting Algorithm.

## Approach

1. **Initialize a count**: Start with a variable `count = 0`, which will track the count for the majority element.
2. **Track potential majority element**: If `count` is zero, initialize the majority element with the current element.
3. **Count the occurrences**:
   - Increase `count` if the current element matches the majority element.
   - Decrease `count` if the current element does not match.
4. **Determine the majority element**: After iterating through the array, the candidate element will be the majority element.

## Java Code Implementation

```java
import java.util.*;

public class Majority_Element_169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = majorityElement(arr);
        System.out.println(result);
        sc.close();
    }

    public static int majorityElement(int[] arr) {
        int count = 0;
        int element = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(count == 0) {
                element = arr[i];
                count++;
            } else if(arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
```
 Time complexity : O(N)
 Space Complexity : O(1)
