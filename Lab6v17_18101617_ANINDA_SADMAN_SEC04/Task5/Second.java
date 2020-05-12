import java.util.*;
public class Second{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int [] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[(int)s.charAt(i)-65]++;
        }
        int max=a[0];
        int pos=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                pos=i;
            }
        }
        a[pos]=0;
        max=a[0];
        pos=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                pos=i;
            }
        }
        System.out.println((char)(pos+65));
    }
}