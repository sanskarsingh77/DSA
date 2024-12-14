// Initialize Data:

// An array a stores integers to be counted.
// An integer array freq[11] is initialized to zero, where each index represents a number from 0 to 10.
// Count Frequencies:

// Loop through the array a:
// Increment freq[a[i]] for each integer in a.
// Print Results:

// Loop through freq from index 1 to 10.
// If a frequency is non-zero, print the integer and its count.
public class IntFreq 
{
    public static void main(String[] args) 
    {
        int a[]={1,1,1,7,7,10,10,2,3,3};
        int freq[]=new int[11];
        
        int i;
        for(i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        for(i=1;i<freq.length;i++)
        {
            if(freq[i]!=0)
                System.out.println(i+" Occurs "+freq[i]+" times");
        }
    }    
}
