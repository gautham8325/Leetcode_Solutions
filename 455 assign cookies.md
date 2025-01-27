# Intuition

The problem involves distributing cookies to children such that the maximum number of children are content. Each child has a greed factor, and each cookie has a size. A child will be content if they receive a cookie that is at least as large as their greed factor.

## Approach

1. Sort both the greed factors of the children and the sizes of the cookies in ascending order.
2. Use two pointers to iterate through the sorted greed factors and cookie sizes.
3. For each child, check if the current cookie can satisfy their greed factor. If it can, move to the next child and the next cookie. If it cannot, move to the next cookie.
4. Count the number of children who are content.

## Complexity

- Time complexity:
  The time complexity is $$O(n \log n + m \log m)$$, where $$n$$ is the number of children and $$m$$ is the number of cookies. This is because we need to sort both arrays.

- Space complexity:
  The space complexity is $$O(1)$$, as we are using a constant amount of extra space.

## Code

```java []
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        /* int c=0;
        int j=0;
        for(int i=0;i<g.length;i++){
            for(;j<s.length;j++){
                if(s[j]>=g[i]){
                    c++;
                    j++;
                    break;
                }
            }
        } */
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++; //cookies given to children is counted 
            }
            j++;
        }
        return i;
    }
}
