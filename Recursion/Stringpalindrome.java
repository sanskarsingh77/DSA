// This program checks if a given string is a palindrome using recursion.

// Step 1: Prompt the user to input a string using Scanner.

// Step 2: Pass the input string to the isPalindrome function to determine if it is a palindrome.

// isPalindrome Function:
// - Base Case: If the string length is 0 or 1, it is a palindrome (return true).
// - Compare the first and last characters of the string:
//   - If they are not equal, the string is not a palindrome (return false).
// - Recursive Step: Call the function again with the substring excluding the first and last characters.

// Step 3: Based on the return value of isPalindrome, display whether the input string is a palindrome or not.

// Key Concepts:
// - Palindrome: A string that reads the same backward as forward (e.g., "madam", "level").
// - Recursion: The function repeatedly processes smaller substrings until the base case is reached.

// Example Execution:
// Input: "madam"
// - Compare first and last characters: "m" == "m", proceed with "ada".
// - Compare first and last characters: "a" == "a", proceed with "d".
// - Single character "d" is a palindrome by definition, return true.
// Output: "It is a Palindrome String".

import java.util.*;
public class StrPalin 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        if(isPalindrome(s))
            System.out.println("It is a Palindrome String");
        else
            System.out.println("It is not a Palindrome String");
    }    
    public static boolean isPalindrome(String s)
    {
        System.out.println(s+" "+s.length());
        if(s.length()<=1)
            return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        return isPalindrome(s.substring(1,s.length()-1)); 
    }
}
