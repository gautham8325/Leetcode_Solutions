# Intuition

The idea is to use a stack to reverse the order of words in the string. By pushing each word onto the stack and then popping them off, you can reverse their order.

# Approach

1. **Initialize a Stack**: Use a stack to store the words.
2. **Iterate through the String**: Traverse the string character by character.
3. **Build Words**: Use a `StringBuilder` to build each word.
4. **Push Words to Stack**: When a space is encountered, push the word onto the stack and reset the `StringBuilder`.
5. **Handle Last Word**: After the loop, push the last word onto the stack if it exists.
6. **Build Result**: Pop words from the stack and append them to the result string, adding spaces between words.

# Complexity

- **Time complexity**: $$O(n)$$, where $$n$$ is the length of the string. Each character is processed once.
- **Space complexity**: $$O(n)$$, for storing the words in the stack and the result string.

# Code

```java
class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder eachstring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (eachstring.length() > 0) {
                    stack.push(eachstring.toString());
                    eachstring.setLength(0);
                }
            } else {
                eachstring.append(s.charAt(i));
            }
        }
        if (eachstring.length() > 0) {
            stack.push(eachstring.toString());
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
```
