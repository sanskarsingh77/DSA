// Input:
// The user enters the number of terms 'x' they want in the Fibonacci series.
// Output:
// The Fibonacci series up to 'x' terms is printed.
// Loop:
// Iterates from 1 to x, calling fib(i) for each term and printing it.

// Fibonacci Series Logic (Recursive Approach):

// Base Cases:
// If n <= 1, return n (either 0 or 1 for the first two terms).

// Recursive Step:
// Return fib(n-1) + fib(n-2) for all other cases.

import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int x=sc.nextInt();
        Fibonacci obj=new Fibonacci();
        System.out.println("Fibonacci Series upto n terms");
        for (int i = 1; i <= x; i++) 
        {
            System.out.print(obj.fib(i) + " ");
        }
    }    
    public int fib(int n) 
    {
        if(n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}
