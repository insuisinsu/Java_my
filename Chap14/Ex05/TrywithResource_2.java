package Chap14.Ex05;

import javax.naming.spi.DirStateFactory.Result;

/*
 	직접 생성한 객체에서 AutoCloseable 을 사용해보기
 	try(with Resource)
 	try(객체 생성 구문){} catch{} : 자동으로 close() 됨
 	
 	1. AutoCloseable 인터페이스의 close() 를 오버라이딩 해야함.
 	
 		java.lang.AutoCloseable : java.lang 은 import 문을 사용하지 않아도 됨
 		java.lang.Object
 	 
 	. 예외를 처리하는 방법
 	1. try catch 를 사용해서 예외 처리
 		- 자신이 직접 예외 처리
 	2. throws 를 통해서 예외 처리
 		- 예외를 내가 아닌 호출하는 곳에서 처리하도록 예외를 처리 하도록 미룬다.
 		- 예외 전가 .. 메소드에서 예외 처리
 		throw : 예외를 강제로 발생시킴
 	
 */
 
class A implements AutoCloseable{
	
	String resource;				//resource == null
	
	A (String resource){			// 생성자의 매개변수로 String 값을 받아서 메모리로 로딩
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {	//close() 가 자동으로 호출된다.
		if(resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
			System.out.println(resource);
		}
	}
}



public class TrywithResource_2 {

	public static void main(String[] args) {

		// 1. 자동 리소스 해제
		try (A a1 = new A("특정파일");){
			
		}catch(Exception e){
			System.out.println("예외가 발생되었습니다.");
		}	//finally 블락에 a1.close() 를 자동으로 호출
		
		System.out.println("====================");
		
		//2. 수동으로 리소스 해제
		A a2 = null;
				
		try {
			a2 = new A("생성자 초기값 할당");
		}catch(Exception e){
			
		}finally {
			if(a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
				}
				
			}
		}
		
		
		
		
		
		
		
	}

}
