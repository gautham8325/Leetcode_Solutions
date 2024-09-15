# Intuition
Alternative indexing for positive and negative numbers.
# Approach
1) declare a resultant array to keep trak of the positive and negative elements.
2) we start arraing positive elements in the even indices and negative numbers in the odd indices.
3) if we get a positive number places it in the position and increment the value by 2 and similarly for the negative values.
# Complexity
- Time complexity: $$O(n)$$ 

- Space complexity: $$O(n)$$ 

# Code
```java []
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ans = new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}
```