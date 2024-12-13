// Initialize Data:

// A frequency array freq[52] stores letter counts:
// Indices 0-25: Lowercase letters ('a' to 'z').
// Indices 26-51: Uppercase letters ('A' to 'Z').
// Count Letters:

// Each character ch in the string is checked:
// If lowercase (ch >= 97), update freq[ch - 97].
// If uppercase, update freq[ch - 65 + 26].
// Print Results:

// Print non-zero counts from freq:
// Lowercase: (char)(i + 97) for indices 0-25.
// Uppercase: (char)(i + 65 - 26) for indices 26-51.
public class CharFreq3
{
    public static void main(String[] args) 
    {
        String s="aazzddAABZ";  //Asssuming only uppercase and lowercase chars
        int freq[]=new int[52];
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            var c=(ch>=97)?freq[ch-97]++:freq[ch-65+26]++;
        }  
        //Print Array
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                char ch=(char)(i<=26?(i+97):(i+65-26));
                System.out.println(ch+" Occurs: "+freq[i]+" Times");
            }
        }
    }    
}
