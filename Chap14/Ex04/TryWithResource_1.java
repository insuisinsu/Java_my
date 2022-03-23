package Chap14.Ex04;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		/*
		1. 수동 리소스 해제. (기존 프로그래머 사용)
			- 코드가 길고 지저분함 */
			
		System.out.println("문자를 입력하세요");
		InputStreamReader isr2 = null;		//사용후 반드시 메모리에서 객체를 삭제, isr2.close() 호출
		//System.in : 콘솔에서 입력을 받도록 처리 - 한 번만 인풋을 받을 수 있음
		// 객체가 종료되면 두 번 인풋을 받지 못함.. ( 한 번 받으면 객체가 종료된다는 말인듯)
		
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();    //일반예외 - 컴파일 단계에서,,
											   //IOException : 입력 출시 예외 
			System.out.println("입력글자 :"+input);
		}catch(IOException e) {
			e.printStackTrace();   				//try{} 에서 예외가 발생될 경우 자세한 정보 출력 
		}finally {								//객체를 사용하고 난 뒤 메모리 영역에서 삭제
												//리소스 해제 : isr2.close()
			if(isr2 != null) {
				try {
					isr2.close();				//IOException 발생,, try/catch 로 묶어야됨
				} catch (IOException e) {

					e.printStackTrace();
				} 	
			}
		}
		
		
		
		/*
		2. 자동 리소스 해제. (Java 1.7 부터)
			- 코드가 간결하지만 필요 조건 있음
			조건1) 사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야 함.
			조건2) 객체에 close() 가 반드시 존재해야 함.		
			조건 1, 조건 2 를 만족할 때 자동  리소스 해제
			try(자동으로 리소스를 해제할 객체 선언){} catch{} finally{}
		 */
		
		//InputStreamReader 는 Autocloseable 인터페이스를 구현하고 있음
		//close() 또한 가지고 있음
		//Try with Resource : try (with resource = 객체가 메모리에 로드?) {}
		try(InputStreamReader isr1 = new InputStreamReader(System.in); ){
			char input = (char) isr1.read();
			System.out.println("입력글자 : "+input);
		}catch(IOException e){
			e.printStackTrace();
		}
		//finally 블락을 생략하더라도 객체를 자동으로 close()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
