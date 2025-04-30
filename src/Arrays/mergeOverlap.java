package Arrays;

public class mergeOverlap {
    import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    class Solution {
        public List<int[]> mergeOverlap(int[][] arr) {
            List<int[]> result = new ArrayList<>();

            if (arr.length <= 1) {
                result.addAll(Arrays.asList(arr)); // Handle single interval case
                return result;
            }

            // Sort intervals by starting time
            Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));

            int[] newInterval = arr[0];
            result.add(newInterval);

            for (int[] interval : arr) {
                if (interval[0] <= newInterval[1]) {
                    // Merge overlapping intervals
                    newInterval[1] = Math.max(newInterval[1], interval[1]);
                } else {
                    // No overlap, start a new interval
                    newInterval = interval;
                    result.add(newInterval);
                }
            }

            return result;
        }
    }

}
