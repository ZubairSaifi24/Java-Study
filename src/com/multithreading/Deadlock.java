package com.multithreading;

public class Deadlock {

	public static void main(String[] args) {
		
		final Object lock1 = new Object();
		final Object lock2 = new Object();
		
		Thread t1 = new Thread(()->{
			synchronized (lock1) {
				System.out.println("t2 : lock2 find");
			}
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
					Thread.currentThread().interrupt();
			}
			
			synchronized (lock2) {
				System.out.println("t1 : lock2 find");
			}
		});
		
		Thread t2 = new Thread(()->{
			synchronized (lock2) {
				System.out.println("t2 : lock 1 find");
			}
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
					Thread.currentThread().interrupt();
			}
			
			synchronized (lock1) {
				System.out.println("t2 : lock1 find");
			}
		});
		
		t1.start();
		t2.start();
		
		
		
	}
	
}
