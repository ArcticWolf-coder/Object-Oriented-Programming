package Q4;

public class PaintThings {
    public static void main(String [] args){
        Paint p=new Paint(45);
        Rectangle deck=new Rectangle(20,35);
        Sphere bigBall=new Sphere(15);
        Cylinder tank=new Cylinder(10,30);
        System.out.println(p.amount(deck));
        System.out.println(p.amount(bigBall));
        System.out.println(p.amount(tank));
    }
}
