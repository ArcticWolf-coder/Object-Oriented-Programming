import java.util.*;
public class Easy3 {
    public static void main (String [] args){
        
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         char []a=s.toCharArray();
         for(int i=0;i<s.length();i++){
             if(a[i]==' '){
             } else 
             a[i]=(char)((int)s.charAt(i)-1);
             
         }
         System.out.println(a);
         
    }
}