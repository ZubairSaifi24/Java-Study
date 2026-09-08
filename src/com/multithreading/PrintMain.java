package com.multithreading;

public class PrintMain
{
    public static void main(String[] args) throws InterruptedException
    {
        Printer printer = new Printer();

        MyPrint mt1 = new MyPrint(printer , "Rizwan");
        MyPrint mt2 = new MyPrint(printer , "Adil");

        Thread t1  = new Thread(mt1);
        Thread t2  = new Thread(mt2);


        t1.start();
        t2.start();

    }
}
