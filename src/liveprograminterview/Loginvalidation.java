package liveprograminterview;

import java.util.Scanner;

public class Loginvalidation {

	public static void main(String[] args) {

		String username="admin";
		String password ="password123";
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        String userInput = sc.next();
        
        System.out.print("Enter password:");
        String passInput = sc.next();
         
               sc.close();

        if (userInput.equals(username) && passInput.equals(password)) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Invalid Credentials");

        }
	}

}

