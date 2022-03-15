package Chap10.Ex04;

class Animal {
	void cry() {}
}

class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("±±");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class MethodOverriding_011 {

	public static void main(String[] args) {

		//1. ������ Ÿ������ ���� = ������ Ÿ������ ����.
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
			aa.cry();
			bb.cry();
			cc.cry();
			dd.cry();
		
			System.out.println();
		//2. Animal Ÿ������ ���� + �ڽ� Ÿ������ ����
//			: ���� ���ε��� ���ؼ� �θ��� cry()�� ȣ���� ���
//			-> �ڽ��� �����ε��� �޼ҵ�� ���ε���
		Animal ab = new Bird(); //ab�� Animal, Bird Ÿ���� ����. Animal �ʵ�� �޼ҵ常 ����
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();		//Animal �� cry() �� ȣ���� ��� �������ε��� ���ؼ� Bird Ŭ������ cry() ȣ��
		ac.cry();
		ad.cry();
		
		//3. ��ü �迭�� ����
		
		Animal[] animal = {ab, ac, ad};
		for ( Animal k : animal) {
			k.cry();
		}
		
		System.out.println();
		for(int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
		
	}

}























