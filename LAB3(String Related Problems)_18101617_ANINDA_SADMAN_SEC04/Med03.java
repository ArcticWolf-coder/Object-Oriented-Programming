import java.util.*;
public class Med03 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String x=sc.nextLine();
         int sum=0;
         for(int i=0;i<x.length();i++){
             sum+=x.charAt(i);
         }
         int s=x.length();
         String y=sc.nextLine();
         x=x.concat(" ");
         x=x.concat(y);
         for(int i=0;i<y.length();i++){
             sum+=y.charAt(i);
         }
         System.out.println(x+"\n"+sum);
         
         
                     
         
        
       
         
    
    
    }
}