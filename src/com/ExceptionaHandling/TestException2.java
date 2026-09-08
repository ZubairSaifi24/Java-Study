package com.ExceptionaHandling;

	public class TestException2
	{
	    public boolean run(int x ,int y)
	    {
	        try
	        {
	            if (x == y)
	                return true;
	           
	            else
	                return false;
	        }
	        catch (Exception e)
	        {
	            return false;
	        }

	        finally {
	            System.out.println("I am finally . ");
	        }
	    }

	    public static void main(String[] args)
	    {
	        boolean run = new TestException2().run(12, 12);
	        System.out.println("res "+run);
	    }
	}
