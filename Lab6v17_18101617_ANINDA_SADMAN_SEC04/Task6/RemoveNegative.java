
public class RemoveNegative {


    
    public static int  removeNegative (int [] input,int in){
        int sum=0;
        for(int i=0;i<in;i++){
            if(input[i]>0){
                sum++;
            }
        }
        int a[]=new int [sum];
        for(int i=0,j=0;i<input.length;i++){
            if(input[i]>0){
                a[j]=input[i];
                j++;
            }
        }
        return a.length;
        
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, -44, 66, -11, 1, 88, -45, 10, -9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int noOdd = removeNegative(mixedArray,mixedArray.length);
        
        System.out.println(noOdd);
        
    }
    
}


