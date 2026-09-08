package com.multithreading;

import javax.management.RuntimeErrorException;

public class ProducerAndConsumer {

	public static void main(String[] args) throws InterruptedException{
		
		ProducerAndConsumerlmpl obj = new ProducerAndConsumerlmpl();
		
		Thread t1 = new Thread( 
				()->{
				try {
					obj.producer();
				}catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				});
		
		Thread t2 = new Thread(()->{
			try {
				obj.consumer();
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		t1.start();
		t2.start();
		
		
	}
	
}
















