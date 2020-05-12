import java.util.*;
public class Task9 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            
            
        }
        for(int i=0;i<a.length;i+=2){
            System.out.print(a[i]+" , ");
        }
        for(int i=1;i<a.length-1;i+=2){
            System.out.print(a[i]+" , ");
        }
        System.out.println(a[9]+".");
                                 
        
        
    }
}