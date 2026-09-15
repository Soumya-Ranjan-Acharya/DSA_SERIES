// Q19 — Find the Element That Appears Once
// Given an array where every element appears exactly twice except one element, find the element that appears only once.
// Example:
// Input:  [4, 1, 2, 1, 2]
// Output: 4
// Example:
// Input:  [2, 2, 5, 3, 3]
// Output: 5
// Requirements:
// Don't sort.
// Don't use HashMap.
// O(n) time.
// O(1) extra space.
import java.util.*;
public class Q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0;i<n;i++){
            result = result ^ a[i];
        }
        System.out.println("Element that appears once: " + result);
        sc.close();
    }
}       


//brute force approach
/* 

for(int i = 0; i < n; i++) {
    int count = 0;

    for(int j = 0; j < n; j++) {
        if(a[i] == a[j]) {
            count++;
        }
    }

    if(count == 1) {
        System.out.println(a[i]);
        break;
    }
}   
    
*/