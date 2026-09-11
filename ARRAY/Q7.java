// Q7 — Check if Array is Sorted

// Given an integer array, determine whether the array is sorted in non-decreasing order.

// Input:  [1, 2, 2, 4, 5]
// Output: true
// Input:  [1, 3, 2, 5]
// Output: false

import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Is array sorted: " + isSorted);

        sc.close();
    }
}