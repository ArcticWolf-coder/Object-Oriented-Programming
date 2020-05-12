package Q2;

public class Employee extends Person{
 public double salary;
 public int year;
 public String insNum;
 public Employee(String name,double salary,int year, String insNum){
  super(name);
  this.salary=salary;
  this.year=year;
  this.insNum=insNum;
  
 }
 
}
