import java.util.Scanner;
public class occurrence {

    static int lastOccurrence(int[]arr, int x){
        int lastIndex = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();

        System.out.println("enter "+n+ "elements ");
        int []arr= new int[n];

        for(int i =0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter x ");
        int x = sc.nextInt();
        System.out.println("last index is " +lastOccurrence(arr, x));
    }
}
