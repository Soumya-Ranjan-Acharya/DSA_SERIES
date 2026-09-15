// Q18 — Maximum Consecutive 1s
// Given a binary array containing only 0 and 1, find the maximum number of consecutive 1s.
// Example 1
// Input:  [1, 1, 0, 1, 1, 1]
// Output: 3
// Because the longest consecutive sequence is:
// 1 1 1
// Example 2
// Input:  [1, 0, 1, 1, 0, 1, 1, 1, 1]
// Output: 4
// Example 3
// Input:  [0, 0, 0, 0]
// Output: 0
// Requirements
// Don't sort.
// Don't use another array.
// Time: O(n)
// Extra space: O(1)
import java.util.*;
public class Q18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count_1=0;
        int max_count=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                count_1++;
                if(count_1 > max_count) {
                    max_count = count_1;
                }
            }
            else{
                count_1 = 0;
            }
        }

        System.out.println("Maximum consecutive 1s: " + max_count);

        sc.close();
    }
}        