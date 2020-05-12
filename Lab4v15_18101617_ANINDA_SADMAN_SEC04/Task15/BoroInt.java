
public class BoroInt {
 String val;
 public BoroInt(String value){
  
  val=value;
 
 }
 public BoroInt(int v){
  val=Integer.toString(v);
  
 }
 public BoroInt(){
  val="0";
 }
 public BoroInt(BoroInt v){
  this.val=v.val;
 }
 public String trim(String val){
  val=val.trim();
  return val;
 }
 public boolean validValue(String val){
  char[]c=val.toCharArray();
  boolean b=true;
  for(int i=0;i<c.length;i++){
   if(c[i]=='0' ||c[i]=='1' ||c[i]=='2'|| c[i]=='3'|| c[i]=='4' || c[i]=='5' ||c[i]=='6' || c[i]=='7' ||c[i]=='8' ||c[i]=='9'){
    
   } else b=false;
  }
  return b;
 }
 public BoroInt add(BoroInt val){
  int s=Integer.parseInt(this.val);
  s+=Integer.parseInt(val.val);
  BoroInt p=new BoroInt();
  p.val=Integer.toString(s);
  return p;
 }
 public BoroInt subtract(BoroInt val){
  int s=Integer.parseInt(this.val);
  s-=Integer.parseInt(val.val);
  BoroInt p=new BoroInt();
  p.val=Integer.toString(s);
  return p;
 }
 public BoroInt multiply(BoroInt val){
  int s=Integer.parseInt(this.val);
  s*=Integer.parseInt(val.val);
  BoroInt p=new BoroInt();
  p.val=Integer.toString(s);
  return p;
 }
 public BoroInt divide(BoroInt val){
  int s=Integer.parseInt(this.val);
  s/=Integer.parseInt(val.val);
  BoroInt p=new BoroInt();
  p.val=Integer.toString(s);
  return p;
 }


 public String toString(){
     String s=val;
     return s;
  
 }
}
