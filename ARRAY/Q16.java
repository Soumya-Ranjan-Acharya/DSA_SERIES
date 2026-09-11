// Q16 — Find All Leaders in an Array
// An element is called a leader if it is greater than or equal to every element to its right.
// The last element is always a leader because there is nothing to its right.
// Example 1
// Input:  [16, 17, 4, 3, 5, 2]
// Output: 17 5 2
// Explanation:
// 16 → ❌ because 17 is greater
// 17 → ✅ greater than everything to its right
// 4 → ❌ because 5 is greater
// 3 → ❌ because 5 is greater
// 5 → ✅ greater than 2
// 2 → ✅ last element
// Example 2
// Input:  [7, 10, 4, 10, 6, 5, 2]
// Output: 10 10 6 5 2
// Notice that equal values are allowed because the condition is >=.
// Requirements
// Don't sort the array.
// Don't use another array to store the leaders.
// Target: O(n) time
// Target: O(1) extra space
// Hint
// Think from right to left.
// Maintain:
// maximum element seen so far
// For every element:
// if current >= maximum
//     current is a leader

import java.util.*;
// import java.util.ArrayList;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> leaders = new ArrayList<>();

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] a = new int[n];
        

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       int maxFromright=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(maxFromright<=a[i]){
                maxFromright=a[i];
                // leaders.add(maxFromright);
                System.out.print(maxFromright + " ");
            }
        }

        // System.out.println("Leaders in the array are:");
        // for (int leader : leaders) {
        //     System.out.print(leader + " ");
        // }


        sc.close();
    }
    
}    
