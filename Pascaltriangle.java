import java.util.ArrayList;
import java.util.*;

class Pascaltriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(generaterow(row));            
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