import java.util.*;
public class Med02 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String x="";
         
         p:for(int l=1;l<2;l++){
         x=sc.nextLine();
         char[]a=new char[x.length()];
        
         for(int i=0;i<x.length();i++){
             a[i]=(char)x.charAt(i);
             for(int j=0;j<i;j++){
                 if(a[j]==a[i]){
                     System.out.println("'"+a[i]+"' has been counted more than once in the word "+'"'+x+'"'+"..");
                     System.out.println("Please enter another word");
                     l--;
                     continue p;
                 }
             }
             
         }
         }
        
            System.out.println("You entered "+x);
       
         
                     
         
        
       
         
    
    
    }
}