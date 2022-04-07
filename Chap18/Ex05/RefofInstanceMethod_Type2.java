package Chap18.Ex05;

//람다식의 활용
//1. 익명 이너 클래스를 활용하는 방법
//2. 메서드 참조 (1. 인스턴스 메서드 참조, 2. 정적(static) 메소드 참조)
//	메소드 참조 : 구현되어 있는 메소드를 참조

//<정적 메소드 참조>
interface A{
	void abc();
}

class B {
	static void bcd() { 			//static(정적메소드) 클래스 이름으로 호출 가능
		System.out.println("메서드");
	}
}

public class RefofInstanceMethod_Type2 {

	public static void main(String[] args) {

		//2. 정적 메소드 참조
		//이너 클래스로 처리
		A a1 = new A() {
			public void abc() {
				B.bcd(); 			//static 이 적용된 정적 메소드는 객체 생성 없이 호출 가능
			}
		};
		
		//람다식 표현
		A a2 = () -> {B.bcd();};
		
		//정적 메소드 참조
		A a3 = B :: bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
	}

}
