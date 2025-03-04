
// // Find count of shortest/largest subarrays with sum k in given array
// import java.util.HashMap;
// import java.util.Map;

// public class Main {

//     public static int[] countShortestAndLargestSubarrays(int[] nums, int k) {
//         Map<Integer, Integer> firstOccurrence = new HashMap<>();
//         Map<Integer, Integer> lastOccurrence = new HashMap<>();
        
//         int prefixSum = 0;
//         int minLength = Integer.MAX_VALUE, maxLength = Integer.MIN_VALUE;
//         int minCount = 0, maxCount = 0;

//         firstOccurrence.put(0, -1);

//         for (int i = 0; i < nums.length; i++) {
//             prefixSum += nums[i];

//             if (firstOccurrence.containsKey(prefixSum - k)) {
//                 int startIndex = firstOccurrence.get(prefixSum - k);
//                 int length = i - startIndex;

//                 if (length < minLength) {
//                     minLength = length;
//                     minCount = 1;
//                 } else if (length == minLength) {
//                     minCount++;
//                 }

//                 if (length > maxLength) {
//                     maxLength = length;
//                     maxCount = 1;
//                 } else if (length == maxLength) {
//                     maxCount++;
//                 }
//             }

//             firstOccurrence.putIfAbsent(prefixSum, i);
//             lastOccurrence.put(prefixSum, i);
//         }

//         return new int[]{minCount, maxCount};
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 3 , 1 , 1 , 1 , 6};
//         int k = 6;

//         int[] result = countShortestAndLargestSubarrays(nums, k);
//         System.out.println("Count of shortest subarrays with sum " + k + ": " + result[0]);
//         System.out.println("Count of longest subarrays with sum " + k + ": " + result[1]);
//     }
// }
