import java.util.*;
public class Task6 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [15];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int []b=new int [10];
       
        for(int i=0;i<a.length;i++){
            
                
            
            b[a[i]]++;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(i+" : "+b[i]+" times");
        }
        
    }
}