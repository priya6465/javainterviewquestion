package javaratan;

public class gc {
	void m1() 
	 { gc t1=new gc(); 
	 } 
	 public static void main(String[] args) 
	 { gc t=new gc(); 
	  t.m1(); 
	  System.gc();
}
}