package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr = {  2, 9, 11, 14, 18, 22, 24, 56, 78};
        int target = 13;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
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
        return end;
    }
}
