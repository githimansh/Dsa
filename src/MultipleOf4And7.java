public class MultipleOf4And7 {
    public static void main(String[] args) {

        int num = 1;

        while (true){
            if((num % 4 == 0) &&(num % 7 ==0) &&(num % 6 == 4)){
                System.out.println("Ans" + num);
                break;
            }
            num++;
        }
    }
}
