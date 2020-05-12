package Q9;
import java.util.*;
public class StTest {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student a[]=new Student[n];
        for(int i=0;i<n;i++){
            a[i]=new Student(sc.next(),sc.next(),sc.next());
        }
        for(int i=0;i<a.length-1;i++){
            Student max=a[i];
            int pos=i;
            for(int j=i+1;j<a.length;j++){
                if(max.getName().compareTo(a[j].getName())<0){
                    max=a[j];
                    pos=j;
                }
            }
            Student temp=a[i];
            a[i]=max;
            a[pos]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].getName());
        }
    }
}
