# Pascal's Triangle Generation

## Approach

The steps to generate Pascal's Triangle are as follows:

1. First, we run a loop (let's call it `row`) from 1 to `n`.
2. Inside the loop, we call a `generateRow()` function and add the returned list to our final answer. Inside this function, we do the following:
   1. Store the first element (i.e., 1) manually.
   2. Use another loop (let's call it `col`) that runs from 1 to `row-1` to store the rest of the elements.
   3. Inside this loop, we use the specified formula to compute the element: we multiply the previous element by `(row - col)` and then divide it by `col`.
   4. The entire row is stored and returned.
3. Finally, we return the list of rows as our answer.

## Java Code Implementation

```java
import java.util.ArrayList;
import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= n; row++) { // this loop takes O(N) time 
            ans.add(generateRow(row));       // generateRow function takes O(N) time; together they make O(N^2) time complexity
        }
        return ans;
    }

    public static List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> Ans = new ArrayList<>();
        Ans.add(1);
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            Ans.add(ans);
        }
        return Ans;
    }

    public static void main(String[] args) {
        PascalTriangle solution = new PascalTriangle();
        int n;  // Number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows to be printed: ");
        n = sc.nextInt();
        System.out.println();
        List<List<Integer>> result = solution.generate(n);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
        sc.close();
    }
}
```
 TIME COMPLEXITY : O(N^2) 
 SPACE COMPLEXITY : O(1)
 
