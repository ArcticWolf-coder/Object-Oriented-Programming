import java.util.*;
public class Hard04 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         String x=sc.next();
         String s="";
         for(int i=0;i<x.length();i++){
             if(x.charAt(i)==90){
                 s+=(char)(64+n);
             } else if(x.charAt(i)==122){
                 s+=(char)(95+n);
             } else {
             s+=(char)((int)x.charAt(i)+n);
             }
         }
             
         
        
            
       
            System.out.println(s);
       
         
         
                     
         
        
       
         
    
    
    }
}