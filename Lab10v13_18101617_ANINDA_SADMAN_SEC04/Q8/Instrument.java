package Q8;

public abstract class Instrument {
    public abstract void play();
    public abstract void adjust();
    public void compose(){
        System.out.println("In the composing method of instrument");
    }
}
