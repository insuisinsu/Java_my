package Chap11.Ex03;

/*
 	abstrack(추상)메소드 : 실행영역이 없는 메소드
 		메소드의 기본 형식 : void print () {}
 		추상 메소드의 형식 : abstract void print ();
 		추상 클래스의 형식 : abstract class A { 추상 메소드 하나 이상 포함}
 			-> 추상클래스는 객체화 할 수 없다. 단, 타입으로는 정의 할 수 있다.
 				// 팀장 : 메소드를 정의해준다 (회사의 기능구현 메소드 정의)
 				// 팀원 : 설계해준 추상메소드를 오버라이딩 해서 구현부 작성
 				// -> 하위 클래스에서 메소드 오버라이딩 시 오류를 방지하기 위해 사용
 			//자식 클래스에서 메소드를 재정의해서 구현부를 작성
 */

abstract class AF{
	abstract void print();			//추상클래스
	abstract void cry();
}
class BF extends AF{
	@Override
	void print() {
		System.out.println("콘크리트 클래스 : 추상 클래스의 추상 메스도를 모두 구현한 클래스");
	}
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
//class CF extends AF{ // 부모의 추상 메소드 중 일부만 구현할 경우 -> 추상 클래스
//	@Override
//	void print() {
//	}
//}
//
//class DF extends CF{	// 콘크리트 클래스 : 부모의 모든 추상메소드를 마지막으로 구현한 클래스
//	
//}
public class AbctractModifier_1 {

	public static void main(String[] args) {

	}

}
