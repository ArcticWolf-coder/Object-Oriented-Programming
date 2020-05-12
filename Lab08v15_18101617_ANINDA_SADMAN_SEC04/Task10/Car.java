public class Car {
    private static int objectCount;
    private int Year;

    public int getYear() {
        return Year;
    }

    public static int getObjectCount() {
        return objectCount;
    }
    public Car(int year){
        this.Year=year;
        objectCount++;
    }
}
