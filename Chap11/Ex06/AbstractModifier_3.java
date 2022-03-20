package Chap11.Ex06;

abstract class Animal{
	String name;
	int age;
	
	@Override
	public String toString() {
		return "������ "+name+" �̰�, "+age+" �� �Դϴ�.";
	}
	abstract void cry();
	abstract void run();
}

class Cat extends Animal{

	Cat (String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("����̴� �߿�");
	}
	@Override
	void run() {
		System.out.println("����̴� ����");
	}
}

class Tiger extends Animal{
	Tiger (String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("ȣ���̴� ����");
	}
	@Override
	void run() {
		System.out.println("ȣ���̴� ��ø");
	}
} 

class Egle extends Animal{
	Egle (String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("�������� ����");
	}
	@Override
	void run() {
		System.out.println("�������� �ϴ�");
	}
}

public class AbstractModifier_3 {
	public static void main(String[] args) {
		
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Egle("������", 15);
		Animal[] arr2 = {a1, a2, a3};
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].name+" ����====================");
			System.out.println();
			System.out.println(arr2[i]);
			arr2[i].cry();
			arr2[i].run();
			System.out.println();
			System.out.println(arr2[i].name+" ��====================");
			System.out.println();
		}
		
		for(Animal k : arr2) {
			System.out.println(k);
			k.cry();
			k.run();
		}
		
		
		
	}
}
