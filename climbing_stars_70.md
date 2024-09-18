# Intuition
recusive approach turned into dynamic programming.
# Approach
1) store the value that are required to climb the specific number of steps in the dynamic array .
2) we will tracking ways we require to climb the stair in either 1 or 2 ,in both ways .
# Complexity
- Time complexity:
 $$O(n)$$ 

- Space complexity:
$$O(n)$$ 

# Code
```java []
class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        return dp(n-1)+dp(n-2);
    }
    public  int  dp(int n){
        if(n==1 || n==0){
            return 1;

        }
        int [] dp = new int [n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
```