package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 10, 14, 16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target){
        //but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
