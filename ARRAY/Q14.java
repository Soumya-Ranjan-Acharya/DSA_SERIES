// Q14 — Find the Frequency of Each Element
// Given an integer array, find how many times each element occurs in the array.
// Example
// Input:  [1, 2, 2, 3, 1, 4, 2]
// Output:
// 1 → 2
// 2 → 3
// 3 → 1
// 4 → 1
// Another example
// Input: [5, 5, 5, 2, 2, 8]
// Output:
// 5 → 3
// 2 → 2
// 8 → 1
// Target: O(n²) time
// Extra space: O(n) is allowed.
import java.util.*;

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip if this element has already been counted
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " → " + count);
        }

        sc.close();
    }
}