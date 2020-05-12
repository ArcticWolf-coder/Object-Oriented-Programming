import java.util.*;
public class L10 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   
    int []a=new int [10];
    int sum=0;
    for(;;){
        a[sc.nextInt()]++;
        for(int i=0;i<a.length;i++){
            if(a[i]>1){
                sum++;
            }
        }
        if(sum==2){
            break;
        }
        sum=0;
    }
    for(int i=0;i<a.length;i++){
        if(a[i]>1){
            System.out.println(i);
        }
    }
    
   
    
    
    
    
  }
  
  
}

  