package com.iu.s7;

public class Himart {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.setBrand("삼성");
		tv.setColor("블랙");
		tv.setPrice(3000000);
		tv.setPoint(300);
		tv.setSize(54);
		
		Computer computer = new Computer();
		computer.setBrand("아수스");
		computer.setColor("은색");
		computer.setPrice(1500000);
		computer.setPoint(150);
		computer.setSsd(512);
		
		Aircon aircon = new Aircon();
		aircon.setBrand("삼성");
		aircon.setColor("흰색");
		aircon.setPrice(2000000);
		aircon.setPoint(200);
		aircon.setPyung(6);
		
		tv.info();
		computer.info();
		aircon.info();
		
		Guest iu = new Guest();
		iu.setMoney(5000000);
		iu.setPoint(10);
		
//		iu.buy(tv);
		
		Electric [] electrics = new Electric[2];
		electrics[0] = computer;
		electrics[1] = aircon;
		//여러개 살땐 배열에 담아서 한번에 ㄱ
		
		iu.buy(electrics);
		
		System.out.println("------------------------------");
		System.out.println(iu.getMoney());
		System.out.println(iu.getPoint());
		
		
	}

}
