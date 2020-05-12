package Q13;
import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws Exception {

        Scanner sc = new Scanner(new File("a.txt"));
        int s=0;
        while(sc.hasNextInt()){

            s+=sc.nextInt();

        }
        System.out.println(s);


    }

}

