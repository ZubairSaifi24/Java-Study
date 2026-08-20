package com.abstraction;

public class Main {

	public static void main(String[] args) {
	
		karolBagh k = new karolBagh();
		RajeevChoke r = new RajeevChoke();
		
		System.out.println("==== Karol Bagh Metro Station ====\n");
		k.ticket();
		k.securoty();
		k.Toilet();
		k.foodpoint();
		k.clothes();
		k.lift();
		
		System.out.println("\n\n==== Rajeeve Choke Metro Station ====\n");
		r.ticket();
		r.lift();
		r.securoty();
		r.Toilet();
		r.foodpoint();
		r.clothes();
		
	}
}
