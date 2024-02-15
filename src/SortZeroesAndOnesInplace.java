public class SortZeroesAndOnesInplace {

    static void printArray(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    static void swapInArray(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortzeroesandonesinplace (int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right){
            if(arr[left]  ==1 && arr[right]  == 0){
                swapInArray(arr, left, right);
                left++;
                right--;

            }
            if(arr[left]  == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
//        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {0,0 , 1, 1, 0, 1,0,0};
        sortzeroesandonesinplace(arr);
        printArray(arr);
    }
}
