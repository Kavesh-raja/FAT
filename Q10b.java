
public class Q10b {
    public static void main(String[] args) {
        int matrix1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][] = {{9,8,7},{6,5,4},{3,2,1}};
        int rows = matrix1.length;
        int colums = matrix2[0].length;
        int result[][]=new int[rows][colums];
        for (int i = 0;i<rows;i++){
            for (int j = 0;j<colums;j++){
                result[i][j] = matrix1[i][j]*matrix2[i][j];
            }
        }
        System.out.println("Result");
        for (int m = 0; m<rows;m++){
            for (int n =0;n<colums;n++){
                System.out.print(result[m][n]+" ");
            }
            System.out.println();
        }
    }
}
