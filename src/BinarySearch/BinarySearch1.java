package BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = { -3, 2, 9, 12, 13, 19, 22, 25, 56, 87, 99};
        int target = 22;
         int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
