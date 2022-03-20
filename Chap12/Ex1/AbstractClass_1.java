package Chap12.Ex1;

class AA {					
	//일반 클래스 : 객체 생성시 필드와 메소드는 Heap 영역에 저장
	//Heap : 반드시 초기화 된 값을 가짐
	//인스턴스 메소드는 클래스 영역의 인스턴스 영역에 메소드의 구현코드 까지 저장
	//Heap 에는 포인터 정보만 가진다
	
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;		// 참조변수
	short h;
	
	void cry() {}	//완전한 메소드
	@Override
	public String toString() {
		return a +" , "+b+" , "+c+" , "+d+" , "+e+" , "+f+" , "+g+" , "+h;
	}
}

abstract class A {				//추상 클래스 : 미완성 메소드를 포함하기 때문에 객체 생성이 불가함
	abstract void abc();		//추상 메소드 (미완성 메소드)
}

class B extends A{				//추상 클래스를 구현한 객체
	@Override
	void abc() {
		
	}
}

public class AbstractClass_1 {

	public static void main(String[] args) {
		
//		A a = new A();
		AA aa = new AA();
		System.out.println(aa);
	}

}
