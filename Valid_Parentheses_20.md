# Intuition
Using STACK.
# Approach
Firstly we need to loop through each string character
Now initially if the initial character is opening bracket then push to the stack
else if it is the closing bracket the check for the top of the element , if there is no element then return false ,if not then check for top element , if the top element matches with its pair then pop the the pair.
Once all the string is traversed and there is unmatch found then the string is a valid parentheses.
# Complexity
- Time complexity: $$O(n)$$

- Space complexity: $$O(1)$$ 

# Code
```java []
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
```