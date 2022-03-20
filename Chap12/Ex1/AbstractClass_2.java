package Chap12.Ex1;

//추상 메소드를 사용하는 2번째 방법
// --> 자식 객체 생성없이 익명 클래스를 활용하는 방법
	// 1번만 임시로 사용할 때 사용 = 이벤트 처리할 때 등
	//장점 : 자식 클래스 생성을 하지 않는다.
	//단점 : 여러 개의 객체를 생성해야 할 경우 코드가 길어질 수 있음

abstract class AAA{
	abstract void abc();
}


public class AbstractClass_2 {

	public static void main(String[] args) {

		AAA aaa = new AAA() {
			void abc() {
				System.out.println("방법2 : 객체 생성 없이 익명클래스로 추상메소드 구현");
			}
		};
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("방법2 :");
			}
		};
		
		
		
		
		aaa.abc();
		aaa2.abc();
		
		
	}

}
