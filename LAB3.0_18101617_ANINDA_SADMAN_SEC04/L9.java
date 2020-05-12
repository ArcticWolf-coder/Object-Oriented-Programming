import java.util.*;
public class L9 {
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
   
    int [] b=new int [10];
    for(int i=0;i<b.length;i++){
      b[i]=sc.nextInt();
      
    }
    System.out.println("if you want to sort all numbers, enter c, if only at odd positions enter a and if only at even positions, enter b");
    String s=sc.next();
    int a[];
    if(s.equals("c")){
        a=b;
    } else {
        a=new int [5];
        if(s.equals("a")){
            for(int i=0,j=0;i<b.length;i+=2,j++){
                a[j]=b[i];
            }
        } else if(s.equals("b")){
            for(int i=1,j=0;i<b.length;i+=2,j++){
                a[j]=b[i];
            }
        }
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

  