package Chap13.Ex08;

//클래스 정의 및 참조 변수를 사용 / 미사용인 경우 매개변수로 객체 전달

interface A{
	public abstract void abc();
}

//1. 자식 클래스를 직접 생성
class B implements A{
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

	//cde() 의 인풋값으로 A 타입의 객체 a 를 입력
class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {

		//1. 클래스명 o + 참조 변수명 o
		C c = new C();
		A b = new B();	//참조 변수 생성
		
		c.cde(b);		//매개변수에 객체 a를 생성해서 줌
		System.out.println("=====");
		
		//2. 클래스 명 o + 참조 변수명 x
		c.cde(new B());
	}

}
