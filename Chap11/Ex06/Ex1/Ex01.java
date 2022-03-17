package Chap11.Ex06.Ex1;

abstract class Animal{
	abstract void cry();
	abstract void run();
}

class Cat extends Animal{
	@Override
	void cry() {
		
	}
	@Override
	void run() {
		
	}
}

class Tiger extends Animal{
	@Override
	void cry() {
		
	}
	@Override
	void run() {
		
	}
}

class Egle extends Animal{
	@Override
	void cry() {
		
	}
	@Override
	void run() {
		
	}
}

public class Ex01 {
	public static void main(String[] args) {
	
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Egle("독수리", 15);
		
	}
}
