// Input: User specifies the number of terms (x) in the Fibonacci series.
// Logic:
// First two terms are printed directly (a = 0, b = 1).
// Remaining terms are calculated using the formula c = a + b.
// Update a and b for the next term.
// Output: A single line containing the Fibonacci series up to x terms.
// Edge cases:
// If x = 0, no terms are printed.
// If x = 1, only the first term (0) is printed.
package Basic;

import java.util.*;
public class Fibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int x=sc.nextInt();
        Fibonacci obj=new Fibonacci();
        
        int a = 0,b=1;
        System.out.println("\nFibonacci Series up to " + x + " terms:");
        
        if (x >= 1) 
            System.out.print(a + " ");

        if (x >= 2) 
            System.out.print(b + " ");

        for (int i = 2; i < x; i++) 
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }    
}
