 // Find Sum of Range  [l……….r] where(l<=r) using Prefix sum.
import java.util.*;

public class Main {
    static int[] prefixSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];   
        prefix[0] = nums[0];  // Initialize first element

        for (int i = 1; i < n; i++) {  // Start from i = 1
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    static int sum(int[] prefix, int l, int r) {
        if (l == 0) return prefix[r];  // Handle out-of-bounds case
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] prefix = prefixSum(nums);
        int l = 3, r = 7;

        System.out.println("Optimized sum: " + sum(prefix, l, r));
    }
}
