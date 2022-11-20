import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        int theFirstNumber;
        int theDistance;
        int howManyNumbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the series :");
        theFirstNumber = scanner.nextInt();
        System.out.println("Enter the number of the distance :");
        theDistance = scanner.nextInt();
        System.out.println("Enter how many numbers in the series :");
        howManyNumbers = scanner.nextInt();

        for ( int f= theFirstNumber;f<howManyNumbers;f+=theDistance){
            System.out.println(f+ ",");
        }



    }

}
