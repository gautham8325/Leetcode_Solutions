# Using Hash Map

### Intuition

The goal is to find the length of the longest substring without repeating characters. The first thought is to use a data structure to keep track of the characters in the current substring.

### Approach

1. Use a `HashMap` to keep track of the characters and their positions in the current substring.
2. Traverse the string character by character.
3. For each character, check if it is already in the `HashMap`.
4. If it is, break the inner loop and start a new substring.
5. If it is not, add the character to the `HashMap` and update the maximum length of the substring.

### Complexity

- **Time complexity**: $$O(n^2)$$, where $$n$$ is the length of the string. We traverse the string for each starting position.
- **Space complexity**: $$O(n)$$, for the `HashMap`.

### Code

```java
import java.util.HashMap;
//Using Hash Map
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> ans = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                if (ans.containsKey(s.charAt(j))) {
                    break;
                } else {
                    ans.put(s.charAt(j), j);
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }
}
```
