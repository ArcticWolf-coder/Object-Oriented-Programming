package Q15;
import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws Exception {

        File myFile=new File("a.txt");
        if(myFile.delete()){
            System.out.println("Deleted");
        }


    }

}
