package Q4;

public class Sphere extends Shape{
    private double radius;


    public Sphere(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.PI*getRadius()*getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "Sphere";
    }
}
