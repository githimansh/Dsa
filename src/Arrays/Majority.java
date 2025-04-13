package Arrays;

public class Majority {
    public static void main(String[] args) {
   int[]nums = {3, 2, 3};

    }
    public static int majorityElement(int[] nums){
        int majority = nums[0];
        int count = 1;

        for(int i =1; i <nums.length; i++){
            if(count == 0){
                count++;
                majority = nums[i];
            }else if(majority == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}
