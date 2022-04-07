package Chap18.Ex07;

//람다식의 활용
//1. 익명 이너 클래스를 화룡하는 방법
//2. 메서드 참조 (1. 인스턴스 메서드 참조, 2. 정적(static) 메소드 참조)
//	메소드 참조 : 구현되어 있는 메소드를 참조
// 

//<정적 메소드 참조>
interface A{
	public int abc(String str);
}

class B {
	void bcd(int k) {			//인스턴스 메소드 : 
		System.out.println(k);
	}
}

public class RefofInstanceMethod_Type2_2 {

	public static void main(String[] args) {
		//이너 클래스
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}				
			};
		//람다 표현식
		A a2 = (String str) -> {return str.length();};
		//인스턴스 메소드 참조 Type 2
		A a3 = String::length;
		
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕하세요"));
		System.out.println(a3.abc("안녕 하세요"));
		
		
		
		
		
		
	}

}
