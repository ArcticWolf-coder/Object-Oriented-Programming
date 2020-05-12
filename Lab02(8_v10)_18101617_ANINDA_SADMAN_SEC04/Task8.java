import java.util.*;
public class Task8 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        c:for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            for(int j=0;j<i;j++){
                if(a[j]==a[i]){
                    System.out.println("Duplicate number enter again");
                    i--;
                    continue c;
                }
            }
            
        }
        
        
    }
}