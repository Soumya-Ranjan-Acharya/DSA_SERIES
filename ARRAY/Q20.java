// Q20 — Find the Intersection of Two Arrays
// Given two arrays, find the elements that are present in both arrays.
// Example 1
// Array 1: [1, 2, 3, 4, 5]
// Array 2: [3, 4, 5, 6, 7]
// Output: 3 4 5
// Example 2
// Array 1: [10, 20, 30, 40]
// Array 2: [20, 40, 60, 80]
// Output: 20 40
// Requirements
// Don't use HashSet or HashMap.
// Don't modify/sort the arrays.
// Avoid printing the same intersection element more than once.
// Time: Aim for O(n × m) or better.
// Extra space: O(1) apart from the input arrays.


import java.util.*;
public class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array  A elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
         int[] b= new int[n];

        System.out.println("Enter array  B elements:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

       for(int i = 0; i < n; i++) {

    boolean alreadyPrinted = false;

    for(int k = 0; k < i; k++) {
        if(a[i] == a[k]) {
            alreadyPrinted = true;
            break;
        }
    }

    if(alreadyPrinted)
        continue;

    for(int j = 0; j < n; j++) {
        if(a[i] == b[j]) {
            System.out.print(a[i] + " ");
            break;
        }
    }
}

       

       

sc.close();
    }
    
}    