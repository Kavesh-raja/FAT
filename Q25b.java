import java.util.*;
class Q25 {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = inp.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}