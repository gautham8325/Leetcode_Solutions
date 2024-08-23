# Majority Element 169 

Problem is done using moore's Algorithm 
 ## Approach:
  1. Firstly initialise a variable count=0, which check for the majority element count
  2. initially if count is zero we initialize the element with the stating element
  3. Now increse the count if we get a similar match with majority element and decrese the count if not matched.
  4. this way we get the majority element using moore's algorithm
## Java Code Implementation:
 ```java:
import java.util.*;
public class Majority_Element_169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result= majortiyElement(arr);
        System.out.println(result);
        sc.close();
    }
    public static int majortiyElement(int [] arr){
        int count=0;
        int element=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(count == 0){
                element=arr[i];
                count++;
            }else if(arr[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}
```
 Time complexity : O(N)
 Space Complexity : O(1)
