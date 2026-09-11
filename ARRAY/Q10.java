// Q10 — Move All Zeros to the End
// Given an integer array, move all 0s to the end while maintaining the relative order of non-zero elements.
// Do it in-place.
// Input:  [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]
// Target complexity: O(n) time and O(1) extra space.


import java.util.*;

public class Q10 {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the array size::");
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        
        System.out.println("enter the array elements::");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        int nonzero=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[nonzero]=arr[i];
                nonzero++;
            }
        }  
            for(int j=nonzero;j<n;j++){
                arr[j]=0;
            }
        

  System.out .println("array is after modification = "+Arrays.toString(arr));
 sc.close();
    }
}        