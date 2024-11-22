package Basic;

import java.util.Scanner;

public class SeriesOfCube 
{
    // Main method to calculate the sum of cubes of first n natural numbers
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);   
       
       // Input: The user inputs an integer n, representing the number of terms.
       System.out.print("Enter Number: ");
       int n = sc.nextInt();  

       // Sum of First n Numbers: The sum of the first n natural numbers is calculated 
       // using the formula n * (n + 1) / 2
       int sumOfN = (n * (n + 1)) / 2;
       
       // Sum of Cubes: The sum of cubes is computed by squaring the sum of the first n numbers
       System.out.println("Sum of Series: " + (sumOfN * sumOfN));
    }    
}
