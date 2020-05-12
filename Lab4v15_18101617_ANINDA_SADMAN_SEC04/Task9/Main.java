
import java.util.*;
import java.io.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount acc1=new BankAccount();
		BankAccount acc2=new BankAccount();
		BankAccount acc3=new BankAccount();
		acc1.setAddress("Banani");
		acc2.setAddress("Gulshan");
		acc3.setAddress("Dhanmondi");
	    acc1.setAccountID("001");
	    acc2.setAccountID("002");
	    acc3.setAccountID("003");
	    acc1.setBalance(3.7);
	    acc2.setBalance(3.3);
        acc3.setBalance(3.5);
acc1.addInterest();
acc2.addInterest();
acc3.addInterest();
       
        System.out.println("Accountant : \naddress : "+acc1.getAddress()+"\nid : "+acc1.getAccountID()+"\ncgpa :"+acc1.getBalance());
        System.out.println("Accountant : \naddress : "+acc2.getAddress()+"\nid : "+acc2.getAccountID()+"\ncgpa :"+acc2.getBalance());
        System.out.println("Accountant : \naddress : "+acc3.getAddress()+"\nid : "+acc3.getAccountID()+"\ncgpa :"+acc3.getBalance());
        
	}

}
