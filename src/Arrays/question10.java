package Arrays;

public class question10{


    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 2, 7, 7, 2};
        int value = 7;
        int index = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == value) {
                index = i;
                 break;
            }
        }
        if( index != -1){
            System.out.println("Number found at index " + index);
        } else {
            System.out.println("Number not found");
        }
    }
}
