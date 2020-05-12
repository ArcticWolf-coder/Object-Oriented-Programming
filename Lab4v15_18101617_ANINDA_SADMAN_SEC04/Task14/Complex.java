public class Complex{
    double realPart;
    double imaginaryPart;

    public Complex(){

    }
    public Complex(double realPart,double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    public Complex add(Complex otherNumber){
        Complex c=new Complex();
        c.realPart=realPart+otherNumber.realPart;
        c.imaginaryPart=imaginaryPart+otherNumber.imaginaryPart;
        return c;

    }
    public Complex subtract(Complex otherNumber){
        Complex c=new Complex();
        c.realPart=realPart-otherNumber.realPart;
        c.imaginaryPart=imaginaryPart-otherNumber.imaginaryPart;
        return c;

    }
    public Complex multiply(Complex otherNumber){
        Complex c=new Complex();
        c.realPart=realPart*otherNumber.realPart;
        c.imaginaryPart=imaginaryPart*otherNumber.imaginaryPart;
        return c;

    }
    public Complex divide(Complex otherNumber){
        Complex c=new Complex();
        c.realPart=realPart/otherNumber.realPart;
        c.imaginaryPart=imaginaryPart/otherNumber.imaginaryPart;
        return c;

    }
    public void setRealPart(double realPart){
        this.realPart=realPart;
    }
    public void setImaginaryPart(double realPart){
        this.imaginaryPart=realPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public String toString(){
        String s="";
        if(realPart==0){

        }else {
            s += realPart;
        }
        if(imaginaryPart==0){

        } else if(imaginaryPart>0) {
            s += "+";
            s += imaginaryPart;
            s += "i";
        } else {
            s += imaginaryPart;
            s += "i";
        }
        return s;
    }
}
