import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter value of a");
        double a = inp.nextDouble();
        System.out.println("Enter value of b");
        double b = inp.nextDouble();
        System.out.println("Enter value of c");
        double c = inp.nextDouble();
        double D = (b*b)-(4*a*c);
        if (D<0){
            System.out.println("The roots are imaginary");
        }
        else {
            double S1 = (-b+Math.sqrt(D))/(2*a);
            double S2 = (-b-Math.sqrt(D))/(2/a);
            System.out.println("Solution 1: "+S1);
            System.out.println("Solution 2: "+S2);
        }

    }
}
