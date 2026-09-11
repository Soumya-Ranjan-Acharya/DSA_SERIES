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

        System.out.println("=================================\nusing the arithmatic (The Math Sum Formula ) method \n");
        int sumOfArrayElements = 0;
        for (int i = 0; i < n; i++) {
            sumOfArrayElements += arr[i];
        }

        // Expected sum of numbers from 0 to n using array size n
        int expectedSum = (n * (n + 1)) / 2;
        int missingNum = expectedSum - sumOfArrayElements;
        System.out.println("Missing element is = " + missingNum);

       System.out.println("=================================\nusing the XOR  method \n");
       int missingNum1=n;
       for(int i=0;i<n;i++){
        missingNum1=missingNum1^i^arr[i];
       }
       System.out.println("missing number is="+missingNum1);


        sc.close();     
    }
}

//   For an unsorted array like [4, 7, 6, 8], where elements are not constrained to
//    starting at 0 and multiple numbers might be missing, the simplest and most common $O(n)$ time complexity 
//    approach uses a HashSet.


// import java.util.*;
// public class FindMissingNumbers {
//     public static void main(String[] args) {
//         int[] arr = {4, 7, 6, 8}; // Missing: 5

//         if (arr.length == 0) return;

//         // 1. Find the min and max values to establish the range
//         int min = arr[0];
//         int max = arr[0];
//         HashSet<Integer> set = new HashSet<>();

//         for (int num : arr) {
//             set.add(num);
//             if (num < min) min = num;
//             if (num > max) max = num;
//         }

//         // 2. Iterate from min to max and identify missing values
//         System.out.print("Missing elements are: ");
//         List<Integer> missing = new ArrayList<>();
        
//         for (int i = min; i <= max; i++) {
//             if (!set.contains(i)) {
//                 missing.add(i);
//             }
//         }

//         System.out.println(missing);
//     }
// }