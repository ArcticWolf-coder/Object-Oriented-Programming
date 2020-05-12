package Q5;

public class Rectangle extends Shape{
    public double width;
    public double length;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
    public String toString(){
        return "Rectangle with area"+getArea()+" and perimeter "+getPerimeter();
    }
}
