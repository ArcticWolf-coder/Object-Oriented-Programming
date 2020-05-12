import java.util.*;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock firstClock = new Clock(sc.nextInt());
        for (int i = 1; i <= 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }

        Clock secondClock=new Clock(sc.nextInt(),sc.nextInt(),sc.nextInt());
        for (int i = 1; i <= 10; i++) {
            secondClock.tick();
            System.out.println(secondClock);
        }

        firstClock.addClock(secondClock);
        System.out.println(firstClock);
        System.out.println(secondClock);
        Clock thirdClock=firstClock.subtractClock(secondClock);

    }
}
