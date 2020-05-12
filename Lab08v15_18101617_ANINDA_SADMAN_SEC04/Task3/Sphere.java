public class Sphere extends Point{
    public Sphere(double r){
        super(r);
        System.out.println("Creating a Sphere ...done!");
    }
    double space ( ) {

        return 4*Math.PI*getRadius()*getRadius();
    }
}
