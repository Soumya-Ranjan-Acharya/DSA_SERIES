// Q11 — Find the Missing Number
// You are given an array containing n distinct numbers taken from the range:
// 0 to n
// Find the one missing number.
// Example 1
// Input:  [3, 0, 1]
// Output: 2
// Because the numbers should be:
// 0, 1, 2, 3
// and 2 is missing.
// Example 2
// Input:  [9, 6, 4, 2, 3, 5, 7, 0, 1]
// Output: 8
// Constraints
// All numbers are distinct.
// Numbers are in the range 0 to n.
// Target: O(n) time
// Target: O(1) extra space
// Interview Hint
// Try to solve it without sorting and without using another array.
import java.util.*;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = n;

        for (int i = 0; i < n; i++) {
            missing = missing ^ i ^ arr[i];
        }

        System.out.println("Missing element = " + missing);

        sc.close();
    }
}