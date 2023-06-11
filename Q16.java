import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        String str = "Hii bitch";
        int[] freq = new int[str.length()];
        char string[] = str.toCharArray();

        for(int i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println(Arrays.toString(string));
        System.out.println(Arrays.toString(freq));
        for(int i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
}
