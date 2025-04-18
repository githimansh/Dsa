package Arrays;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {

    }
    public static int circularSubarraySum(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        int maxSum = arr[0], currentMax =0;
        int minSum = arr[0], cureentMin =0;

        for(int i =0; i<n; i++){
            totalSum += arr[i];

            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);

            cureentMin = Math.min(arr[i], cureentMin + arr[i]);
            minSum = Math.min(minSum, cureentMin);
        }
        if(maxSum < 0){
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
 }
}
