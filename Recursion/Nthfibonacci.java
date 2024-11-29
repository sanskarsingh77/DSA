// User Input:
// The program prompts the user to input an integer x, which represents the position of the Fibonacci number to find (e.g., 5th Fibonacci number).
// x is taken as input using Scanner.

// Fibonacci Calculation:
// An object obj of the NthFibonacci class is created.
// The method fib(x) is called on this object to compute the Fibonacci number at the xth position.

// Recursive Fibonacci Calculation:
// Base Case: If n is 0 or 1, return n (because the 0th Fibonacci number is 0, and the 1st Fibonacci number is 1).
// Recursive Case: For any n > 1, the Fibonacci number is calculated by summing the previous two Fibonacci numbers: fib(n-1) + fib(n-2).

// Output:
// The calculated Fibonacci number is printed with the message "Nth Fibonacci Number."


import java.util.Scanner;

public class NthFibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int x=sc.nextInt();
        NthFibonacci obj=new NthFibonacci();
        
        int ans=obj.fib(x);
        System.out.println("Nth Fibocanni Number: "+ans);
    }    
    public int fib(int n) 
    {
        if(n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }    
}
