# Intuition

The problem involves finding the minimum number of coins needed to make up a given amount. The first thought is to use a dynamic programming approach to solve this problem efficiently.

## Approach

1. **Dynamic Programming**: Create a `dp` array of size `amount + 1` and initialize it with a value greater than any possible number of coins (e.g., `amount + 1`). Set `dp[0] = 0` because no coins are needed to make the amount 0.
2. **Iterate through Coins**: For each coin, iterate through the `dp` array and update the minimum number of coins needed to make up each amount.
3. **Result**: If `dp[amount]` is still greater than `amount`, it means it's not possible to make that amount with the given coins, so return -1. Otherwise, return `dp[amount]`.

## Complexity

- Time complexity:
  The time complexity is $$O(n \times m)$$, where $$n$$ is the number of coins and $$m$$ is the amount. This is because we iterate through each coin for each amount.

- Space complexity:
  The space complexity is $$O(m)$$, where $$m$$ is the amount. This is because we use a `dp` array of size `amount + 1`.

## Code

```java []
class Solution {
    public int coinChange(int[] coins, int amount) {
        //greedy fails. 
        /*
        int n = coins.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins); // Sort the coins array
        for (int i = n - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                ans.add(coins[i]);
            }
        }
        int totalValue = 0;
        for (int i = 0; i < ans.size(); i++) {
            totalValue += ans.get(i);
        }
        if (totalValue == amount) {
            return ans.size();
        }
        return -1;
        */
        int max = amount+1;
        int [] dp = new int[max];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int coin : coins){
            for(int i=coin;i<=amount;i++){
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]==max?-1:dp[amount];
    }
}
```
