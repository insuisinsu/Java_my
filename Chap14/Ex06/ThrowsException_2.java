package Chap14.Ex06;

//일반 예외 (Checked Exception) : 컴파일 단계에서 예외 발생
// 1. try catch 를 이용하여 직접 처리
// 2. throws 를 사용해서 전가

//main 메서드에 throws 로 전가시키는 경우?
// Exception이 발생하면 정보를 출력해주고 중지.


public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//정상적으로 파일이 존재함 -> ClassNotFoundException 이 발생하지 않음
		Class cls = Class.forName("java.lang.Object");
		//파일 없음 -> ClassNotFoundException 이 발생
		Class cls2 = Class.forName("java.lang.Object0");
		
	}

}
