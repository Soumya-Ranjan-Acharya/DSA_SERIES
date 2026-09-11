// Q9 — Remove Duplicates from Sorted Array
// Given a sorted integer array, remove duplicates in-place so that each element appears only once.
// Return the number of unique elements.
// Example:
// Input:  [1, 1, 2, 2, 3, 4, 4]
// Output: 4
// Array after modification:
// [1, 2, 3, 4, ...]
// Interview constraint: Try to solve it using O(1) extra space.

import java.util.*;

public class Q9 {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the array size::");
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        
        System.out.println("enter the array elements::");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("the sorted array is::"+Arrays.toString(arr)); 

        System.out.println("\n================== removing duplicates =========================");

        int k = 1; 
         for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Number of unique elements: " + k);

        System.out.println("Array after modification:");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        
      
        sc.close();
    }
}
