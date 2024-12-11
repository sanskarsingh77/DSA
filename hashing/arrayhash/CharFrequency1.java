// Initialization:

// A string s containing lowercase letters is defined.
// An integer array freq[26] is initialized to store letter frequencies (one index per letter from 'a' to 'z').
// Counting Frequencies:

// A loop goes through each character ch in the string s.
// The character's ASCII value is used to determine its position in the array (ch - 97).
// The corresponding index in freq is incremented.
// Printing Results:

// Another loop checks all elements in the freq array.
// If a frequency is non-zero, the corresponding letter and its count are printed
public class CharFreq1
{
    public static void main(String[] args) 
    {
        String s="aazzbdde";  //Asssuming all characters are lowercase
        int freq[]=new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-97]++;
        }  
        //Print Array
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
                System.out.println((char)(i+97)+" Occurs: "+freq[i]+" Times");
        }
    }    
}
