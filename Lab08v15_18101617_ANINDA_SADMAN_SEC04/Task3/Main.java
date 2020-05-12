import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter radius of Circle: ");
        double num1=sc.nextDouble();
        Circle a=new Circle(num1);
        System.out.println("The area of the Circle is: "+a.space());
        System.out.println();
        System.out.println("Enter radius of Sphere: ");
        double num2=sc.nextDouble();
        Sphere b=new Sphere(num2);

        System.out.println("The area of the Sphere is: "+b.space());
    }
}
