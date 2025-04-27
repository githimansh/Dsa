package Arrays;

public class sort012 {
    class Solution {
        // Function to sort an array of 0s, 1s, and 2s
        public void sort012(int[] arr) {
            int start = 0;
            int mid = 0;
            int end = arr.length - 1; // correction here

            while (mid <= end) {
                switch (arr[mid]) {
                    case 0:
                        swap(arr, start, mid);
                        start++;
                        mid++;
                        break;

                    case 1:
                        mid++;
                        break;

                    case 2:
                        swap(arr, mid, end);
                        end--; // do NOT increment mid here
                        break;
                }
            }
        }

        void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

}
