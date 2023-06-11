import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
