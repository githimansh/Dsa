public class InsertionSort {
    static void insertionSort ( int a[]){
        int n = a.length;
        for(int i = 1; i<n; i++){
            int j = i;
            while( j > 0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 7, 8, 4, 68, 1, 9};
        insertionSort(a);
        for( int i = 0; i < a.length; i++) {
           System.out.print(a[i] + " ");
        }
    }
}
