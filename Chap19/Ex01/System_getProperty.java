package Chap19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {

		//System.getProperty() 메소드의 유용한 정보들
		
		//현재 작업 디렉토리 출력
		System.out.println(System.getProperty("user.dir"));
		
		//자바 버전 출력
		System.out.println(System.getProperty("java.version"));
		
		//
		System.out.println(System.getProperty("java.vendor"));
		
		//
		System.out.println(System.getProperty("java.vendor.url"));
		
		//자바 설치 홈폴더
		System.out.println(System.getProperty("java.home"));
		
		//
		System.out.println(System.getProperty("java.class.version"));
		
		//
		System.out.println(System.getProperty("java.class.path"));
		
		//로그온한 계정
		System.out.println(System.getProperty("user.name"));
		
		//로그온한 계정의 홈폴더
		System.out.println(System.getProperty("user.home"));
		
		//운영체제 정보
		System.out.println(System.getProperty("os.name"));
		
		//OS 아키텍처
		System.out.println(System.getProperty("os.arch"));
		
		//OS 버전
		System.out.println(System.getProperty("os.version"));
		
		//폴더 구분자
		System.out.println(System.getProperty("file.separator"));
		
		//path 구분자
		System.out.println(System.getProperty("path.separator"));
		
		//행 구분자
		System.out.println(System.getProperty("line.separator"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
