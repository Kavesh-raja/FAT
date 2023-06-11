public class Q7c {
    public static void main(String[] args) {
        int rows =6;
        int cst =1;
        for (int i =0;i<rows;i++){
            for (int j =0;j<i+1;j++){
                System.out.print(cst+" ");
                cst++;
            }
            cst=1;
            System.out.println();
        }
    }
}
