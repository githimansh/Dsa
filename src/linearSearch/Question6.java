package linearSearch;

public class Question6 {
    public static void main(String[] args) {
        int[] arr = {12, 56, 7 , 2, 8, 9};
        System.out.println(min(arr));
    }
    static int min(int [] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
