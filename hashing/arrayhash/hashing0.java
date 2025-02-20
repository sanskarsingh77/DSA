// QUESTION :
// We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.
// Sol:
// This is the optimized approach using hashmap :
import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    Map<Integer ,Integer> map = new HashMap<>();
    int maxFreq = Integer.MIN_VALUE;
    int minFreq  = Integer.MAX_VALUE;
    int maxEle = arr[0];
    int minEle = arr[0];
    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // getOrDefault(arr[i], 0) -> If arr[i] is not in the map, return 0 and add 1
    }
    
    // Traversing the HashMap to find the elements with max and min frequency
    for(Map.Entry<Integer ,Integer>num : map.entrySet()){
        if(num.getValue() >=maxFreq){
            maxFreq= num.getValue();
            maxEle = num.getKey();
        }
        if(num.getValue()<=minFreq){
            minFreq = num.getValue();
            minEle = num.getKey();
        }
    }
    System.out.println(" max Freq element "+ maxEle + " with frequency " + maxFreq );
    System.out.println(" min Freq element "+ minEle +" with frequency "+ minFreq );
    }
}
