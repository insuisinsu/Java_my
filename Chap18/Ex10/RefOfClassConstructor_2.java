package Chap18.Ex10;

interface A{
	B abc(int k);		// B 객체를 리턴
}

class B{
	B(){
		System.out.println("첫번재 생성자");
	}
	B(int k ){
		System.out.println("두번째 생성자");
	}
	
}



public class RefOfClassConstructor_2 {

	public static void main(String[] args) {

//		1. 클래스 생성자 참조
//		익명 이너 클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {			//abc() 호출시 B 객체의 기본 호출 = 생성자 참조
				return new B(3);
			}
		};
		
//		2. 람다식
		A a2 = (int k ) -> {return new B(3);};
		A a3 = k -> new B(3);
		
//		3. 클래스 생성자 참조
		A a4 = B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
		
		
		
	}

}
