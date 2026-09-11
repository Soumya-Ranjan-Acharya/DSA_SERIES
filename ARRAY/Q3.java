// Q3 — Sum of Array Elements

// Given an integer array, calculate the sum of all elements.

// Example:

// Input:  [2, 4, 6, 8]
// Output: 20

import java.util.*;
public class Q3{
   public static void main(String s[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the array size::");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the array elements::");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
    System.out.println("sum is "+sum);

    sc.close();
  }
}