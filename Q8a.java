import java.util.*;
public class Q8a {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = inp.nextInt();
        if (num<=1){
            System.out.println("Enter a number grater than 1.");
        }
        else {
            int count = 0;
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%2==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not a prime");
            }
        }
    }
}
