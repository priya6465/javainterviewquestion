package javaratan;


	class Test  
	{ 
	int m1(int a,char ch) {
		System.out.println("***m1 method***"); 
	  System.out.println(a+"---"+ch); 
	  return 100;    
	 } 
	 boolean m2(String str1,String str2)   
	 { System.out.println("****m2 method****"); 
	  System.out.println(str1+"---"+str2); 
	  return true;   
	 } 
	 static String m3(double d,boolean b) 
	 { System.out.println("****m3 method****"); 
	  System.out.println(d+"---"+b); 
	  return "ratan";  
	 } 
	 public static void main(String[] args)  
	 { 
	 Test t=new Test(); 
	  int x = t.m1(10,'a');     
	  System.out.println("m1() return value-->"+x);
	  
	  boolean b = t.m2("ratan","anu");    
	  System.out.println("m2() return value-->"+b);    
	  String str = Test.m3(10.5,true);                  
	  System.out.println("m3() return value-->"+str);  
	 } 
	} 
	

	 
