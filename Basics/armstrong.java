/*
 * Concept:
 * Armstrong Number is a number where the sum of cubes of its digits 
 * equals the number itself (e.g., 153 = 1^3 + 5^3 + 3^3).
 *
 * Flow:
 * 1. Take input (x) and store a copy (y) for comparison.
 * 2. Extract each digit using modulus operator (rem = x % 10).
 * 3. Calculate the cube of the digit and add it to the sum.
 * 4. Remove the last digit using division (x = x / 10).
 * 5. After the loop, compare the sum with the original number (y).
 *
 * Key Checks:
 * - Single-digit numbers are always Armstrong.
 * - Use if-else to determine and print the result.
 *
 * Efficient Logic:
 * - No extra space is required; uses only variables for calculations.
 *
 * Example Execution:
 * Input: 153
 * Process: 1^3 + 5^3 + 3^3 = 153
 * Output: Armstrong number.
 *
 * Java Features Used:
 * - Loops: Process digits iteratively using a while loop.
 * - Modulus Operator: Extract the last digit of the number.
 * - Division Operator: Remove the last digit of the number.
 */

package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rem, y = x, sum = 0;
        while (x != 0) {
            rem = x % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            x = x / 10;
        }
        if (sum == y)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
