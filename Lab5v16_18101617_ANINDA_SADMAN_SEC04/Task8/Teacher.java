public class Teacher {
    String name;
    String department;
    
    public Course a[];
    public int count=0;
    public Teacher(String name, String department){
        this.name=name;
        this.department=department;
    }
    public void addCourse(Course c){
      count++;
      if(count==1){
        a=new Course[1];
        a[0]=c;
      } else{
      Course b[]=new Course[count];
      for(int i=0;i<a.length;i++){
        b[i]=a[i];
      }
      b[count-1]=c;
      a=b;
      }
      
        
    }
    public void printDetail(){
        System.out.println("========================");
        System.out.println("Name: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("List of courses\n========================");
        for(int i=0;i<a.length;i++){
          System.out.println(a[i].course);
        }
        System.out.println("========================");
    }
}
                               
        