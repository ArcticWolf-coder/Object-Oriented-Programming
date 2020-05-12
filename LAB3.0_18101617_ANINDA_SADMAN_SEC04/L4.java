import java.util.*;
public class L4 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   
    int [] a=new int [5];
    b: for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      for(int j=0;j<i;j++){
        if(a[j]==a[i]){
          System.out.println("This number is already among the entered numbers. Enter again");
          i--;
          continue b;
        }
      }
     
      
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    
   
    
    
    
    
  }
  
  
}

  