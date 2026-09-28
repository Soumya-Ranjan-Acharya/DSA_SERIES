// String Q5 — Remove Duplicate Characters
// Given a string, remove duplicate characters while preserving the first occurrence order.
// Example 1
// Input:  "programming"
// Output: "progamin"
// Example 2
// Input:  "banana"
// Output: "ban"
// Because:
// banana
// ↑
// b → keep
// a → keep
// n → keep
// a → duplicate
// n → duplicate
// a → duplicate
// Requirements
// Preserve original order.
// Don't use HashSet or HashMap.
// Don't use replace() or regex.
// Time: Aim for O(n²).
// Extra space: O(n) is allowed.


import java.util.*;
public class Q5{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter the string ::");
    String str=sc.nextLine();
     boolean flag;
    for (int i=0;i<str.length();i++){
        flag=false;
        for (int j=0;j<i;j++){
        char A=str.charAt(j);
        if(str.charAt(i)== str.charAt(j)){
            flag=true;
            break;
             }

         } 
         if(!flag){
            System.out.print(str.charAt(i));
         }
        }



    sc.close();

    }
}   