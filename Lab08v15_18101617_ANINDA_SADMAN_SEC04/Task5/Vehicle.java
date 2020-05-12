public class Vehicle {
    public int x;
    public int y;
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
