# Intuition

The goal is to determine if there are any duplicate elements in the array. The first thought is to use a data structure that allows for quick lookups to keep track of the elements we've seen so far.

# Approach

1. **Use a HashMap**: Create a `HashMap` to store each number and its count.
2. **Iterate through the array**: For each number in the array, check if it already exists in the `HashMap` with a count of 1 or more.
3. **Return true if duplicate found**: If a duplicate is found, return `true`.
4. **Update the HashMap**: If the number is not a duplicate, add it to the `HashMap` or update its count.

# Complexity

- **Time complexity**: $$O(n)$$, where $$n$$ is the number of elements in the array. This is because we are iterating through the array once.
- **Space complexity**: $$O(n)$$, as we are storing up to $$n$$ elements in the `HashMap`.

# Code

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i : nums){
            if( map.containsKey(i)){
                return true;
            }
            map.put(i,1);
        }
        return false;
    }
}
