class ArraysExample{

    void SumOfArray(){
        int arr[]= {34, 65, 78, 654,23,67};
        int sum =0;

        for(int i = 0; i<arr.length; i++){
            sum= sum+ arr[i];
        }
        System.out.println(sum);
    }

    void MaxArray(){
        int arr[] = {12, 54, 876, 55, 42};
        int ans= 0;

        for(int i =0; i<arr.length; i++){
            if(ans<arr[i]){
               ans= arr[i];
            }
        }
        System.out.println("Max " +ans);
    }

    void SearchOfArray(){
        int arr[]= { 12, 34, 76, 38, 98};
        int x= 76;
        int ans = -1;
        for(int i =0; i< arr.length; i++){
            if(arr[i]==x){
                ans = i;
            }
        }
        System.out.println("Found " +x+ " at index " +ans);
    }
}


public class main {
    public static void main(String[] args) {
        ArraysExample obj  = new ArraysExample();

        obj.SumOfArray();
        obj.MaxArray();
        obj.SearchOfArray();
    }
}
