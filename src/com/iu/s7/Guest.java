package com.iu.s7;

public class Guest {
	
	private int money;
	private int point;
	
	//물건의 가격과 포인트를 받아서 자신의 돈과 포인트 계산
	//매개변수는 1개만 선언 가능
//	public void buy(Electric electric) {
//		this.money = this.money - electric.getPrice();
//		this.point = this.point + electric.getPoint();
//		
//		
//	}
	
	public void buy(Electric [] electrics) { //computer, tv, aircon
		for(int i=0; i<electrics.length; i++) {
		this.money = this.money - electrics[i].getPrice();
		this.point = this.point + electrics[i].getPoint();
		}
		
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
