package Chap11.Ex06.Ex1;

abstract class Animal{
	String name;
	int age;
	
	@Override
	public String toString() {
		return "종류는 "+name+" 이고, "+age+" 살 입니다.";
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
		System.out.println("고양이는 야옹");
	}
	@Override
	void run() {
		System.out.println("고양이는 날렵");
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
		System.out.println("호랑이는 어흥");
	}
	@Override
	void run() {
		System.out.println("호랑이는 민첩");
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
		System.out.println("독수리는 끼룩");
	}
	@Override
	void run() {
		System.out.println("독수리는 하늘");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Animal b1 = new Cat();
		Animal b2 = new Tiger();
		Animal b3 = new Egle();
		
		
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Egle("독수리", 15);
		Animal[] arr2 = {a1, a2, a3};
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].name+" 시작====================");
			System.out.println();
			System.out.println(arr2[i]);
			arr2[i].cry();
			arr2[i].run();
			System.out.println();
			System.out.println(arr2[i].name+" 끝====================");
			System.out.println();
		}
		
		
		
	}
}
