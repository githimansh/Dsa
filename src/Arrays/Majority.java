package Arrays;

public class Majority {
    class Solution {
        // Function to find the majority elements in the array
        public List<Integer> findMajority(int[] nums) {
            // Your code goes here.
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            int n = nums.length;

            for(int i = 0; i <n; i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i]) +1);

                }else{
                    map.put(nums[i], 1);
                }
            }
            for(int key : map.keySet()){
                if(map.get(key) > n/3){
                    list.add(key);
                }
            }
            return list;
        }
    }

}
