import java.util.*; // Importing utility package for Scanner class

public class ReverseArray  // Main class
{
    public static void main(String[] args) // Main method
    {
        ReverseArray obj = new ReverseArray(); // Creating an object of the class
        Scanner sc = new Scanner(System.in); // Scanner object for taking user input

        // Taking the size of the array as input
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        // Declaring the array with user-defined size
        int a[] = new int[n];
        int i;

        // Loop to take array elements as input from the user
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter Value: ");
            a[i] = sc.nextInt();
        }

        // Printing the original array
        System.out.println("\nOriginal array");
        for (int num : a) { // Enhanced for loop to iterate through the array
            System.out.print(num + " ");
        }

        // Calling the reverse method to reverse the array
        obj.reverse(a, 0, a.length - 1);

        // Printing the reversed array
        System.out.println("\nReversed array");
        for (int num : a) { // Enhanced for loop to display the reversed array
            System.out.print(num + " ");
        }
    }

    // Method to reverse the array using recursion
    void reverse(int a[], int start, int end) {
        // Base case: If start index is greater than or equal to end index, stop recursion
        if (start >= end)
            return;

        // Swapping the elements at the start and end indices
        int temp = a[start]; 
        a[start] = a[end];
        a[end] = temp;

        // Recursive call with updated indices (move towards the middle of the array)
        reverse(a, start + 1, end - 1);
    }
}
