import java.util.*;
public class Hard02 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String x=sc.next();
         String y=sc.next();
         int a=1;
         int b=1;
         for(int i=0;i<x.length();i++){
             a*=x.charAt(i)-64;
         }
         for(int i=0;i<y.length();i++){
             b*=y.charAt(i)-64;
         }
       
         a=a%14;
         b=b%14;
       
         if(a<b){
             System.out.println("I am Happy With My Coach");
         } else {
             System.out.println("I am Sad With My Coach");
         }
         
         
                     
         
        
       
         
    
    
    }
}