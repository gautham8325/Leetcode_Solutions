# Intuition
By checking the no of possible values for each digit

# Approach
1) for odd digit we have 4 values 
2) for even digit we have 5 values
3) in this way we get more time comlexity 
4) so we use power function to acheive thsi problem.

# Complexity
- Time complexity:
$$O(n)$$

- Space complexity:
$$O(1)$$

# Code
```java []
class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; 
        long oddCount = n / 2;        

        long evenPower = modPow(5, evenCount, MOD);
        long oddPower = modPow(4, oddCount, MOD);

        return (int) ((evenPower * oddPower) % MOD);
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}

```