public class Vehicle2010 extends Vehicle{
    public void moveLowerLeft(){
        moveLeft();
        moveDown();
    }
    public void moveLowerRight(){
        moveDown();
        moveRight();
    }
    public void moveUpperRight(){
        moveRight();
        moveUp();
    }
    public void moveUpperLeft(){
        moveUp();
        moveLeft();
    }

    public boolean equals(Vehicle2010 a){
        if(x==a.x && y==a.y){
            return true;
        } else {
            return false;
        }
    }

}
