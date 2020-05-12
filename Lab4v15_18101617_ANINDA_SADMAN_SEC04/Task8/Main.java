
import java.util.*;
import java.io.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student john=new Student();
		Student mike=new Student();
		Student carol=new Student();
		john.setAddress("Banani");
		mike.setAddress("Gulshan");
		carol.setAddress("Dhanmondi");
	    john.setID("001");
	    mike.setID("002");
	    carol.setID("003");
	    john.setCGPA(3.7);
	    mike.setCGPA(3.3);
        carol.setCGPA(3.5);
       
        System.out.println("John : \n address : "+john.getAddress()+"\nid : "+john.getID()+"\ncgpa :"+john.getCGPA());
        System.out.println("Mike : \n address : "+mike.getAddress()+"\nid : "+mike.getID()+"\ncgpa :"+mike.getCGPA());
        System.out.println("Carol : \n address : "+carol.getAddress()+"\nid : "+carol.getID()+"\ncgpa :"+carol.getCGPA());
        
	}

}
