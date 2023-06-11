/*Write a program to calculate the following
         Find the length of array.
         Demonstrate a one-dimensional array.
         Demonstrate a two-dimensional array.
         Demonstrate a multi-dimensional array.

 */
import java.util.Arrays;
public class Q6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("One dimensional array:"+Arrays.toString(arr));
        System.out.println("The length of array is :"+arr.length);
        int arr2[][] = {{1,2},{2,4}};
        System.out.println("Two dimenstional array:"+Arrays.deepToString(arr2));
        int arr3[][][]= {{{1,2,3},{4,5,6}},{{1,2,3}},{{1,2,3}}};
        System.out.println("Three dimenstional array:"+Arrays.deepToString(arr3));
    }
}
