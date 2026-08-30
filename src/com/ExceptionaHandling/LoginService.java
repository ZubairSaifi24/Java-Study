package com.ExceptionaHandling;

import java.util.Scanner;

public class LoginService {

	public void Login() throws InvalidUsernameAndPasswordException {
		Scanner sc = new Scanner(System.in);
		String username = null;
		String password = null;
		try {
			System.out.print("Enter the username : ");
			username = sc.nextLine();
			System.out.print("Enter the password : ");
			password = sc.nextLine();
		}
		catch(Exception e) {
			System.out.println("Username and password formate mismatch ");
		}
		
		if(!(username.equals("Admin")&&password.equals("1234")))
			throw new InvalidUsernameAndPasswordException("please enter correct username and password");
		
		System.out.println("\n--------------------------------------------");
		System.out.println("===== Welcome to my program =====");
		System.out.println("--------------------------------------------\n");
		
	}

}
