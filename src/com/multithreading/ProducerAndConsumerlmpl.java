package com.multithreading;

public class ProducerAndConsumerlmpl {

	private String product[] = new String[5];
	private boolean flag = false;
	private int i = 0;
	
	public synchronized void producer() throws InterruptedException{
		System.out.println("I am calling ...."+i);
		while(!flag && i != 5) {
			if (i<5) {
				product[i] = "product: "+(i+1);
				System.out.println("producing ...."+ product[i]);
				i++;
			}
		}
		flag = true;
		i=0;
		notify();
		wait();
	}
	
	public synchronized void consumer() throws InterruptedException{
		while(flag) {
			for(String p : product)
				System.out.println("Consuming product ...."+p);
			
			flag = false;
		}
	notify();
	wait();
	
	}
	
	
}













