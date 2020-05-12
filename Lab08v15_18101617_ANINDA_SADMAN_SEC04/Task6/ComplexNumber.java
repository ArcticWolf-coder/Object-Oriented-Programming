public class ComplexNumber extends RealNumber{
    private double ImaginaryValue;
    public void setImaginaryValue(double i){
        this.ImaginaryValue=i;
    }

    public double getImaginaryValue() {
        return ImaginaryValue;
    }

    public ComplexNumber(){
        setRealValue(1);
        setImaginaryValue(1);
    }
    public ComplexNumber(double r,double i){
        setRealValue(r);
        setImaginaryValue(i);
    }
    public void check(){
        System.out.println("I'm in ComplexNumber class");
        ping();
        System.out.println("Checking ended");
    }
    public String toString(){
        String s="";
        s+=super.toString()+"\n";
        s+="ImaginaryPart: "+getImaginaryValue();
        return s;
    }
}
