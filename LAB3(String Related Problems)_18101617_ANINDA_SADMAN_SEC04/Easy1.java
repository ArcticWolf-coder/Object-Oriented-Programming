
import java.util.*;


public class Easy1 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = s.toCharArray();
        int b[] = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < a.length - 1; i++) {
            int min = b[i];
            int pos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (b[j] < min) {
                    min = b[j];
                    pos = j;
                }
            }
            char tempC = a[i];
            int temp = b[i];
            b[i] = b[pos];
            a[i] = a[pos];
            b[pos] = temp;
            a[pos] = tempC;
        }
        for (char k : a) {
            System.out.print(k);
        }
        System.out.println();


    }
}
