public class Q7a {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the triangle

        for (int i = 0; i < rows; i++) {
            if (i==0){
                System.out.println("1");
            }
            else {
                int sq = (2*(i+1))-1;
                System.out.print("1 ");
                for (int j=0;j<(sq-2);j++){
                    System.out.print("0 ");
                }
                System.out.println("1");
            }
        }
    }
}
