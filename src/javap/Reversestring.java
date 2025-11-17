
package javap;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		System.out.println("Enter the string");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String Reverse="";
    for(int i=s.length()-1;i>=0;i--) {
    	Reverse=Reverse+s.charAt(i);
    }
    System.out.println("reverse s is:"+Reverse);
//    if(s.equals(Reverse)) {
//    	System.out.println("given string is palindrom");
//    }
//    else
//    {
//    	System.out.println("string is not palindrom");
    
    //sc.close();
	}

}
