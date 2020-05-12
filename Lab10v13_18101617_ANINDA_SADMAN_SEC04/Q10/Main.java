package Q10;
import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws Exception{

        Scanner sc =new Scanner (new File("a.txt") );
        String s=sc.next();
        int x=Integer.parseInt(s);
        s=sc.next();
        int y=Integer.parseInt(s);
        s=sc.next();
        int z=Integer.parseInt(s);
        System.out.println(x+y+z);

    }
}
