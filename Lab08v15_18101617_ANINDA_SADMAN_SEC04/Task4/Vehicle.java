public class Vehicle {
    private int x;
    private int y;
    public void moveUp(){
        y++;

    }
    public void moveLeft(){
        x--;
    }
    public void moveDown(){
        y--;
    }
    public void moveRight(){
        x++;
    }
    public String toString(){
        return("("+x+", "+y+")");
    }
}
