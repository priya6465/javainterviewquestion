package oop;

public class SwapString {

	public static void main(String[] args) {
    String a="Hello";
    String b="Worlds";
     
    a=a+b;
     
     b=a.substring(0,a.length()-b.length());
     a=a.substring(b.length());
     System.out.println("valaue of a is:"+a);
     System.out.println("value of b is:"+b);
    
	}

}
