// Q5 — Reverse an Array
// Reverse an integer array in-place.
// Example:
// Input:  [1, 2, 3, 4, 5]
// Output: [5, 4, 3, 2, 1]
// Constraint: Try to solve this using the two-pointer technique.

import java.util.*;
public class Q5{
    public static void main(String s[]){
     Scanner sc=new Scanner (System.in);
    System.out.println("enter the array size::");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the array elements::");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int j=n-1;
    for (int i=0;i<j;i++,j--){
         int temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
    }
    System.out.println("the reversed array is::");
    for(int i:arr){
        System.out.print(i+" ");

    }
sc.close();
}
}