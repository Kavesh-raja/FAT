import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = 4;
        for (int i =0; i<num;i++){
            int count =i+1;
            for (int j =num ;j>0;--j){
                if (j-1<count && (i+2)%2==0){
                    System.out.print("* ");
                } else if (j-1<count && (i+2)%2!=0) {
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
