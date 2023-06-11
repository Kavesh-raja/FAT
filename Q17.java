import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        String str = "madam";
        char str1[] = str.toCharArray();
        char str2[]= new char[str1.length];
        int len = str1.length;
        for (int i=0;i<str1.length;i++){
            str2[len-1]=str1[i];
            len--;
        }
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        if (Arrays.toString(str1).equals(Arrays.toString(str2))){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
