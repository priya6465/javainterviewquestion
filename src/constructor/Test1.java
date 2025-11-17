package constructor;

public class Test1 {
	
       Test1()
       {
		System.out.println("0 argument constructor is called");
	    }
       Test1(int a,int b)
       {
    	   this();
        System.out.println("1 argument constructor is called");
       }
       void display(){
    	   System.out.println("wellcome to joureny");
       }

	public static void main(String[] args) {
		//new Test1();
		new Test1(10,20).display();
		//new Test1().display();
		
	}

}
