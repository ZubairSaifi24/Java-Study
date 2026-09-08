package com.ExceptionaHandling;
import java.util.Scanner;

public class TestException3 {

	    public static void main(String[] args)
	    {
	        try(Scanner in = new Scanner(System.in))
	        {
	                String s = in.nextLine();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
	
