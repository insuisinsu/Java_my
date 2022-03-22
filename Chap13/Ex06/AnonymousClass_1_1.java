package Chap13.Ex06;

//인터페이스 : 추상 메소드를 정의
interface AA {
	//추상 메소드	: public abstract 가 생략되어 있음
	public abstract void cry();
	void fly();		
}

class BB {
	AA a = new C();
	void abc() {
		a.cry();
		a.fly();
	}
	//class C 는 interface AA 의 메서드를 구현하는 클래스
	class C implements AA{

		@Override
		public void cry() {
			System.out.println("멍멍");
		}

		@Override
		public void fly() {
			System.out.println("못날아요");
		}
		
	}
}

public class AnonymousClass_1_1 {

	public static void main(String[] args) {
		BB b = new BB();
		b.abc();
	}

}
