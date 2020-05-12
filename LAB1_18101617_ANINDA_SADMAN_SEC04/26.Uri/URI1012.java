import java.util.*;
public class URI1012 {
    public static void main(String[] args) {
    Scanner sc=new Scanner( System.in);

   
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double tri=.5*a*c;
    System.out.printf("TRIANGULO: %.3f\n",tri);
    double cir= c*c*3.14159;
    System.out.printf("CIRCULO: %.3f\n",cir);
    double trap=(a+b)/2.0*c;
    System.out.printf("TRAPEZIO: %.3f\n",trap);
    double sq=b*b;
    System.out.printf("QUADRADO: %.3f\n",sq);
    double rec=a*b;
     
    
    
    System.out.printf("RETANGULO: %.3f\n",rec);
    }
}