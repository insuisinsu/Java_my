package Chap0607.Ex06;


//import Chap0607.Ex05.B;	// B class 에 public이 없기 때문에 다른 패키지의 클래스에서 불러올 수 없음
import Chap0607.Ex05.Bb;  // 다른 패키지의 클래스에서 클래스를 호출 할 때는 public 접근제한자가 있어야 함

public class ExternalClass_02 {

	public static void main(String[] args) {

//		B b = new B();			// default 접근제어자 때문에 다른 패키지에서 접근 불가능
		
		
		// 다른 패키지의 클래스도 접근 가능
		// 1. import
		// 2. 해당 클래스 제어자가 public 일 것
		// 3. 필드, 메소드의 접근제한자에 따라 접근 가능(protected(상속관계), public)
									//or 불가능(private, default)
		Bb bb = new Bb();		

		//필드 접근
//		bb.a = 10;			//private	: 같은 클래스 내에서만 접근 가능
//		bb.b = 20;			//default	: 같은 패키지 내에서만 접근 가능
//		bb.c = 30;			//protected	: (상속관계의)다른 패키지의 클래스에서도 접근 가능
		bb.d = 40;			//public	: 다른 패키지의 클래스에서도 접근 가능
		
		//메소드 접근
//		bb.print1();			//private	: 같은 클래스 내에서만 접근 가능
//		bb.print2();			//default	: 같은 패키지 내에서만 접근 가능
//		bb.print3();			//protected	: (상속관계의)다른 패키지의 클래스에서도 접근 가능
		bb.print4();			//public	: 다른 패키지의 클래스에서도 접근 가능
		
	}

}
