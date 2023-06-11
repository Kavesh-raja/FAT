import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = inp.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(i+" x "+num+" = "+(i*num));
        }
    }
}
