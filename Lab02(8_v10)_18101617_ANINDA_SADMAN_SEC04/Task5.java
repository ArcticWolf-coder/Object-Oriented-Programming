import java.util.*;
public class Task5 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        boolean b=false;
        int num=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                b=true;
            
            }
        }
        if(b){
          System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }
}