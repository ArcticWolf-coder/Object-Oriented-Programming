package Q1;

public abstract class Animal {
	private String name;
	protected Animal(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract void makeNoise();
}
