package Q11;
import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws Exception{

        Scanner sc =new Scanner (new File("a.txt") );
        int s=0;
        while(sc.hasNextLine()){
            s+=Integer.parseInt(sc.nextLine());

        }
        System.out.println(s);
    }
}