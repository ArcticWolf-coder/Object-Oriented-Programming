import java.util.*;
import java.io.*;
public class Trim {

	public static char [] trim(char [] input){
		
		char[]c=new char[input.length];
		String s="";
		for(int i=0,j=0;i<input.length;i++){
			c[j]=input[i];
			j++;
			if(input[i]==' '){
				for(;;){
					if(input[i]==' '){
						i++;
					} else {
						i--;
						break;
					}
				}
			}
			
			
		}
		
		return c;
	  }
	  public static void main(String [] args){
	    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
	    for (int i = 0; i< input.length; i++){
	      System.out.print(input[i]);
	    }
	    System.out.println("");
	    char []  output = trim(input);
	    for (int i = 0; i< output.length; i++){
	      System.out.print(output[i]);
	    }
	    System.out.println("");    
	  }
	}
