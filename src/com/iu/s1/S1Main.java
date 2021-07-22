package com.iu.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setBrand("AUSU VivoBook");
					
		Phone phone = new Phone();
		phone.setBrand("iPhone XR");
		
		Tablet tablet = new Tablet();
		tablet.setBrand("iPad");
		
		computer.info();
		phone.info();
		tablet.info();
		
//		computer.info2();
		
		
		
	}

}
