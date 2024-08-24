# BruteForce Approach
### Intuition
    Use of Inbuilt functions.
### Approach
    here i have used Arrays.sort(); functions to sort 
### Complexity
- Time complexity:
    O(NlogN)
- Space complexity:
    O(1)
## Code
```java []
import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
```

# Better Approach
### Intuition
Counting and Replacing

### Approach
counting number of 0's,1's,2's and replacing them in the original places.

### Complexity
- Time complexity:
O(N)

- Space complexity:
O(1)

# Code
```java []
import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c1,c2,c3;
         c1=c2=c3=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) c1++;
            else if(nums[i]==1) c2++;
            else c3++;
        }
        for(int i=0;i<c1;i++) nums[i]=0;
        for(int i=c1;i<c1+c2;i++) nums[i]=1;
        for(int i=c1+c2;i<n;i++) nums[i]=2;
    }
}
```
