package Chap11.Ex06.Ex1;

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

	Cat(){}
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
	Tiger(){}
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
	Egle(){}
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

public class Ex01 {
	public static void main(String[] args) {
		
		Animal b1 = new Cat();
		Animal b2 = new Tiger();
		Animal b3 = new Egle();
		
		
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
		
		
		
	}
}
