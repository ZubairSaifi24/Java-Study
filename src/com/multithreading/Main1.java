package com.multithreading;

public class Main1
{
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        MyThread t = new MyThread();

        t.start();
        
        for(int i=0;i<10;i++)
        {
            Thread.sleep(400);
            System.out.println(" Main ===>  "+i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time taken  : " +(endTime-startTime));

    }
}
