package com.iu.s7;

public class Aircon extends Electric{
	
	private int pyung;

	public int getPyung() {
		return pyung;
	}

	public void setPyung(int pyung) {
		this.pyung = pyung;
	}
	
	public void info() {
		super.info();
		System.out.println("Pyung : " + this.pyung);
	}
}
