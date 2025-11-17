package oop;

public class Defaultconstroctor {

	Defaultconstroctor(){ //inside the class if we not declared any constructor compiler gelt constrounrate
		                  //default constuctor,
		System.out.println("0 argumenets");
	}
	Defaultconstroctor(int a) //inside the class constructor in declareed then compiler not provide 
	{                             //any default constuctor
		System.out.println("1 argument");
	}

	   public static void main(String[] args) {
		Defaultconstroctor test=new Defaultconstroctor();
		Defaultconstroctor test1=new Defaultconstroctor(20);//if we creating class object then 
		                                                     //compiler is called 
		
	   }}