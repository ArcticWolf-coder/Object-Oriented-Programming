
import java.util.*;
import java.io.*;
public class Main {

 
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  BoroInt c=new BoroInt(300);
  BoroInt d=new BoroInt(200);
  BoroInt sum=c.add(d);
  
  System.out.println(sum);  
  BoroInt diff=c.subtract(d);
  System.out.println(diff);  
  BoroInt prod=c.multiply(d);
  System.out.println(prod);  
  BoroInt quo=c.divide(d);
  System.out.println(quo);  
  
      
 }

}