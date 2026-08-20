package com.abstraction;

public class RajeevChoke extends Metro {

	@Override
	public void ticket() {
		System.out.println("(3) - Ticket counters  ");	
	}
	@Override
	public void securoty() {
		System.out.println("(4)- security post ticket check");	
	}
	@Override
	public void lift() {
		System.out.println("lift midille in the station capacity 16 person !");
	}
	
	public void foodpoint() {
		System.out.println("food...=>\n1.pizza\n2.burger\n3.fastffod\n4.kiranaStore");
	}
	
	public void clothes() {
		System.out.println("clothes .=>\n1.addidas\n2.amrican collection\n3.brands");
	}
	
	public void Toilet() {
		System.out.println("\n4 -public toilet");
	}
	
	

}
