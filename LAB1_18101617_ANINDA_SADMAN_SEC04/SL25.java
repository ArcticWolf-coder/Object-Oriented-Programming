import java.util.*;
public class SL25 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    n++;
    
    for(int i=1;i<=n;i++){
      
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
        
        
      }
      System.out.print(0);
      if(i!=1){
          System.out.print(" ");
      }
      for(int j=1;j<i;j++){
          System.out.print(j+" ");
      }
      for(int j=i-2;j>=1;j--){
          System.out.print(j+" ");
      }
     
      if(i!=1){
          System.out.print(0);
      }
      System.out.println();
    }
      
    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
        
      }
      System.out.print(0);
      if(i!=1){
          System.out.print(" ");
      }
      for(int j=1;j<i;j++){
          System.out.print(j+" ");
      }
      for(int j=i-2;j>=1;j--){
          System.out.print(j+" ");
      }
      if(i!=1){
          System.out.print(0);
      }
      System.out.println();
    }
    
    
    
  }
  
  
}

  