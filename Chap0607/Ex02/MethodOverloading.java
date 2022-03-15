package Chap0607.Ex02;

class B {
	static String name = "BTS";
	
	//static 키가 할당되면 객체 생성 없이 호출
	
	
	static void print () {
		System.out.println(name);
		System.out.println("static이 붙은 메소드입니다.");
	}
	
	
	
}


public class MethodOverloading {

	public static void main(String[] args) {

		//메소드 오버로딩 : 하나의 메소드명에 매개변수 타입, 갯수에 따라서 각각 다르게 호출됨 (Java)
		//메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의 해서 사용		
		
		//static : 객체 생성 없이 바로 호출해서 사용가능 하도록 하는 키워드
				// 객체 이름이 아니라 클래스 이름으로 호출해서 사용 가능
		
		System.out.println(B.name);		// static 이 있으면 객체이름이 아닌 클래스 이름으로 호출 가능
		B.print();						// 클래스 이름으로 호출
		System.out.println("===========");
		
		
		
		
		print1();		//'static' 키가 들어가 있고, '동일한 클래스'에 생성된 메소드는 바로 호출 가능
		print1(3);		//매개변수가 1 개 이고, 정수 타입의 메소드를 호출한다.
		print1(3.0);	//매개변수가 1 개 이고, double 타입의 메소드를 호출한다.
		print1(3, 4);	//매개변수가 2 개 이고, 정수 타입의 메소드를 호출한다.
		
		
		
	}

	//메소드 오버라이딩 : 메소드 이름은 동일 / 매개변수타입, 배개변수 갯수에 따라 해당 메소드를 호출
		//JVM이 동일한 메소드 이름의 데이터 타입이나 갯수에 따라서 해당 메소드를 작동
			//주의 : 동일한 매개변수 타입과 갯수가 같으면 오류 발생   -> 두가지를 구분할 수 없으면 오류
	
	public static void print1() {				// 메소드 이름 앞에 static :
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print1 (int a) {
		System.out.println("정수 : " + a);
	}
	
	public static void print1 (double a) {
		System.out.println("double : " + a);
	}
	
	public static void print1 (int a, int b) {
		System.out.println("a : " + a + ",  b : " + b);
	}
	
//	public static void print1 (double k) {   // 위에 print1 (double e) 와
//		System.out.println(k);				// 매개변수 1, 데이터 타입 double 로 같아서 오류 발생
//	}
	
	
	
	
	
	
	
}
