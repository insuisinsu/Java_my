package Chap0607.Ex03;


//기본 생성자 -- class A 는 기본 생성자가 생략되어 있다.
//일반적으로 클래스 블록에 1. 필드   2. 생성자   3. 메소드 형식으로 작성한다.
class A{
	int m ;						//필드(클래스 블록에 선언된 변수): 데이터 타입과 변수명
								// Heap 영역에 저장됨, 객체화 시켜야 사용가능
								// Heap 영역의 RAM 에는 반드시 초기값이 들어가야 함(자동으로 들어감)
								// 단, static 을 넣으면 객체화 시키지 않아도 바로 사용 가능
	
//	A () {  }			// 기본 생성자	: 클래스 이름과 동일하면서 리턴타입이 없는 메소드 == 생성자
						// 기본 생성자는 생략 가능
						// 기본 생성자는 매개변수와 실행부가 없음
	
	void work() {				//메소드 : 리턴타입 메소드명 (인풋 매개변수) { 실행구문 }
								//메소드 호출 해야 사용 가능 : work()
		
		System.out.println(m);	// 0 //m : 메모리의 값을 가지고 옴 // 
		
	}
}



class B{
	int m;				// m 은 Heap 영역에 저장이 되고. 기본값으로 0 출력
	
	B () {}				//기본 생성자 - 생략가능  // 객체의 필드 초기값이 정해지지 않으면 기본값으로 출력 ( 0, 0.0, false)
	
	void work() {
		System.out.println(m);
	}
	
}

// 객체 생성시 생성자를 통해서 필드의 초기값을 할당하고 객체 생성
class C{
	int m;
	
//	 C() { }			// 기본 생성자 생략
						// 다만, '다른 생성자가 존재하는 경우'에 외부에서 기본 생성자 호출시
						// 기본 생성자는 생략되면 안된다.
	
	C (int c){			// 생성자의 인풋값을 받아서 메모리로의 기본값으로 m 변수의 값을 로드
		m = c ;
	}
	
	void work() {
		System.out.println(m);		
	}
}

class D {
	int m, n, l;
	
	D () {}						// 기본 생성자
	
	D (int m, int n){
		this.m = m;				// this : 자기 자신의 객체, 지역변수( = 'm')가 아니라 필드의 변수(int 'm')임을 알려줌
		this.n = n;				// 
	}
	
	D (int a, int b, int c)	{	// 매개변수가 3개인 생성자
		m = a;
		n = b;
		l = c;
	}
	
	void work () {				//work() 를 호출했을 때 각각의 메모리의 값을 출력
		System.out.println("m : "+ m + ", n : "+n+", l : "+ l);
	}
	
}



public class DefaultConstructor {

	public static void main(String[] args) {
		//클래스 내에 포함될 수 있는 것
		// 1. 필드, 2. 메소드, 3. 생성자, 4. 이너 클래스(innerClass)
		
		//생성자의 2가지 특징
		//1. 클래스 이름과 동일한 이름을 가진 메소드를 생성자라 한다.
		//2. 생성자는 반환 타입이 없다. (메소드는 반환타입(리턴타입, void, int 등이) 있다)
		
		//생성자를 사용하는 이유 : 객체를 생성할 때 필드의 값을 초기화 하면서 객체를 생성하고자 할 때 사용
			//일반적으로 클래스 내에서 필드의 초기값은 할당하지 않는다. (나중에 넣음)
			//초기값을 할당하여 클래스의 객체를 생성할 때 사용
		
		//객체를 생성할 때 반드시 생성자를 호출, 	A a = new A(); <- 객체 생성 구문
		
		//기본 생성자 (Default Constructor)
			//1. 인풋 매개변수가 없는 생성자
			//2. 실행부의 값도 비어있는 상태의 생성자
			//3. 생략가능함
			//4. 생략되어있을 경우 컴파일러가 자동으로 생성해서 컴파일
			//5. 클래스 내에 기본 생성자 이외에 다른 생성자가 존재하는 경우에
			//   -> 기본 생성자 호출시 생략되면 오류발생
		
		A a = new A();		// A(); : 기본 생성자 호출    // 생성자 생략했을 경우	// 컴파일러가 기본생성자를 기본으로 할당
							// 객체 생성시 반드시 생성자를 호출해야 한다.
		a.work(); 	//0
		
		B b = new B();		// 기본 생성자 호출
		
		b.work();	
		
		C c = new C(3);		// 생성자 호출시 기본값을 인풋해서 메모리 필드에 초기값 구성
		c.work();			// 객체 생성시 기본 기능 : 객체 생성 + 필드의 값을 초기화 
		
		C cc = new C(5);
		cc.work();
		
		C ccc = new C(12);
		ccc.work();
		
		// class C 는 기본 생성자가 생략되어 있음	 /	C() {}
		// class C 는 인풋 매개변수가 하나인 생성자가 존재
		
//		C cccc = new C();		//오류 발생 
								// --> 기본 생성자가 생략되어 있고 다른 생성자가 존재할 때  기본 생성자를 호출하는 경우
		
		D d = new D();
		d.work(); 				// 기본 생성자 호출, 객체의 필드의 초기값 ( m:0  n:0  l:0)
		
		D dd = new D(3, 4, 5);	// 매개변수 정수가 3개인 생성자 호출
		dd.work();
		
		D ddd = new D(1, 2);	// 매개변수가 정수 2개인 생성자 호출
		ddd.work();
		
		
		//// 생성자 : (메소드 이름 == 객체 이름) + 리턴값이 없는 메소드
		// 객체 내의 필드의 값을 초기화 할 때 오버로딩(Overloading)에 의해서 해당 생성자 호출됨
			// 오버로딩 : 메소드명(생성자명, 데이터 타입, 매개변수 갯수) <-- 시그니처
				// 오버로딩 오류 발생의 경우 : 데이터 타입과 매개변수의 갯수가 동일한 메소드는 오류
									// 어떤 것에 값을 넣을지 판단할 수 없다.
	}

}
