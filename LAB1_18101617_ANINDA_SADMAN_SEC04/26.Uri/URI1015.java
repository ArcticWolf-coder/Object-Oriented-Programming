import java.util.*;
public class URI1015 {
    public static void main(String[] args) {
    Scanner sc=new Scanner( System.in);
 
   
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double d=sc.nextDouble();
    double x=Math.sqrt(Math.pow((a-c),2)+Math.pow((b-d),2));
    System.out.printf("%.4f\n",x);
    }
}