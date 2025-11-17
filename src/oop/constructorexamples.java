package oop;

public class constructorexamples {
	int empid;
	String empname;
	float salary;
	
	constructorexamples(){
		empid=70;
		empname="piya";
	   salary=677099f;
		
	}
	
	void display(){
		System.out.println("employee id is   "  +  empid);
		System.out.println("employee name is  "  +  empname);
		System.out.println("employee salary is  "+  salary);
	}

	public static void main(String[] args) {
		constructorexamples test=new constructorexamples();
		test.display();

}}