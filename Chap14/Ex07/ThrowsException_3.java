package Chap14.Ex07;

// Exception - Checked Exception - 컴파일 오류, 반드시 예외처리
//			 - unChecked Exception, RunTime Exception - 실행시에 예외
// 
//예외처리 방식  try catch - 자신이 직접 예외를 처리
//			  throws - 예외처리를 미루는 것, 메서드 블락안의 예외를 메서드 호출시 호출하는 쪽에 미루는 것
//			  throw - 예외를 강제로 발생시킴

// 하위 메서드의 예외를 처리하는 경우


//1. Exception이 발생되는 메서드 내부에서 자신이 직접 예외를 처리하는 경우
class A {
	void abc() {
		bcd();
	}
	//Class.forName : 동적 로딩 - 컴파일시에 체크하지 않고 실행할 때 객체가 존재하는지 확인
	//실행시 클래스 파일이 존재할 수도 있고 존재하지 않을 수도 있기 때문에 예외처리 해야함
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");   //일반 예외
			Thread.sleep(1000); 						      // 일반 예외	//밀리세컨 ms, 1000ms = 1초
		} catch (ClassNotFoundException | InterruptedException e) {
		}	
	}
}

//2. Throws 를 사용해서 Exception 을 미루는 경우
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException_3 {

	public static void main(String[] args) {

	}

}
