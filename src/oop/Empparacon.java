package oop;

public class Empparacon {
	int empid;
	String empname;
	float salary;
	
	void display(){
		System.out.println("employee id is   "  +  empid);
		System.out.println("employee name is  "  +  empname);
		System.out.println("employee salary is  "+  salary);
	}

	public static void main(String[] args) {
		Empparacon test=new Empparacon();
		test.display();

	}

}

	