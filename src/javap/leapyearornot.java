package javap;

import java.util.Scanner;

public class leapyearornot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
	
		if((year%400==0) ||((year%4==0) && (year%100!=0))) {
			System.out.println("this is leap year");
		}
		
		else {
			System.out.println("this is not leap");
		}

		sc.close();
		}

		}
		
