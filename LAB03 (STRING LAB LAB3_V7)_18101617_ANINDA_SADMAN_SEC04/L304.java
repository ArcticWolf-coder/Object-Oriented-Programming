import java.util.*;
public class L304 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int []a=new int [26];
         for(int i=0;i<s.length();i++){
             a[s.charAt(i)-65]++;
         }
         for(int i=0;i<a.length;i++){
             int n=i+65;
             System.out.println((char)(n)+" which is "+n+" was found "+a[i]+" times");
         }
    
    
    }
}