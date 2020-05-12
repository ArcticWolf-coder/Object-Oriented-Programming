import java.util.*;
public class L5 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   
    
    double e=sc.nextDouble();
    double r=sc.nextDouble();
    double l=sc.nextDouble();
    double c=sc.nextDouble();
    double f=sc.nextDouble();
    double i=e/Math.sqrt(r*r+Math.pow((2*Math.PI*f*l-1/2*Math.PI*f*c),2));
    System.out.printf("%.4f\n",i);
    
    
   
    
    
    
    
  }
  
  
}

  