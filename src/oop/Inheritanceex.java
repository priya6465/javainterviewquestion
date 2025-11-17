package oop;


class A{
	int i;
	void method1(){
		System.out.println("display method 1");
	}
}
class B extends A{
	int j;
	void method2(){
		System.out.println("display method 2");
		
	}
}
public class Inheritanceex {

	public static void main(String[] args) {
    B obj=new B();
    obj.method2();
    obj.method1();
	}

}
