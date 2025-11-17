package javap;

public class swapstringwithout3variable {

	public static void main(String[] args) {

String a="hello";
String b="world";
a=a+b;
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length());

System.out.println("value of a is:"+a);
System.out.println("value of a is:"+b);

	}

}
