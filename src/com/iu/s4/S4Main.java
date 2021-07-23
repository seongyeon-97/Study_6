package com.iu.s4;

public class S4Main {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		tiger.sound();
		cat.sound();
		dog.sound();
		
		tiger.wash();
		cat.drop();
		dog.guard();
		
		//case
		//모으려고하는 데이터 타입 [] 변수명 
		//Tiger is a Animal
		//Tiger타입은 Animal타입 이다
		Animal animal = tiger;
		animal = cat;
		animal = dog;
		
		Animal [] animals = new Animal[3];
		
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;
		
		for(int i =0; i<animals.length; i++) {
			animals[i].sound();
		
		}
		System.out.println("=========================================");
		
		Animal a = animals[0];
		
		System.out.println(a instanceof Tiger);
		
		System.out.println("=========================================");
		
		Tiger t2 = new Tiger();
		Animal a2 = t2;
		t2 = (Tiger)a2;
		
		Animal animal2 = new Animal();
		Tiger tiger2 = (Tiger)animal2;
		tiger2.sound();
		tiger2.wash();
		
	}
}
		
		
	


