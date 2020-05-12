package Q8;

public class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("in the playing method of Guitar");
    }
    public void adjust() {
        System.out.println("in the adjusting method of Guitar");
    }
}
