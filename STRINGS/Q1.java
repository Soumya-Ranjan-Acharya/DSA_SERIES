// String Q1 — Reverse a String
// Given a string, reverse it without using StringBuilder.reverse() or any built-in reverse method.
// Input:  "hello"
// Output: "olleh"
// Input:  "Java"
// Output: "avaJ"
// Requirements:
// Don't use built-in reverse methods.
// Aim for O(n) time.
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the string ::");
         String str=sc.nextLine();
         char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
       }

        System.out.println(new String(arr));
          
           




     sc.close();   
           
        
        
        }   
    }
