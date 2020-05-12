import java.util.*;
public class Hard01
{
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         char b[]=s.toCharArray();
         
        int sum=0;
        for(int i=0;i<b.length;i++){
            sum+=b[i]-48;
        }
        if(sum%3==0){
            System.out.println(s+" is divisible by 3.");
        } else {
            System.out.println(s+" is not divisible by 3");
        }
         
         
                     
         
        
       
         
    
    
    }
}