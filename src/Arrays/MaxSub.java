package Arrays;

import java.util.Arrays;

public class MaxSub {
    public static void main(String[] args) {
     int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int max_so_far = nums[0];
        int curr_max = nums[0];

        for(int i = 1; i < nums.length; i++){
            curr_max = Math.max(nums[i], nums[i] + curr_max);
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }
}
