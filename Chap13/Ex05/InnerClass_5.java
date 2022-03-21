package Chap13.Ex05;

/*
 	지역 이너 클래스의 컴파일 이후 생성 클래스 파일
 	지역 이너 클래스 : '메서드 내부에 선언된 클래스'
 	
 */

class A{
	void abc() {
		class B {}		//A$1B.class
		class C {}		//A$1C.class
	}
	
	void bcd() {
		class C {}		//A$2C.class	동일한 이름이 존재할 경우 숫자가 늘어남
		class D {}		//A$1D.class
	}
	
}

public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
