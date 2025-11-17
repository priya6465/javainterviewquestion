package constructor;

public class staticblocke {

	static int eid; 
	 static 
	 { eid=111; 
	 } 
	 static void assign() 
	 { eid=333; 
	 } 
	 static void disp() 
	 { System.out.println(eid); 
	 } 
	 public static void main(String[] args)  
	 { staticblocke e = new staticblocke(); 
	  staticblocke.assign(); 
	  staticblocke.disp();
}
}