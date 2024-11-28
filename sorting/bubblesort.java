public class Bubble {
    public static void main(String[] args) {
        // Array to be sorted
        int a[] = {10, 70, 30, 40, 20, 1};

        // Sorting Logic:
        // 1. Compare adjacent elements in the array.
        // 2. Swap them if they are out of order.
        // 3. Repeat this process multiple times until the entire array is sorted.
        
        // Outer loop: Ensures the process is repeated for all elements
        for (int i = 0; i < a.length; i++) {
            
            // Inner loop: Performs the actual comparisons and swaps
            for (int j = 0; j < a.length - 1; j++) {
                
                // If the current element is greater than the next one, swap them
                if (a[j] > a[j + 1]) {
                    // Swapping Technique:
                    // Use a temporary variable (t) to swap values
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        // Printing the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Bubble Sort Characteristics:
        // 1. It's a stable sorting algorithm (doesn't change the order of equal elements).
        // 2. Time complexity: O(n²) in the worst and average cases.
        // 3. Simple to implement but not efficient for large datasets.
    }
}
