// Q1 — Find the Maximum
// Given an integer array, find and return the largest element.
// Example:
// Input:  [10, 25, 7, 40, 15]
// Output: 40 

import java.util.*;
public class Q1 {
 public static void main(String s[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the array size::");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the array elements::");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=1;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    
    }
    System.out.println("the maximum element is::"+max);


    sc.close();
 }
    
}