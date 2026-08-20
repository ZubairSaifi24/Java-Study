package com.Inheritance;

class Base
{
    public String name = "Rizwan";

    public Base(String name)
    {
        System.out.println(" Base class constructor name: "+name);
    }

    public void caller()
    {
        System.out.println(" hello i am base class caller");
    }

}

class Child1 extends Base
{
    public String name = "Adil";

    public Child1(String name , byte age)
    {
        super(name);
        System.out.println("Child1 class constructor name and age "+name+" "+age);
    }

    @Override
    public void caller()
    {
        super.caller();
        System.out.println(" i am child 1 caller : "+super.name);
    }

}

class Child2 extends Child1
{
    public String name = "zubair";
    public Child2(String name , byte age )
    {
        super(name,age);
        System.out.println("Child2 class constructor name : ");
    }

    @Override
    public void caller()
    {
        super.caller();
        System.out.println(" i am child 2 caller name : "+this.name);
        System.out.println(" i am child 2 caller name : "+super.name);

    }

}
