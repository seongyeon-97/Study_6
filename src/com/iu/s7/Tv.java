package com.iu.s7;

public class Tv extends Electric{
	
	private int size;
	
	public Tv() {
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void info() {
		super.info();
		System.out.println("Size : " + this.size);
	}
}
