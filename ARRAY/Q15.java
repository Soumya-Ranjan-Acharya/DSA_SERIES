// Arrays — Q15 / 20
// Q15 — Find the Largest Difference Between Two Elements
// Given an integer array, find the maximum difference arr[j] - arr[i] such that:
// i < j
// In other words, the smaller element must appear before the larger element.
// Example 1
// Input:  [2, 3, 10, 6, 4, 8, 1]
// Output: 8
// Because:
// 10 - 2 = 8
// Example 2
// Input:  [7, 1, 5, 3, 6, 4]
// Output: 5
// Because:
// 6 - 1 = 5
// Example 3
// Input: [10, 8, 6, 4, 2]
// Output: -2
// The array is continuously decreasing, so the best possible difference while maintaining i < j is 2 - 4 = -2.
// Requirements
// Don't sort the array.
// Don't use another array.
// Target: O(n) time
// Target: O(1) extra space
// Hint
// As you move from left to right, keep track of the smallest element seen so far.
// Then for every current element, ask:
// current element - smallest element so far


import java.util.*;
public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
      int min=a[0];
      int diff_max=Integer.MIN_VALUE;
     
      for(int j=1;j<n;j++){
         int diff=a[j]-min;
         if(diff_max<diff){
           diff_max=diff;

         }
         if(a[j]<min){
            min=a[j];
         }
        
      }

System.out.println("max_difference is = " +diff_max);


sc.close();
    }
}    
































































