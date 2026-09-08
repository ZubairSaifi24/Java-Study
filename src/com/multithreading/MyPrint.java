package com.multithreading;

class MyPrint implements Runnable
{
    private Printer printer = null;
    private String name = null;
   public  MyPrint(Printer printer , String name)
    {
        this.printer = printer;
        this.name  = name ;
    }
    @Override
    public void run()
    {
       for (int i=1 ; i<=10; i++)
       {
            printer.printing(name);
       }
    }
}
