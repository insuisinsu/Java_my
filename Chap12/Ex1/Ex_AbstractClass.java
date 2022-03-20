package Chap12.Ex1;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("³Ä¿Ë");
	}

	@Override
	void fly() {
		System.out.println("¸ø ³¯¾Æ¿ä");
	}
	
}

class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("³¢·è");
	}

	@Override
	void fly() {
		System.out.println("ÈÎÈÎ ³¯¾Æ¿ä");
	}
	
}

public class Ex_AbstractClass {

	public static void main(String[] args) {

		Abc cat = new Cat();
		Abc eagle = new Eagle();
		
		cat.cry();
		eagle.cry();
		
		Abc cat2 = new Cat() {
			void cry() {
				System.out.println("³Ä¾Æ¿Ë");
			}
			void fly() {
				System.out.println("¸ø³¯Áö·Õ");
			}
		};
		
		Abc eagle2 = new Eagle() {
			void cry() {
				System.out.println("³¢ÀÌ·è");
			}
			void fly() {
				System.out.println("ÈÌ¾î¾î¾óÈÌ¾î¾î¾ó ³¯¾Æ¿ä");
			}
		};
		cat2.cry();
		cat2.fly();
		eagle2.cry();
		eagle2.fly();
		
	}

}
