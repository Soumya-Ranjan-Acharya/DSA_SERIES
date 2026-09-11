// Q2 — Find the Minimum

// Given an integer array, find and return the smallest element.

// Example:

// Input:  [10, 25, 7, 40, 15]
// Output: 7
import java.util.*;
public  class Q2{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array::");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);


sc.close();
    }
}
