import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the gender (M/F):");
        String gender = inp.nextLine();
        if(age>25 && gender.equals("M")){
            System.out.println("Man");
        } else if (age>20 && gender.equals("W")) {
            System.out.println("Woman");
        } else if (age<25 && gender.equals("M")) {
            System.out.println("Boy");
        }else {
            System.out.println("Girl");
        }
    }
}
