package com.multithreading;

class Printer
{
    public synchronized void printing(String name)
    {
        System.out.println(name +" is using printer ");
    }
}


