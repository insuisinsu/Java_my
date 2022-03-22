package Chap13.Ex09.Ex1;

interface A{
	void cry();
	void fly();
}

class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class Anonymous_4_1 {

	public static void main(String[] args) {
		C c = new C();
		//1. 클래스 x , 참조변수 o
		A a = new A() {
			@Override
			public void cry() {
				System.out.println("1 cry");
			};
			@Override
			public void fly() {
				System.out.println("1 fly");
			}
		};
		c.abc(a);
		
		//2. 클래스 x , 참조변수 x
		
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("2 cry");
			}
			@Override
			public void fly() {
				System.out.println("2 fly");
			}
		});
		
	}

}
