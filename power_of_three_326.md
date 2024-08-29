# Intuition
By Division Approach.

# Approach
1) check whether the number is exactly divisible by 3 or not
2) if it is divisible then divithe the number by 3.
3) lastly if we get n=1 then the number is power of 3 or elase it is not.
# Complexity
- Time complexity: $$O(1)$$

- Space complexity: $$O(1)$$
# Code
```java []
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
```