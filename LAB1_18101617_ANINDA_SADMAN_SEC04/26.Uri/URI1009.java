import java.util.*;
public class URI1009 {
    public static void main(String[] args) {
    Scanner sc=new Scanner( System.in);
 
    String  a=sc.nextLine();
   
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    
    double dif=b +((15*c)/100);
    
    
    System.out.printf("TOTAL = R$ %.2f\n",dif);
    }
}