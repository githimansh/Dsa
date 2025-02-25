package linearSearch;

public class Question7 {
    public static void main(String[] args) {
        int [] arr = {2, 45, 67, 88, 93, 45, 22};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i =1; i < arr.length; i++){
            if( arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
