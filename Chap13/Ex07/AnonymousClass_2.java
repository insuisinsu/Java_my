package Chap13.Ex07;

// 익명 이너클래스를 사용하여 인터페이스 객체 생 


class A {
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

interface C {
	public abstract void bcd();
}


public class AnonymousClass_2 {

	public static void main(String[] args) {

		A a = new A();
		a.abc();		
		
	}

}
