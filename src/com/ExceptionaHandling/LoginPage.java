package com.ExceptionaHandling;

public class LoginPage {

	public static void main(String[] args) {
		
		LoginService service = new LoginService();
		
		try {
			service.Login();
		}
		catch(InvalidUsernameAndPasswordException e ) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
