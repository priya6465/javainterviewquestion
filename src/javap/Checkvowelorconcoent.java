package javap;

import java.util.Scanner;

public class Checkvowelorconcoent {

	public static void main(String[] args) {
      char ch;
	System.out.println("Enter any character");
	Scanner sc=new Scanner(System.in);
	ch=sc.nextLine().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'  || ch=='u')
	{
		System.out.println("this is vowel");
	}
	else
	{
		System.out.println("this is consonant");
	}
	sc.close(); 
	}}