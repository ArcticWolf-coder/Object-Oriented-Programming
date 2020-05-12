import java.util.*;
public class L8 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   int a[]=new int [10];
   int b[]=new int[10];
    c: for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
    if(b[a[i]]>3){
      System.out.println("You have entered more than 4 times type again");
      i--;
      continue c;
    }
    b[a[i]]++;
    }
   
    for(int i=0;i<b.length;i++){
      if(b[i]>1 ){
      System.out.println(i);
      }
    }
    
   
    
    
    
    
  }
  
  
}

  