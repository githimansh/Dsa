package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
     int[] arr = {0, 1, 0};
        System.out.println(peakIndexInMoutainArray(arr));
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
}
