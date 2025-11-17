 package constructor;

public class Employee {
	int Empid;
	
	Employee(int Empid)
	{
	this.Empid=Empid;
	}
	
	void display(){
		System.out.println("employees id is "  + Empid);
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee(1);
		emp.display();
		//we can pass Empid to constroctor in constructor empid is local variable 
		//applicable within the constructor only, we can convert
		 //local variable to instance variable using this keyword,instance variable is 
		// applicable  for throughout the program;
		 
		
		
		//Employee emp1 =new Employee(2);
		//emp1.display();
		
		

	}

}
