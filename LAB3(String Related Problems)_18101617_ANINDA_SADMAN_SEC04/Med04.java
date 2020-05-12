import java.util.*;
public class Med04 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String x=sc.nextLine();
         String s="";
        s+=x.charAt(0);
         for(int i=1;i<x.length();i++){
             if(x.charAt(i)==x.charAt(i-1)){
                 continue;
             } else {
                 s+=x.charAt(i);
             }
             
             
             
         }
         System.out.println(s);
         
         
                     
         
        
       
         
    
    
    }
}