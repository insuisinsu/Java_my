package Chap0607.Ex06;

//정적 초기화 블록
//생성자와 같이 static 필드의 값을 호출할 때 초기화 하는 역할

//생성자와 static 블락
//생성자 : 인스턴스 필드 초기화 + static 필드 값도 초기화
//static 블락 : static 필드 초기화

class E{
	
	int a;
	static int b;			//객체 생성 없이 호출 가능
	
	//정적(static) 초기화 블록
	//객체 생성 없이 클래스 명으로 호출할 때 초기화 시켜주는 역할
	//
	static {
		b = 5;
		int d = 12;
		System.out.println("클래스 E 가 로드되었습니다. 변수 b : "+b+" "+d);
	}
	
	static {
		b = 7;
		System.out.println("클래스 E 가 로드되었습니다. 변수 b : "+b);
	}
	
	//생성자 : 객체화를 할 때 필드의 값 초기화 시켜줌
	E(){
		a=3;
		b=10;
	}
	
}

public class Static_03 {

	public static void main(String[] args) {
		
		//객체 생성 없이 E.b  호출될 때 static 블록이 작동됨 -> static 의 값 초기화
								
		System.out.println(E.b);	
		
		
		
	}

}
