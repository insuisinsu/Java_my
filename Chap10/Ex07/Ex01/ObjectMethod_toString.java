package Chap10.Ex07.Ex01;

//Object 클래스의 toString 메소드
// : 객체를 출력할 때 Object 클래스의 toString() 호출
	// toStiring() : 패키지명.클래스명@해쉬코드
	// 해쉬코드 : 객체가 가르키고 있는 Heap 메모리의 번지를 해쉬코드로 암호화(16진수)
	// 재정의 해서 사용 : 객체의 정보를 출력할 때 (필드값, 메소드 호출)

class A {
	int m = 3;
	int n = 4;
}

class B {	//extends Object 생략
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + ", b :" + b;
	}

}

public class ObjectMethod_toString {

	public static void main(String[] args) {

		A a = new A ();
		System.out.println(a); 	//패키지명.클래스명@해쉬코드 Chap10.Ex07.Ex01.A@32d2fa64
		System.out.println(a.toString());
		
		System.out.printf("%x\n", a.hashCode());		//%x -> 16진수로 표현
		System.out.println(a.hashCode());
		
		B b = new B ();
		System.out.println(b);	//toString() 을 재정의 해서 객체의 필드 정보를 출력
		
		
		
		
		
		
		
	}

}
