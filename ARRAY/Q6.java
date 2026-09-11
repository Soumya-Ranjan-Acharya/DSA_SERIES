// Q6 — Find the Second Largest Element
// Given an integer array, find the second largest distinct element.
// Input:  [10, 5, 20, 8, 20, 15]
// Output: 15
// If there is no second distinct largest element, return -1.
import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            }
            else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element: -1");
        }
        else {
            System.out.println("Second largest element: " + secondLargest);
        }

        sc.close();
    }
}
// System.out.print("==========================================================="); 
// //using sorting method

//         // Method 2: Sorting Method (O(n log n) Time, O(1) Space)
//         System.out.println("--- Sorting Method ---");
//         Arrays.sort(arr);
        
//         int secondLargestSort = -1;
//         // Walk backward to skip duplicate largest elements
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != arr[n - 1]) {
//                 secondLargestSort = arr[i];
//                 break;
//             }
//         }
        
//         System.out.println("The second largest element is:: " + secondLargestSort);




// sc.close();
//  }   
// } 