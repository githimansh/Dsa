package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {122, 112, 99, 56, 45, 22, 11, 4,1};
        int target = 1;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                //if array is sorted in ascending order
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            } else{
                //if array is sorted in descending order
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
