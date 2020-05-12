package Q2;
import java.util.*;
public class Main{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee("Frank",15000,2018,"abc123");
        System.out.printf("%s %f %d %s\n",e.getName(),e.salary,e.year,e.insNum);
        
    }
}