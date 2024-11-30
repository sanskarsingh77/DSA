// Input Array: The unsorted array a is defined as {10, 70, 30, 40, 20}.

// Sorting Logic:

// The algorithm iterates over the array starting from the second element (i = 1), treating the portion before i as already sorted.
// For each element (key = a[i]), it shifts elements in the sorted portion (a[0...i-1]) that are greater than key one position to the right to make space for key.
// It then places key in its correct position within the sorted portion.
// Output:

// After sorting, the program prints the sorted array.
public class Insertion 
{
    public static void main(String[] args) 
    {
        int a[] = {10,70,30,40,20};
        int i,j;
        for(i=1;i<a.length;i++)
        {
            int key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }    
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
