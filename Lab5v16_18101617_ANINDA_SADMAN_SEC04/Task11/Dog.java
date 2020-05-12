public class Dog { 
    private String color = "Black";
    public Dog(){
    }
    public Dog(String color){
        this.color=color;
    }
    public void bark(){
        System.out.println(color+" dog is barking");
    }
    public void changeColor(String color){
        this.color=color;
    }
 
} 
