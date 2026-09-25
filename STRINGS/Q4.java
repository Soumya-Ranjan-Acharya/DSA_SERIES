// String Q4 — Count Words in a String
// Given a sentence, count the number of words.
// Example 1
// Input:  "Java is very powerful"
// Output: 4
// Example 2
// Input:  "Hello   World"
// Output: 2
// Example 3
// Input:  "   Java is great   "
// Output: 3
// Requirements
// Multiple spaces may exist.
// Leading/trailing spaces may exist.
// Don't use split().
// Don't use regex.
// Time: O(n)
// Extra space: O(1)

import java.util.*;
public class Q4{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter the string ::");
    String str=sc.nextLine();
    int count=0;
    boolean inWord=false;
    if(str==null ){
        System.out.println("string is empty");
        return;
    }
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        
            if(c!=' '){
                if(!inWord){
                 count++;
                inWord=true;
                
                }
            }
            
           else {
            inWord=false;

            }
        }
   
         System.out.println("Number of words: " + count);

        }
        
        
    }
   

