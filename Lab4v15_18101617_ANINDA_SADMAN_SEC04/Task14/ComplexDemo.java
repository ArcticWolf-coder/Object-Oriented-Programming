import java.util.*;
public class ComplexDemo {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Complex a=new Complex();
        a.setRealPart(5);
        a.setImaginaryPart(3);
        System.out.println(a);
        Complex b=new Complex(3,5);
        Complex sum=a.add(b);
        Complex diff=a.subtract(b);
        Complex prod=a.multiply(b);
        Complex quo=a.divide(b);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quo);
    }
}
