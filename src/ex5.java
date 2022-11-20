import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        System.out.println("please enter a number to chick if its a fibonacci number:");
        Scanner scanner =  new Scanner (System.in);
        int number = scanner.nextInt();
        boolean isItFibonacci = false;
        if (number==0 || number==1){
            isItFibonacci = true;
        }else {
            int firstNumber =0;
            int nextNumber =1;
            int sum =0;

            for (int i=1;i<number;i++){
                sum= firstNumber + nextNumber;
                firstNumber = nextNumber;
                nextNumber = sum;

                if ( sum==number){
                    isItFibonacci = true;
                    break;

                }

            }

        }
        if (isItFibonacci){
            System.out.println("Its a fibonacci number");

        }else {
            System.out.println("Its not a fibonacci number");
        }

    }
}
