import java.util.Scanner;

public class Q8b {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double num = inp.nextDouble();
        if (num > 0) {
            System.out.println("Y");
        } else {
            System.out.println("n");
        }
    }
}
