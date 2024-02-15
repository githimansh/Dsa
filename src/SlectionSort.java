public class SlectionSort {
    static void selectionSort (int arr[]){
        int n = arr.length;
        for( int i = 0; i < n-1; i++){
            int min_index = i;
            for( int j = i+1; j < n ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] ={ 4, 100, 34, 65, 78, 2, 1};
        selectionSort(arr);
        for( int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
