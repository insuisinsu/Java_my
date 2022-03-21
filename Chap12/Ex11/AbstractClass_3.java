package Chap12.Ex11;

abstract class D{
	//추상 메소드 = 구현부이 선언만 된 메소드
	//클래스 내부에 추상 메소드가 올 경우 abstract  키가 있어야 함
	//추상 클래스는 객체화 할 수 없음
	abstract void print();
}
	//자식 클래스는 추상클래스의 메소드를 재정의 해야함
class E extends D{

	@Override
	void print() {
		System.out.println("E class, print()");
	}
	
}
public class AbstractClass_3 {

	public static void main(String[] args) {

		D d1 = new E();
		D d2 = new E();
		D d3 = new E(); 
		d1.print();
		d2.print();
		d3.print();
		
		D d4 = new E() {
			void print() {
				System.out.println("d4");
			}
		};
		
		D d5 = new E() {
			void print() {
				System.out.println("d5");
			}
		};
		
		D d6 = new E() {
			void print() {
				System.out.println("d6");
			}
		};
		d4.print();
		d5.print();
		d6.print();
		
		D d7 = new D() {
			void print() {
				System.out.println("d7");
			}
		};
		d7.print();
	}

}
