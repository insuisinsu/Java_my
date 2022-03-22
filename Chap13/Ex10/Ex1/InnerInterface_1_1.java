package Chap13.Ex10.Ex1;

class A{
	/*
	 	B : 인터페이스 타입, b : 참조 변수 - 값을 할당하는 방법
	 	
	 	1. 객체 생성 후 값을 할당
	 	2. 생성자를 통해서 값을 할당
	 	3. setter 를 통해서 값을 할당. 
	 */
	
	B b;
	
	A (){}
	A(B b){
		
	}
	
	public void setB (B b) {
		this.b = b;
	}
	
	interface B {
		void play();
		void stop();
	}
	
	//play(), stop() 재정의
	void abc() {
		b.play();
		b.stop();
	}
}


public class InnerInterface_1_1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.setB(new A.B() {
			
			@Override
			public void play() {
				System.out.println("a 의 play");
			}
			
			@Override
			public void stop() {
				System.out.println("a 의 stop");
			}
			
		});
		
		a.abc();
		
		System.out.println("-------------");
		
		//1. 객체 생성 후 필드에 값을 할당하는 방법
		A a1 = new A();
		//인터페이스 A.B
		a1.b = (A.B) new A.B() {
			public void play() {System.out.println("a1의 play");};
			public void stop() {System.out.println("a1의 stop");};
		};
		a1.abc();
		
		//2. 생성자를 통해서 값을 할당
		
		//생성자 내부에  A.B 타입의 객체 생성 후 넣기
		A a2 = new A(
			new A.B() {
					
				@Override
				public void stop() {
					System.out.println("a2 의 stop");
				}
				
				@Override
				public void play() {
					System.out.println("a2 의 play");
				}
			}
		);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
