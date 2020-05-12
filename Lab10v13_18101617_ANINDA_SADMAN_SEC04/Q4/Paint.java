package Q4;

public class Paint {
    private double coverage;
    public double amount(Shape shape){
        return shape.area()/coverage;
    }
    public Paint(double coverage){
        this.coverage=coverage;
    }
}
