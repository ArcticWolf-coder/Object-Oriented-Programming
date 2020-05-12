package Q9;

public class Student implements StInterface{
    private String name;
    private String ID;
    private String address;

    public Student(String name, String ID, String address){
        setID(ID);
        setName(name);
        this.address=address;
    }
    @Override
    public void setID(String ID) {
        this.ID=ID;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

}
