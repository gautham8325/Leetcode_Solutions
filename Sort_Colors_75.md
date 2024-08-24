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
# Optimal Approach

## Intuition
Using Dutch National Flag Algorithm

## Approach
The steps will be the following:

First, we will run a loop that will continue until mid <= high.
There can be three different values of mid pointer i.e. arr[mid]
If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
Finally, our array should be sorted.

## Code:
```java []
    class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }else if(nums[mid]==2){
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }else{
                mid++;
            }
        }
    }
}
```