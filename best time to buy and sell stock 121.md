# Intuition

The goal is to find the maximum profit that can be achieved by buying and selling a stock. The first thought is to keep track of the minimum price encountered so far and calculate the profit for each day by subtracting the minimum price from the current price. The maximum profit is updated whenever a higher profit is found.

# Approach

1. Initialize `maxprofit` to 0 and `min` to the first element of the prices array.
2. Traverse the prices array starting from the second element.
3. For each element at index `i`, calculate the current profit as `prices[i] - min`.
4. Update `maxprofit` with the maximum value between `currentprofit` and `maxprofit`.
5. Update `min` with the minimum value between `min` and `prices[i]`.
6. Return `maxprofit` after traversing the entire array.

# Complexity

- **Time complexity**: $$O(n)$$, where \(n\) is the length of the input array `prices`. This is because we traverse the array once.
- **Space complexity**: $$O(1)$$, as we are using only a constant amount of extra space.

# Code

```java []
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            int currentprofit = prices[i] - min;
            maxprofit = Math.max(currentprofit, maxprofit);
            min = Math.min(min, prices[i]);
        }
        return maxprofit;
    }
}
