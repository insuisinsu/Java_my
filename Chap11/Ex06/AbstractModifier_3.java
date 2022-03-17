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
		System.out.println(name + " �� "+age+" �� �Դϴ�.");
		this.cry();
		this.run();
	}
	@Override
	void cry() {
		System.out.print("�� �߿� ���, ");
	}

	@Override
	void run() {
		System.out.println("�����մϴ�.");
	}
	
}
class Tiger extends Animal{
	void cry(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " �� "+age+" �� �Դϴ�.");
		this.cry();
		this.run();
	}
	@Override
	void cry() {
		System.out.print("�� �߿� ���, ");
	}

	@Override
	void run() {
		System.out.println("�����մϴ�.");
	}
}

class Egle extends Animal{
	void cry(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " �� "+age+" �� �Դϴ�.");
		this.cry();
		this.run();
	}
	@Override
	void cry() {
		System.out.print("�� �߿� ���, ");
	}

	@Override
	void run() {
		System.out.println("�����մϴ�.");
	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {

		
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Egle("������", 15);
		
		Animal[] arr = {a1, a2, a3};
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].name;
			arr[i].age;
		}
		
	}

}
