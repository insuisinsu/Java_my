package Chap12.Ex2;

//인터페이스 : 외부와 내부를 연결 시켜주는 접점     		콘센트 ( 외부 전기장치 >> 콘센트 << 전기)
				//리모컨 (사람, TV) , API
//객체 생성 불가, 타입은 설정 가능
//모든 필드는 반드시 : public static final 가 생략되어 있음
//모든 메소드는 : public abstract 가 생략되어 있음		(자바 1.8 까지) // 그 이후는 (default 메소드 제외)

interface A{
	public static final int A = 3;
	public abstract void abc();
}

interface B{
	int A = 3;
	void abc();
}

abstract class C {			//추상클래스는 abstract 를 생략할 수 없음
	abstract void abc();		
}

public class Interface_1 {

	public static void main(String[] args) {
		
		//인터페이스는 객체 생성 불가 : <- 구현되지 않은 메소드가 포함되어 있기 때문
		// A a = new A(); 불가
		
		//1. 인터페이스의 static 필드 내용 출력
		
		System.out.println(A.A);	//인터페이스의 필드 출력.. static 키가 있어서 바로 출력 가능
		System.out.println(B.A);
		
		//2. final 이 적용되어 있기 때문에 값을 수정할 수 없음
		
//		A.A = 5;
//		B.A = 5;
		
		
		
	}

}
