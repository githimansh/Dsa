package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
       int[] arr = {0, 1, 2, 3, 4, 3, 2, 1};
        System.out.println(peakIndexInMoutainArray(arr));
    }
    int search(int[] arr, int target) {
        int peak = peakIndexInMoutainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0 , peak  );
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length -1);
    }
    public static int peakIndexInMoutainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in dec part of the array
                //this may be the ans, but look at the left
                //this is why end != mid -1
                end = mid;
            }else {
                //you are in asc part of array
                start = mid + 1; //because we know that mid +1 element > mid element
            }
        }
        //in the end , start == end and pointing to the largest number because ogf the 2 num
        //start and end are always trying to find max element in above  2 checks sy
        //hence, when they are pointing to just one element, that is the max one
        return start; // or return end as both are equal
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end ){

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
