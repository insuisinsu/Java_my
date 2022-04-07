package Chap18.Ex06;

//람다식의 활용
//1. 익명 이너 클래스를 화룡하는 방법
//2. 메서드 참조 (1. 인스턴스 메서드 참조, 2. 정적(static) 메소드 참조)
//	메소드 참조 : 구현되어 있는 메소드를 참조
// 

//<정적 메소드 참조>
interface A{
	void abc(B b, int k);
}

class B {
	void bcd(int k) {			//인스턴스 메소드 : 
		System.out.println(k);
	}
}

public class RefofInstanceMethod_Type2_1 {

	public static void main(String[] args) {
		//인스턴스 메소드 참조 Type 2
		//1. 익명 이너 클래스
		A a1 = new A () {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		//2. 람다식
		A a2 = (B b, int k) -> {b.bcd(k);}; 
		
		//3. 인스턴스 메소드 참조
		A a3 = B::bcd;		//<- 인스턴스 메소드지만 B객체를 인풋 받아서 bcd() 호출
			//대문자 들어가는 경우
			//1. 객체명::메소드명;
			//2. 정적 메소드 호출일때
			//3. 인스턴스 메소드 호출 이지만 매개변수로 객체가 인풋될때
		
		B b = new B();	
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
		
		
		
		
		
		
		
	}

}
