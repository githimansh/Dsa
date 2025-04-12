package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
      int[] nums = {1, 2,3 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums){
       int index = -1;
       int n = nums.length;

       for(int i = n-2; i >=0; i--){
           if(nums[i] < nums[i+1]){
               index = i;
               break;
           }
       }
       if(index != -1) {
           for (int i = n - 1; i >= 0; i--) {
               if (nums[i] > nums[index]) {
                   int temp = nums[index];
                   nums[index] = nums[i];
                   nums[i] = temp;
                   break;
               }
           }
       }
       int left = index +1, right = n-1;
       while(left < right){
           int temp = nums[left];
           nums[left] = nums[right];
           nums[right] = temp;
           left++;
           right--;
       }
    }
}
