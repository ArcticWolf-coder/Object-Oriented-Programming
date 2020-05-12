package Q6;

public class MovableCircle {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    public String toString(){
        return "";
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
