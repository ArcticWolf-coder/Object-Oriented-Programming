
public class MyString {
	public char[] element;
	
	public MyString(){
		
	}
	
	public MyString(char[] charSeq){
		this.element=new char[charSeq.length];
		for(int i=0;i<charSeq.length;i++){
			element[i]=charSeq[i];
		}
	}
	
	public MyString(String str){
		this.element=str.toCharArray();
	}
	
	public int length(){
		int sum=this.element.length;
		
		return sum;
	}
	
	public char charAt(int n){
		if(n<element.length && n>=0){
			System.out.println("Invalid index");
			return ' ';
		} else {
			char c=element[n];
			return c;
		}
	}
	
	public MyString replaceFirst(char oldChar, char newChar){
		MyString a=new MyString(this.element);
		for(int i=0;i<this.length();i++){
			if(a.element[i]==oldChar){
				a.element[i]=newChar;
				break;
			}
		}
		return a;
	}
	
	public MyString replaceAll(char oldChar, char newChar){
		MyString a=new MyString(this.element);
		for(int i=0;i<this.length();i++){
			if(a.element[i]==oldChar){
				a.element[i]=newChar;
				
			}
		}
		return a;
	}
	
	public MyString replaceLast(char oldChar, char newChar){
		MyString a=new MyString(this.element);
		for(int i=a.length()-1;i>=0;i--){
			if(a.element[i]==oldChar){
				a.element[i]=newChar;
				break;
			}
		}
		return a;
	}
	
	public boolean startsWith(MyString prefix){
		
		char [] a=prefix.element;
		
		for(int i=0;i<a.length;i++){
			if(a[i]==element[i]){
				
			}else {
				return false;
			}
		}
		
		
		return true;
	}
	
	public boolean startsWith(String prefix){
	
		char [] a=prefix.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]==element[i]){
				
			}else {
				return false;
			}
		}
		
		
		return true;
	}
	
	public boolean endsWith(MyString prefix){
			
			char [] a=prefix.element;
			for(int i=a.length-1;i>=0;i--){
				if(a[i]==element[i]){
					
				}else {
					return false;
				}
			}
			
			
			return true;
	}
	
	public boolean endsWith(String prefix){
		MyString p=new MyString(prefix);
		
		char [] a=p.element;
		for(int i=a.length-1;i>=0;i--){
			if(a[i]==element[i]){
				
			}else {
				return false;
			}
		}
		
		
		return true;
	}
	
	//matches("^[a-pA-P0-9]*$"
	
	public MyString toLowerCase(){
		MyString a=new MyString(this.element);
		for(int i=0;i<a.element.length;i++){
			if((int)a.element[i]<97){
				a.element[i]=(char)((int)a.element[i]+32);
			}
		}
		
		return a;
	}
	
	public MyString toUpperCase(){
		MyString a=new MyString(this.element);
		for(int i=0;i<a.element.length;i++){
			if((int)a.element[i]>96){
				a.element[i]=(char)((int)a.element[i]-32);
			}
		}
		
		return a;
	}
	
	public boolean equals(MyString rightStr){
		if(!(rightStr.element.length==element.length)){
			return false;
		}
		for(int i=0;i<element.length;i++){
			if(element[i]!=rightStr.element[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean equalsIgnoreCase(MyString rightString){
		MyString c=rightString.toLowerCase();
		MyString d=this.toLowerCase();
		if(c.element.length!=d.element.length){
			return false;
		}
		for(int i=0;i<c.element.length;i++){
			if(c.element[i]==d.element[i]){
				
			} else {
				return false;
			}
		}
		return true;
	}
	
	public MyString substring(int start){
		MyString a=new MyString(this.element);
		a.element=new char[a.element.length-start];
		for(int i=0;i<a.element.length;i++){
			a.element[i]=element[start];
			start++;
		}
		return a;
	}
	public MyString substring(int start,int end){
		MyString a=new MyString(this.element);
		a.element=new char[end-start+1];
		for(int i=0;i<a.element.length;i++){
			a.element[i]=element[start];
			start++;
		}
		return a;
	}
	public int indexOf(char ch){
		for(int i=0;i<element.length;i++){
			if(element[i]==ch){
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(char ch){
		for(int i=element.length-1;i>=0;i--){
			if(element[i]==ch){
				return i;
			}
		}
		return -1;
	}
	
	public int indexOf(char ch,int start){
		for(int i=start;i<element.length;i++){
			if(element[i]==ch){
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(char ch,int start){
		for(int i=element.length-1;i>=0;i--){
			if(element[i]==ch){
				return i;
			}
		}
		return -1;
	}

	public int indexOf(MyString str){
		int start;
		for(int j=0;j<element.length;j++){
			if(element[j]==str.element[0]){
				start=j;
				
				char c[]=new char[str.element.length];
				for(int i=start,k=0;k<c.length;i++,j++){
					c[k]=element[i];
				}
				MyString a=new MyString(c);
				
				if(a.equals(str)){
					return start;
				} else {
					return -1;
				}
				
				
			}
		}
		return -1;
		
	}
	
	public int lastIndexOf(MyString str){
		int end;
		for(int j=element.length-1;j>=0;j--){
			if(element[j]==str.element[str.element.length-1]){
				end=j;
				
				char c[]=new char[str.element.length];
				for(int i=c.length-1,k=end;i>=0;i--,k--){
					c[i]=element[k];
				}
				MyString a=new MyString(c);
				
				if(a.equals(str)){
					return end;
				} else {
					return -1;
				}
				
				
			}
		}
		return -1;
		
	}
	
	public int indexOf(String str){
		MyString s=new MyString(str);
		int start;
		for(int j=0;j<element.length;j++){
			if(element[j]==s.element[0]){
				start=j;
				
				char c[]=new char[element.length-start];
				MyString a=new MyString(c);
				
				if(a.equals(s)){
					return start;
				} else {
					return -1;
				}
				
				
			}
		}
		return -1;
		
	}

	public int lastIndexOf(String str){
		MyString s=new MyString(str);
		int end;
		for(int j=element.length-1;j>=0;j--){
			if(element[j]==s.element[s.element.length-1]){
				end=j;
				
				char c[]=new char[s.element.length];
				for(int i=c.length-1,k=end;i>=0;i--,k--){
					c[i]=element[k];
				}
				MyString a=new MyString(c);
				
				if(a.equals(str)){
					return end;
				} else {
					return -1;
				}
				
				
			}
		}
		return -1;
		
	}
	
	public MyString concat(MyString str){
		char c[]=new char[element.length+str.element.length];
		for(int i=0;i<element.length;i++){
			c[i]=element[i];
		}
		for(int i=0,j=element.length;i<str.element.length;i++,j++){
			c[j]=str.element[i];
			
		}
		MyString a=new MyString(c);
		return a;
	}
	
	public MyString concat(String str){
		MyString s=new MyString(str);
		char c[]=new char[element.length+s.element.length];
		for(int i=0;i<element.length;i++){
			c[i]=element[i];
		}
		for(int i=0,j=element.length;i<s.element.length;i++,j++){
			c[j]=s.element[i];
			
		}
		MyString a=new MyString(c);
		return a;
	}
	public MyString concat(char[] charSeq){
		MyString s=new MyString(charSeq);
		char c[]=new char[element.length+s.element.length];
		for(int i=0;i<element.length;i++){
			c[i]=element[i];
		}
		for(int i=0,j=element.length;i<s.element.length;i++,j++){
			c[j]=s.element[i];
			
		}
		MyString a=new MyString(c);
		return a;
	}
	
	public int compareTo(MyString str) {
	    int len1 = element.length;
	    int len2 = str.element.length;
	    int lim = Math.min(len1, len2);
	    char v1[] = element;
	    char v2[] = str.element;

	    int k = 0;
	    while (k < lim) {
	       char c1 = v1[k];
	       char c2 = v2[k];
	       if (c1 != c2) {
	           return c1 - c2;
	       }
	       k++;
	    }
	    return len1 - len2;
	}
	
	public int compareTo(String str) {
		MyString a=new MyString(str);
	    int len1 = element.length;
	    int len2 = a.element.length;
	    int lim = Math.min(len1, len2);
	    MyString b=new MyString(this.element);
	    MyString c=new MyString(a.element);
	    char v1[] = b.element;
	    char v2[] = c.element;

	    int k = 0;
	    while (k < lim) {
	       char c1 = v1[k];
	       char c2 = v2[k];
	       if (c1 != c2) {
	           return c1 - c2;
	       }
	       k++;
	    }
	    return len1 - len2;
	}
	

	public int compareToIgnoreCase(String str) {
		MyString a=new MyString(str);
	    int len1 = element.length;
	    int len2 = a.element.length;
	    int lim = Math.min(len1, len2);
	    MyString b=new MyString(this.element);
	    MyString c=new MyString(a.element);
	    c=b.toLowerCase();
	    c=c.toLowerCase();
	    char v1[] = b.element;
	    char v2[] = c.element;

	    int k = 0;
	    while (k < lim) {
	       char c1 = v1[k];
	       char c2 = v2[k];
	       if (c1 != c2) {
	           return c1 - c2;
	       }
	       k++;
	    }
	    return len1 - len2;
	}

	public int compareToIgnoreCase(MyString str) {
		
	    int len1 = element.length;
	    int len2 = str.element.length;
	    int lim = Math.min(len1, len2);
	    MyString b=new MyString(this.element);
	    MyString c=new MyString(str.element);
	    char v1[] = b.element;
	    char v2[] = c.element;

	    int k = 0;
	    while (k < lim) {
	       char c1 = v1[k];
	       char c2 = v2[k];
	       if (c1 != c2) {
	           return c1 - c2;
	       }
	       k++;
	    }
	    return len1 - len2;
	}
	

}
