package Chap11.Ex06;

abstract class Animal {
	String name;
	int age;
	
	abstract void cry();
	abstract void run();
}

class Cat extends Animal{
	
	void cry(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " 는 "+age+" 살 입니다.");
		this.cry();
		this.run();
	}
	@Override
	void cry() {
		System.out.print("은 야옹 울고, ");
	}

	@Override
	void run() {
		System.out.println("날렵합니다.");
	}
	
}
class Tiger extends Animal{
	void cry(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " 는 "+age+" 살 입니다.");
		this.cry();
		this.run();
	}
	@Override
	void cry() {
		System.out.print("은 야옹 울고, ");
	}

	@Override
	void run() {
		System.out.println("날렵합니다.");
	}
}

class Egle extends Animal{
	void cry(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " 는 "+age+" 살 입니다.");
		this.cry();
		this.run();
	}
	@Override
	void cry() {
		System.out.print("은 야옹 울고, ");
	}

	@Override
	void run() {
		System.out.println("날렵합니다.");
	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {

		
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Egle("독수리", 15);
		
		Animal[] arr = {a1, a2, a3};
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].name;
			arr[i].age;
		}
		
	}

}
