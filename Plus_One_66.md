# Intuition
Basic of math that add the numbers from the right.
# Approach
For example if u get 9 at the end we get 10 right we take only 0 as the sum and 1 as carry.
# Complexity
- Time complexity:
$$O(n)$$ 

- Space complexity:
$$O(n)$$ 

# Code
```java []
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ans= new ArrayList<>();
        int n=digits.length;
        int carry=1; //since adding 1 at the last
        for(int i=n-1;i>=0;i--){
            int sum =digits[i] + carry;
            ans.add(0,sum%10);
            carry = sum/10;
        }
        if(carry>0){
            ans.add(0,carry);
        }
        int [] res = new int [ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
```