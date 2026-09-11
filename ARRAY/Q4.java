// Q4 — Count Even and Odd Numbers

// Given an integer array, count how many elements are even and how many are odd.

// Example:

// Input:  [1, 2, 3, 4, 6, 7]


// Even = 3
// Odd  = 3

import java.util.*;
public class Q4{
   public static void main(String s[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the array size::");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the array elements::");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int even=0,odd=0;
    for(int i:arr){
        if(i%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("Even = " + even);
    System.out.println("Odd = " + odd);
    sc.close();
 }
}