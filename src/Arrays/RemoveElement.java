package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
       int[] nums = {3, 2, 2, 3 };
       int val = 3;
       int ans = removeElement(nums, val);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0 , ans)));
    }
   public static int removeElement(int[] nums, int val){
        int ptr = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return  ptr;
    }
}
