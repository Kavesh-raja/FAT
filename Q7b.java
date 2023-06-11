public class Q7b {
    public static void main(String[] args) {
        int rows = 6;
        int r = rows;
        for (int i = 0;i<rows;i++){
            int m = r-1;
            for (int j = 0;j<i+1;j++){
                System.out.print(m+" ");
                m++;
            }
            r--;
            System.out.println();
        }


    }


}
