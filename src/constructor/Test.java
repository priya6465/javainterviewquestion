package constructor;

public class Test {

	 {
	System.out.println("instance block");   //instance block 
	 int a=m1();  //instance variables 
}
	 int m1() {
	 
	System.out.println("m1() method called by variable"); 
	  return 100; 
	 }  
	 public static void main(String[] args)  
	 { 
		 new Test(); 
	 } 
	} 