package javap;

import java.util.Scanner;

public class checknoisprimeornot {

	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("number is prime no");
		}
		else {
			System.out.println("number is not prime numbers");
		}
		sc.close();
	
		
		//****************************OR******************
	/*	System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int check=0;
		for(int i=1;i<=num;i++) {
			if(num%2==0) {
				check++;
			}
		}
	if(check==2) {
		System.out.println("number is prime"); //its even no
	}
	else {
		System.out.println("number is not prime"); //its odd no
	} */
		
	}
}
