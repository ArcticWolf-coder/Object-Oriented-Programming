import java.util.*;
public class L6 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   
    
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2==0){
        sum-=i*i;
      } else {
        sum+=i*i;
      }
    }
    System.out.println(sum);
    
    
   
    
    
    
    
  }
  
  
}

  