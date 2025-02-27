// Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
import java.util.*;
public class Main
{
    public static int checkPairs(int [] arr ,int k){
        int count=0;
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i =0 ;i<arr.length;i++){
         // Dekh rahe hain ki (k - arr[i]) HashMap me hai ya nahi
            if(mp.containsKey(k-arr[i])){
                count++;  // Agar mil gaya toh ek valid pair mil gaya

            }
            mp.put(arr[i],i); //Current element ko map me store kar rahe hain
        }
        return count;
    }
	public static void main(String[] args) {
// 		System .out.println("Hello World");
        int [] arr = {1, 2 , 3 , 4 , 5};
        int k=5;
        int count = checkPairs(arr, k);
        System.out.println("Count pairs with sum "+ k + " is "+ count);
    
	}
}
