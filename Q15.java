import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        System.out.println(0);
        System.out.println(1);
        for (int i =0;i<k-2;i++){
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
