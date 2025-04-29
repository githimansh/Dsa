package Arrays;

public class inversionCount {
    class Solution {
        // Function to count inversions in the array.
        static int inversionCount(int arr[]) {
            int[] temp = new int[arr.length];
            return mergeSort(arr, temp, 0, arr.length - 1);
        }

        private static int mergeSort(int[] arr, int[] temp, int left, int right) {
            int invCount = 0;
            if (left < right) {
                int mid = (left + right) / 2;

                invCount += mergeSort(arr, temp, left, mid);
                invCount += mergeSort(arr, temp, mid + 1, right);
                invCount += merge(arr, temp, left, mid, right);
            }
            return invCount;
        }

        private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
            int i = left;
            int j = mid + 1;
            int k = left;
            int invCount = 0;

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                    invCount += (mid - i + 1);
                }
            }

            // ✅ Corrected loop: Copy remaining elements of left subarray
            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            // Copy remaining elements of right subarray
            while (j <= right) {
                temp[k++] = arr[j++];
            }

            // Copy merged elements back into original array
            for (i = left; i <= right; i++) {
                arr[i] = temp[i];
            }

            return invCount;
        }
    }

}
