import java.util.*;
public class Hard03 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String x=sc.next();
         String a=x.toUpperCase();
         String s="";
         String sum="";
         for(int i=0;i<x.length();i++){
             s+=x.charAt(i);
             if(x.charAt(i)==a.charAt(i)){
                 for(int j=s.length()-1;j>=0;j--){
                     sum+=s.charAt(j);
                 }
                 s="";
             }
         }
         System.out.println(sum);
         
         
                     
         
        
       
         
    
    
    }
}