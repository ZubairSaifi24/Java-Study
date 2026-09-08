package com.multithreading;

import java.util.concurrent.CompletableFuture;

import javax.management.RuntimeErrorException;

public class OrderService {

	public void AddToCart() {
		System.out.println("Adding to Cart ......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.getAllStackTraces();
		}
	}
	
	public void Payment() {
		System.out.println("Payments ......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.getAllStackTraces();
		}
	}
	
	
	public void Shipping() {
		System.out.println("Delever ......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.getAllStackTraces();
		}
	}
	
	
	public void FeedBack() {
		System.out.println("feedBack ......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.getAllStackTraces();
		}
	}
}

class CompletableFutureMain{
	public static void main(String[] args) {
		OrderService order = new OrderService();
		long startTime = System.currentTimeMillis();
		var service1 = CompletableFuture.runAsync(()->order.AddToCart());
		var service2 = CompletableFuture.runAsync(()->order.Payment());
		var service3 = CompletableFuture.runAsync(()->order.Shipping());
		var service4 = CompletableFuture.runAsync(()->order.FeedBack());
		
		CompletableFuture.allOf(service1,service2,service3,service4).join();
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken : "+(endTime-startTime));
		
	}
}










