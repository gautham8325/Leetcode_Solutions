#APPROACH:

**The steps are as follows:**

1)First, we will run a loop(say row) from 1 to n.
2)Inside the loop, we will call a generateRow() function and add the returned list to our final answer. Inside the function we will do the following:
3)First, we will store the 1st element i.e. 1 manually.
4)After that, we will use a loop(say col) that runs from 1 to n-1. It will store the rest of the elements.
5)Inside the loop, we will use the specified formula to print the element. We will multiply the previous answer by (row-col) and then divide it by col itself.
6)Thus, the entire row will be stored and returned.
7)Finally, we will return the answer list.
 
```Java:
import java.util.ArrayList;
import java.util.*;

class Pascaltriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++){        // this loop take O(N) time 
        ans.add(generaterow(row));            // generaterow function take take O(N) time together they make O(N^2) time complexity
        }
        return ans;
    }
    public static List<Integer> generaterow(int row){
                int ans=1;
            List<Integer> Ans =new ArrayList<>();
            Ans.add(1);
            for(int col=1;col<row;col++){
                ans=ans *(row-col);
                ans= ans/col;
                Ans.add((int)ans);
            }
            return Ans;
    }
    public static void main(String[] args) {
        Pascaltriangle solution = new Pascaltriangle();
        int n;  // Number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows to be printed: ");
        n=sc.nextInt();
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
 
