// Q13 — Right Rotate an Array by One Position

// Given an integer array, rotate the array to the right by one position.
// Example 1
// Input:  [1, 2, 3, 4, 5]
// Output: [5, 1, 2, 3, 4]
// Example 2
// Input:  [10, 20, 30, 40]
// Output: [40, 10, 20, 30]
// Requirements
// Modify the array in-place
// Do not create another array
// Time: O(n)
// Extra space: O(1)


import java.util.*;
public class Q13{
 public static void main(String s[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter array size::");
    int n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("enetr the array elements::");
   for(int  i=0;i<n;i++){
    a[i]=sc.nextInt();
   }

   int temp=a[n-1];
  
   for(int i=n-1;i>0;i--){
    a[i]=a[i-1];
   
   }
   a[0]=temp;

   System.out.println("final array is ========");
  for(int i=0;i<n;i++){
    System.out.println(a[i]);
    
   }

 sc.close();

}

}