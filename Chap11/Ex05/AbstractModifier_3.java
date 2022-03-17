package Chap11.Ex05;

//추상 클래스를 사용해서 기능구현 하는 경우

abstract class Animal {
	abstract void cry();				// 추상 메소드 : 선언만 되어있고 구현부가 없는 메소드
}

class Cat extends Animal{
	void cry() {
		System.out.println("야오오오오오오옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍멍멍멍멍멍멍멍멍멍멍멍멍ㅁ어");
	}
}



public class AbstractModifier_3 {
	public static void main(String[] args) {

		//추상 클래스는 객체화 할 수 없다.
		//Animal a3 = new Animal();
		
		//다만, 추상 클래스를 타입으로 사용할 수는 있음.
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.cry();
		dog.cry();
		
		
		
	}

}
