import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int a[] = {10,5,33,77};
        int b = a.length;
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }
}
