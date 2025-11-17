package javaratan;

public class Student {
	String sname; 
	 int sid; 
	 static String college="SSCET"; 
	 
	 Student(String sname,int sid) 
	 { 
     this.sname=sname; 
	  this.sid=sid; 
	 } 
	 void display() 
	 { System.out.println("student id="+sid); 
	  System.out.println("student name="+sname); 
	  System.out.println("student college="+college); 
	 } 
	 public static void main(String[] args)  
	 { 
	  Student s1  = new Student("ratan",111); 
	  s1.display(); 
	  Student s2  = new Student("anu",222); 
	  s2.display();

}
}