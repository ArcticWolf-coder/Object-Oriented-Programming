import java.util.*;
public class SL09 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      if(i==n){
        for(int j=1;j<=n;j++){
          System.out.print(j);
        }
        System.out.println();
      } else {
        for(int j=1;j<=i;j++){
        if(j==1 || j==i){
          System.out.print(j);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    }
    
    
    
    
    
  }
  
  
}