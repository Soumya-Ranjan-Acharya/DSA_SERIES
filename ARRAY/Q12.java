// Q12 — Left Rotate an Array by One Position
// Given an integer array, rotate the array to the left by one position.

// Example
// Input:  [1, 2, 3, 4, 5]
// Output: [2, 3, 4, 5, 1]

// Another example:
// Input:  [10, 20, 30]
// Output: [20, 30, 10]

// Constraints
// Modify the array in-place.
// Don't create another array.
// Target: O(n) time
// Target: O(1) extra space

import java.util.*;
public class Q12{
 public static void main(String s[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter array size::");
    int n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("enetr the array elements::");
   for(int  i=0;i<n;i++){
    a[i]=sc.nextInt();
   }

   int temp=a[0];
  
   for(int i=0;i<n-1;i++){
    a[i]=a[i+1];
   
   }
   a[n-1]=temp;

   System.out.println("final array is ========");
  for(int i=0;i<n;i++){
    System.out.println(a[i]);
    
   }

 sc.close();

}

}