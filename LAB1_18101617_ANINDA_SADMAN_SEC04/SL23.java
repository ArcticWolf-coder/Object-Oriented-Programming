import java.util.*;
public class SL23 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int k=0;
    for(int i=1;i<=n;i++){
      if(i==n){
        for(int j=1;j<=n;j++){
          System.out.print("*");
        }
        System.out.println();
      } else {
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=n-k;j<=n;j++){
        if(j==n-k || j==n){
        System.out.print("*");
      }
       else {
        System.out.print(" ");
      }
      }
      k++;
      System.out.println();
    }
    }
      
    
    
    
    
  }
  
  
}

  