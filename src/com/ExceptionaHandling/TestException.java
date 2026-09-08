package com.ExceptionaHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class TestException
	{
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        try
	        {
	            System.out.println("Enter the number a : ");
	            int a = in.nextInt();
	            System.out.println("Enter the number b : ");
	            int b = in.nextInt();
	            int c = a / b;
	            System.out.println("c : "+c);
	        }
	        catch(ArithmeticException e)
	        {
	            e.printStackTrace();
	        }
	        catch(InputMismatchException e)
	        {
	            e.printStackTrace();
	        }
	        catch (NumberFormatException e)
	        {
	            e.printStackTrace();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            in.close();
	        }
	    }
	}