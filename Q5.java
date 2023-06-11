/*
Write a program to give the example of control statements.
 If statements.
 Switch Statements.
 For loop.
 While Statements.
 Do statements
 */
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = inp.nextInt();
        int mod =num1%2;
        //if - else
        if (mod==0){
            System.out.println("It is a even num.");
        }
        else {
            System.out.println("It is a odd num.");
        }
        System.out.println();


        //Switch statement
        switch (mod){
            case 1:
                System.out.println("It is odd num.");
                break;
            case 0:
                System.out.println("It is even num.");
        }
        System.out.println();

        //For loop4444
        for (int i = 0; i<num1;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //While loop
        while (mod==0){
            System.out.println("It is even");
        }
        while (mod!=0){
            System.out.println("It is odd");
        }
    }
}
