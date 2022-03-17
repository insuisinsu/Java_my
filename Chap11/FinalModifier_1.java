package Chap11;

/*
 	Final : 마지막
 	
 	- 필드명, 지역변수명 : 상수,   final doule PI = 3.14;
 		--> 상수는 값을 변경할 수 없음			// double PI = 3.14; <- 이건 변수임
	
	- 메소드명 : 오버라이딩이 불가한 메소드 (자식 클래스에서 메소드 오버라이딩하지 못하도록)
			: final void print(){}
	- 클래스명 : 상속 불가한 클래스 == 자식 클래스를 만들 수 없음. 마지막 클래스
			: final class A{}
			
	 ^ 필드명, 지역변수명은 소문자 사용, 여러문자가 이어질 경우 단어의 첫자만 대문자 사용 newHome
	 ^ 상수명(final 이 앞에 붙은 변수)은 대문자 사용
 */

class A1 {
	int a = 3;
	final int B = 5;
	A1(){}
}
class A2 {
	int a;
	final int B;
	A2(){
		a = 3;
		B = 5;
	}
}

class A3{
	int a = 3;
	final int b = 5;
	A3(){
		a = 5 ;
// 		B = 10;		final 값은 수정할 수 없음
	}
}

class B {						//지역 변수 : 메소드 안에서 선언한 변수
								//		: 메소드 호출이 끝나면 지역변수는 사라짐
								// Stack 공간에 변수의 값이 할당됨
	void bcd() {
		int a= 3;
		final int B = 5;		//상수 : 클래스 영역의 상수 영역에 복사됨.
								//	: 메소드가 끝나더라도 상수 영역에 남아있음
		a = 7;
//		B = 8;
	}
}

public class FinalModifier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
