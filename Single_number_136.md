# Intuition
XoR approach 
# Approach
1) XOR of Two similar numbers is always zero 
2) XOR of any number with zero is the number it self.
3) Since here we have each number repeated only twice they become zero upon xor and only the remaining element is our answer.
# Complexity
- Time complexity:
$$O(n)$$

- Space complexity:
 $$O(1)$$ 

# Code
##### Optimal Approach
```java []
import java.util.*;
public class Solution {
    public static int singleNumber(int []arr) {
        int n = arr.length;
        int ans=0;
       for(int i =0;i<n;i++){
        ans = ans^arr[i];
       }
        return ans;
    }
}
```

# Code
##### Better Approach using HashMap.
```java []
import java.util.*;
public class Solution {
    public static int singleNumber(int []arr) {
        int n = arr.length;
        HashMap<Integer,Integer> kvp = new HashMap<>();
        for(int i=0;i<n;i++){
            int value =kvp.getOrDefault(arr[i],0);
            kvp.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it : kvp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}
```
# Code
##### Brute Force Approach
```java [ ]
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int element = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            if (c == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}
```