//Write a program check two strings are equal or not.
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String s1 = inp.nextLine();
        System.out.println("Enter the 2nd String:");
        String s2 = inp.nextLine();
        if (s1.equals(s2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
