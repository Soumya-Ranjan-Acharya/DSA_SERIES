// Q17 — Find the Majority Element
// Given an integer array of size n, find the element that appears more than n/2 times.
// You may assume that a majority element always exists.
// Example 1
// Input:  [2, 2, 1, 1, 1, 2, 2]
// Output: 2
// 2 appears 4 times, and:
// n / 2 = 7 / 2 = 3
// So 2 is the majority element.
// Example 2
// Input:  [3, 3, 4, 2, 3, 3, 3]
// Output: 3
// Requirements
// Don't sort the array.
// Don't use HashMap or any other extra data structure.
// Target: O(n) time
// Target: O(1) extra space

import java.util.*;
public class Q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       
         // Boyer-Moore Voting Algorithm
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = a[i];
            }
            
            if (a[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("The majority element is: " + candidate);   
        

        sc.close();
    }
}         