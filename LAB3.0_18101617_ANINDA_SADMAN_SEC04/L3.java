import java.util.*;
public class L3 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   
    int [] a=new int [10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      
    }
    for(int i=0;i<a.length-1;i++){
        int max=a[i];
        int pos=i;
        for(int j=i+1;j<a.length;j++){
            if(a[j]>max){
                max=a[j];
                pos=j;
            }
        }
        int temp=a[i];
        a[i]=max;
        a[pos]=temp;
    }
            
        
        
    
    for(int j=0;j<a.length;j++){
      System.out.println(a[j]);
    }
   
    
    
    
    
  }
  
  
}

  