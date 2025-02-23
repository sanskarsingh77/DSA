// Check if there are any two Equal numbers in an array at a distance less than or equal to k
import java.util.*;
public class Main{
    public static boolean nearestDuplicate(int [] nums ,int k){
        
        Map<Integer,Integer> numsIndices = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // it checks 
            if(numsIndices.containsKey(nums[i]) && i- numsIndices.get(nums[i]) <=k)
            return true;
            numsIndices.put(nums[i],i);
        }
         return false;
    }
   
    
}
public static void Main(string[] args){
    int [] nums ={3,2,1,3,3};
    int k =3;
    if(nearestDuplicate(nums,k)){
        System.out.println("their are valid equal numbers within distance"+ k );
    else{
        System.out.println("their are no valid equal numbers within distance"+ k );
        
        }
    }
}
