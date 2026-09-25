// String Q2 — Check if a String is a Palindrome
// Given a string, determine whether it reads the same forward and backward.
// Example 1
// Input:  "madam"
// Output: true
// Example 2
// Input:  "racecar"
// Output: true
// Example 3
// Input:  "hello"
// Output: false
// Requirements
// Don't use StringBuilder.reverse().
// Don't create another reversed String.
// Aim for O(n) time.
// Aim for O(1) extra space.

import java.util.*;
public class Q2{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter the string ::");
    String str=sc.nextLine();
    boolean isPalindrome = true;

int i = 0;
int j = str.length() - 1;

while(i < j) {

    if(str.charAt(i)!=str.charAt(j)) {
        isPalindrome = false;
        break;
    }

    i++;
    j--;
}

System.out.println(isPalindrome);
        

        sc.close();
    
}
}