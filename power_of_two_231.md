# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
 Here iam using bit Manipulation
# Approach
<!-- Describe your approach to solving the problem. -->
1) Firstly we observe that all squares of two are in the form of (1,10,100,1000,10000,....).
2) Secondly after subtracting the n with power of two number gives all 1's in its digits
3) Now we perform bit-wise and operator to check it. if we get a zero then it is a number of power of two.
# Complexity
- Time complexity:
 $$O(1)$$ 

- Space complexity:
$$O(1)$$

# Code
```java []
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n & (n-1))==0;
    }
}
```
