# Intuition

The problem involves adding two integers without using the `+` or `-` operators. The first thought is to use bitwise operations to achieve this, as they allow us to manipulate individual bits directly.

## Approach

1. **Bitwise AND (`&`)**: This operation is used to calculate the carry. When both bits are 1, the result is 1, indicating a carry.
2. **Bitwise XOR (`^`)**: This operation is used to calculate the sum of bits where at least one of the bits is not set. It effectively adds the bits without considering the carry.
3. **Left Shift (`<<`)**: This operation is used to shift the carry to the left by one position, so it can be added to the next higher bit.

The process is repeated until there is no carry left.

## Dry Run

Let's dry run the approach with an example: `a = 5` and `b = 3`.

1. Initial values: `a = 5` (binary `0101`), `b = 3` (binary `0011`).
2. Calculate carry: `c = a & b = 0101 & 0011 = 0001`.
3. Calculate sum without carry: `a = a ^ b = 0101 ^ 0011 = 0110`.
4. Shift carry left: `b = c << 1 = 0001 << 1 = 0010`.
5. Repeat steps 2-4 with new values: `a = 6` (binary `0110`), `b = 2` (binary `0010`).
6. Calculate carry: `c = a & b = 0110 & 0010 = 0010`.
7. Calculate sum without carry: `a = a ^ b = 0110 ^ 0010 = 0100`.
8. Shift carry left: `b = c << 1 = 0010 << 1 = 0100`.
9. Repeat steps 2-4 with new values: `a = 4` (binary `0100`), `b = 4` (binary `0100`).
10. Calculate carry: `c = a & b = 0100 & 0100 = 0100`.
11. Calculate sum without carry: `a = a ^ b = 0100 ^ 0100 = 0000`.
12. Shift carry left: `b = c << 1 = 0100 << 1 = 1000`.
13. Repeat steps 2-4 with new values: `a = 0` (binary `0000`), `b = 8` (binary `1000`).
14. Calculate carry: `c = a & b = 0000 & 1000 = 0000`.
15. Calculate sum without carry: `a = a ^ b = 0000 ^ 1000 = 1000`.
16. Shift carry left: `b = c << 1 = 0000 << 1 = 0000`.

Since `b` is now `0`, the loop terminates, and the final value of `a` is `8`, which is the sum of `5` and `3`.

## Complexity

- Time complexity:
  The time complexity is $$O(1)$$, as the number of iterations is limited by the number of bits in the integers (typically 32 or 64).

- Space complexity:
  The space complexity is $$O(1)$$, as we are using a constant amount of extra space.

## Code

```java []
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c = a&b;
            a = a^b;
            b=c<<1;
        }
        return a;
    }
}
```
