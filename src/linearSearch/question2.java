package linearSearch;

public class question2 {

    public static void main(String[] args) {
        int[] nums = { 12, 45, 43, 76, 123, 98};
        int target = 70;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target) {
                return true;
            }
        }
        return false;
    }
}
