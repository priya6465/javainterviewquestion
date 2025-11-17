package constructor;

public class Employee2 {
	int Empid;
	String Empname;
	float Empsalary;
	
	Employee2()
	{
		Empid=1;
		Empname="priya";
	     Empsalary=50000;
	}
	void display(){
		System.out.println("employee id is "  + Empid);
		System.out.println("employee name is "  + Empname);
		System.out.println("employee salary is "  + Empsalary);		
	}
	public static void main(String[] args) {
		Employee2  emp=new Employee2();
		emp.display();
		

	}

}
