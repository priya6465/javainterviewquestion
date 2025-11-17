package javap;

import java.util.HashSet;

public class Missingnumber {

	public static void main(String[] args) {
		
	int a[]= {1,2,4,5};
	int n=a.length+1;
	int total=n *(n+1)/2;
	for(int num:a) {
		total -=num;
	}
	System.out.println(total);
	
}}