import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("To solve quadratic equations, you have to enter the variables : ");
        System.out.println("a =");
        double a = scanner.nextInt();
        System.out.println("b =");
        double b = scanner.nextInt();
        System.out.println("c =");
        double c = scanner.nextInt();

        if ((b*b)-4*a*c<0 || a==0 ){
            System.out.println("There is no solution");
        }
        else {
            double x1 = ( (-b+ Math.sqrt((b*b)-4*a*c))/ (2*a)   );
            double x2 = ( (-b- Math.sqrt((b*b)-4*a*c))/ (2*a)   );
            if (x1==x2){
                System.out.println(" There is one solution: \n x1="+x1);
            }else {
                System.out.println(" There is two solution: \n x1="+x1 +"\n x2= "+x2  );
            }


        }


    }
}
