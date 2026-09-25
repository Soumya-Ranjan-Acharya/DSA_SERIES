// String Q3 — Count Vowels and Consonants
// Given a string, count the number of vowels and consonants.
// Example
// Input:  "Hello World"
// Vowels: 3
// Consonants: 7
// H, l, l, W, r, l, d → consonants
// e, o, o → vowels
// Requirements
// Consider a, e, i, o, u as vowels.
// Ignore spaces, digits, and special characters.
// Both uppercase and lowercase should work.
// Don't use regex.
// Time: O(n)
// Extra space: O(1)
// Example:
// Input:  "Java123!"
// Output:
// Vowels: 2
// Consonants: 2

import java.util.*;
public class Q3{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter the string ::");
    String str=sc.nextLine();
    String str1=str.toUpperCase();
    int vowels=0, consonants=0;
    int i=0;
    while(i<str.length()){
          if(Character.isLetter(str1.charAt(i))){
            if(str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'){
                vowels++;
            }
            else{
                consonants++;
            }
          }

        i++;
        }

    
    System.out.println("Vowels: "+vowels);
    System.out.println("Consonants: "+consonants);

    


    sc.close();

    }
}  