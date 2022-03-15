package Chap0607.Ex06;

class Abc{
	
		//외부 클래스 : public 제어자를 사용 못함. default 기본으로 적용
		//접근 제어자가 붙을 수 있는 키워드 : class, 필드, 메소드, 생성자 앞에 위치
		//반드시 접근제어자가 할당되어 있음 - 생략되어 있으면 default 임
		//접근 제어자 :
			//1. public		: 다른 패키지에서 접근 가능
			//2. protected	: 상속구현이 되어 있으면 다른 패키지에서 접근 가능
			//3. default	: 같은 패키지에서만 접근 가능
			//4. private	: 같은 클래스 내부에서만 접근 가능
	
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//Abc() {}   <- 기본 생성자 (생략) : 필드의 초기값을 부여해서 객체를 생성
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능 : public");
	}
	protected void print2() {
		System.out.println("다른 패키지에서 접근 가능(상속관계가 구성될 때 : protected");
	}
	void print3() {
		System.out.println("같은 패키지에서만 접근 가능 : default");
	}
	private void print4() {
		System.out.println("같은 클래스에서만 접근 가능 : private");
	}
	
	
}




public class Ex06_All {

	public static void main(String[] args) {

		Abc abc1 = new Abc();		// 기본 생성자 호출
		//Abc - 클래스 명
		//abc1 : 메모리에 로드할 객체명
		//new - 객체를 Heap 영역에 생성
		//Abc() - 생성자 호출
			//생성자 : ..클래스 이름과 동일한 메소드 + 리턴 타입이 없는 메소드 생성자
		
		abc1.a = 100;	// public
		abc1.b = 200;	// protected
		abc1.c = 300;	// default
//		abc1.d = 400;	// private, 다른 클래스에서는 접근 불가
		
		//같은 패키지 내에서 메소드 호출
		abc1.print1();	//public
		abc1.print2();	//protected
		abc1.print3();	//default
//		abc1.print4();	//private, 다른 클래스에서는 접근 불가
			
		
	}

}












