package Chap18.Ex04;

//람다식의 활용
//1. 익명 이너 클래스를 화룡하는 방법
//2. 메서드 참조 (1. 인스턴스 메서드 참조, 2. 정적 메소드 참조)

interface A{
	void abc();
}

class B {
	void bcd() {		//인스턴스 메소드 : 객체화 해야 호출 가능
		System.out.println("메서드");
	}
}

public class RefofInstanceMethod_Type_1 {

	public static void main(String[] args) {

		//1. 인스턴스 메소드 참조 type 1
		A a1 = new A() {
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		
		//위 시나리오를 람다식으로 표현
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		//인스턴스 참조 표현식 type 1
		B b = new B();	//인스턴스 객체를 생성, 객체명::메소드명
		A a3 = b::bcd;	//<- 인스턴스 참조 표현 <- 리턴 타입이 같아야 함 + 매개변수가 동일해야 함
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
	}

}
