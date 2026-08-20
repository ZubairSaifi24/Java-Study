package com.abstraction;

public class karolBagh extends Metro{

	@Override
	public void ticket() {
		System.out.println("(4) - Ticket counters  ");	
	}
	@Override
	public void securoty() {
		System.out.println("(3)- security post ticket check");	
	}
	@Override
	public void lift() {
		System.out.println("lift midille in the station capacity 19 person !");
	}
	
	public void foodpoint() {
		System.out.println("food..\n1.pizza\n2.burger\n3.fastffod");
	}
	
	public void clothes() {
		System.out.println("clothes .=>\n1.addidas\n2.amrican collection");
	}
	
	public void Toilet() {
		System.out.println("\n3-public toilet");
	}
	
}