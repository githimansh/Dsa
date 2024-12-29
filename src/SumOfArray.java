public class SumOfArray {
    void sumOfArray() {
        int []arr = {3, 5, 76, 45, 34};
        int sum =0;
        for(int i = 0 ; i <arr.length; i++){
            sum+= arr[i];

        }
        System.out.println(sum);
    }
    void maxOfArray() {
        int []arr = { 12, 34, 65, 67, 78, 90, 79};
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] >ans){
                ans = arr[i] ;
            }
        }
        System.out.println("Max" +ans);
    }
    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        obj.sumOfArray();
        obj.maxOfArray();
    }
}
