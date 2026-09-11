// Q8 — Linear Search
// Given an array and a target value, return the index of the target.
// If the target doesn't exist, return -1.
// Input:  arr = [10, 20, 30, 40, 50]
// Target: 30
// Output: 2
import java.util.*;

public class Q8 {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the array size::");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("enter the array elements::");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter the target element::");
        int element = sc.nextInt();
        
        int foundIndex = -1; // Default if not found
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                foundIndex = i; // Save the index
                break;          // Stop searching
            }
        }
        
        System.out.println("Output: " + foundIndex+" (Index of the target element)="+element);
        sc.close();
    }
}
