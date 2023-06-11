import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter v1");
        double v1 = inp.nextDouble();
        System.out.println("Enter v2");
        double v2 = inp.nextDouble();
        System.out.println("Enter p1");
        double p1 = inp.nextDouble();
        double p2 = (v1/v2)*p1;
        System.out.println("P2: "+p2);
    }
}
