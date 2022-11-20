import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number to chick if its a narcissistic number:");
        int num= scanner.nextInt();

        int temp = num;
        int r,sum=0;

        while (num>0){

            r=num%10;
            num=num/10;
            sum = sum+ r*r*r;
        }
        if ( temp==sum){
            System.out.println(" Its a narcissistic number");
        }else {
            System.out.println(" Its not a narcissistic");
        }


    }
}
