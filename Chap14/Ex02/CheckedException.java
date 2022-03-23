package Chap14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
  	Checked Exception (일반 예외)
	: 컴파일 단계에서 예외 발생 ,, -> 컴파일 하기 전에(빌드(저장)하기 전에)
	==> 빌드 하기 전에 예외처리 필요
	
	unChecked Exception (실행 예외) , Runtime Exception
	: 실행시에 예외가 발생될 수도 있음
	==> 필수는 아니지만 예외처리 필요, 
*/

class A{
	B b;		// b = null
	A (){}		//기본생성자
	A (B b){
		this.b = b;
	}
	
	interface B{
		void cry();
	}
	
	void abc() {
		System.out.println(b);
		b.cry();
	}
}
class CheckedException {

	public static void main(String[] args) {

		//1. Checked Exception
		// . 컴파일 단계에서 예외처리 필요
		
		//InterruptedException : 스레드 중간에 끼어들기가 발생하면 예외가 발생
//		Thread.sleep(1000);
		
		
		//ClassNotFoundException : 클래스를 찾지 못하는 예외
//		Class cls = Class.forName("java.lang.Object");
		
		//IOException : 네트워크에서 값을(정보) 못 읽어 올 수 있는 예외
		//Syste.in : 콘솔을 뜻함.
		InputStreamReader in = new InputStreamReader(System.in);
//		in.read()
		
		//FileNotFouneException : 파일을 찾지 못하는 예외가 발생될 수 있음
//		FileInputStream fis = new FileInputStream("text.txt");
		
		//2. unCheckedException(Runtime Exception)
		//	. 실행 시에 발생되는 예외
		
		//NullPointExcption : 객체가 null 인 상태에서 객체의 필드나 메서드를 호출하는 경우
		A a1 = new A();
//		a1.abc(); 		//컴파일 단계에서는 에러가 발생하지 않지만 실행 단계에서 예외 발생
		
	}

}
