package Q8;

public class Keyboard extends Instrument {
    @Override
    public void play() {
        System.out.println("in the playing method of Keyboard");
    }
    public void adjust(){
        System.out.println("In the adjusting method of Keyboard");
    }
}
