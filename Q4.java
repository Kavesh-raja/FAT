/*
Write a program to give the example of control statements.
 If statements.
 Switch Statements.
 For loop.
 While Statements.
 Do statements
 */
public class Q4 {
    public static void main(String[] args) {
        //Increment & Decrement
        int x = 5;
        System.out.println("Increment and decrement operatior");
        int y = 10;
        x++;
        System.out.println("The value of x after increment: "+x);
        y--;
        System.out.println("The value of y after decrement: "+y);
        System.out.println();

        //Bitwise complement operator
        int a = 45;
        int b = ~a;
        System.out.println("Bitwise complement operator");
        System.out.println("The bitwise complement of a is: "+b);
        System.out.println();

        //Arithmetic operator
        double m =10;
        double n =3;
        System.out.println("arithmatic operator");
        System.out.println("Addition: "+(m+n));
        System.out.println("Subraction: "+(m-n));
        System.out.println("Multiplication: "+(m*n));
        System.out.println("Division: "+(m/n));
        System.out.println("Modulus: "+(m%n));
        System.out.println();

        //Relational operator
        int k = 10;
        int r = 100;
        System.out.println("Relational operator");
        if (k>r){
            System.out.println("k>r");
        }
        else if (k==r) {
            System.out.println("k=r");
        } else if (k<r) {
            System.out.println(k<r);
        }
        System.out.println();

        //Bitwise operator
        int e = 10;
        int f = 12;
        System.out.println("Bitwise operator");
        if (e>10 || f>10){
            System.out.println("either e or f is grater than 10");
        }
        if (e<20 && f>10){
            System.out.println("e is lesser than 20 and f is frater than 10");
        }
        System.out.println();

        //Conditional operator
        int g= 10;
        int h = (g==1)?g+1:g+2;
        System.out.println("Conditional operator");
        System.out.println("The value of h is: "+h);


    }
}
