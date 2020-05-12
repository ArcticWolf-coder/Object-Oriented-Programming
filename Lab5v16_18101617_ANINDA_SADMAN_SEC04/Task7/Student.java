public class Student{
    private String name="default name";
    public static int numberOfStudents;
    public String getName(){
        return name;
    }
    public Student(){
        numberOfStudents++;
    }
    public Student(String name){
        this.name=name;
        numberOfStudents++;
    }
}