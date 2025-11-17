package constructor;

public class instanceblockeg {
	  int eid;   
	 //instance block initializing values 
	 { eid=111; 
	 } 
	 //constructor initializing values 
	 instanceblockeg() 
	 { eid=222; 
	 } 
	//method initializing values 
	 void assign() 
	 { eid=333; 
	 } 
	 void disp() 
	 {
	 System.out.println("****Employee Details****"); 
	  System.out.println("emp id="+eid); 
	 } 
	 public static void main(String[] args) 
	 { 
		 instanceblockeg e = new instanceblockeg();     
	  e.disp();
	  e.assign();
}
}