public class MultipleOf4And6 {
    public static void main(String[] args) {

        int num = 1;
        while(true){
            if((num % 4 == 0) && (num % 6 == 0) && (num % 7 == 0)) {
                System.out.println("Ans : " + num);
                break;
            }
            num++;
        }
    }
}
