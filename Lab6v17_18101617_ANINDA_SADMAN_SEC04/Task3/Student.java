public class Student{
    private String name;
    private String id;
    private String address;
    private double cgpa;
    
    public Student(){
        name="Ei name e kono student nai";
        id="Student ei nai, abar id :P";
        address="Naam nai .. thikana ashbe koi theke?";
        cgpa=-4.0;
        
    }
    public Student(String n, String i, String a, double c){
        name=n;
        id=i;
        address=a;
        cgpa=c;
    }
    public void standUp(){
        System.out.println(name+" is now standing up!!");
    }
    public String tellMeYourName(){
        String b="Sir,my name is ";
        b+=name;
        return b;
    }
    public void call(String b){
        System.out.println(name+": Hey, "+b+", Sir is calling you!!");
    }
    public int add2Numbers(int a,int b){
        return (a+b);
    }
    public void nameBoshao(String a){
        name=a;
    }
    public void addressBoshao(String a){
        address=a;
    }
    public void idBoshao(String a){
        id=a;
    }
    public void cgpaBoshao(double a){
        cgpa=a;
    }
    public String nameDao(){
        return name;
    }
    public String addressDao(){
        return address;
    }
    public double cgpaDao(){
        return cgpa;
    }
    public String boloToAmiKe(){
        return id;
    }
}
    

        