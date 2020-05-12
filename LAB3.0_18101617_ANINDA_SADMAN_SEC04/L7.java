import java.util.*;
public class L7 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   int a[]=new int [11];
   int b[]=new int[10];
    c: for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
    if(b[a[i]]>3){
      System.out.println("You have entered "+a[i]+" more than 4 times type again");
      i--;
      continue c;
    }
    b[a[i]]++;
    }
   
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    
   
    
    
    
    
  }
  
  
}

  