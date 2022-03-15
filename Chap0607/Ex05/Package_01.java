package Chap0607.Ex05;

//import 클래스의 전체 이름(java.util.Scanner;)
//--> 클래스 파일이 자신의 패키지에 존재하지 않는 경우 
import java.util.Scanner;
//자동 import : ctrl + shift + o


//클래서 외부에 선언 :
//1. 패키지
//2. import
//3. 외부 클래스

//패키지는 클래스 외부에서 선언

//패키지는 클래스를 담는 그릇

//패키지를 선언하지 않고 클래스를 생성할 경우 'Default 패키지에 저장', 클래스의 위치는 src 폴더

//같은 패키지 내에서는 동일한 이름의 클래스가 존재할 수 없다.
	// 프로젝트 진행 시 클래스 이름을 동일하게 적용해야 하는 경우?
		// --> 패키지를 분리

public class Package_01 {

	//클래스의 Full Name : 패키지명 + 클래스명 
	// --> Chap0607.Ex05.Package_01 <-- 클래스의 전체 이름
	
	public static void main(String[] args) {

	// 같은 패키지에 존재하지 않는 클래스를 사용할 때 import 필요
		Scanner sc = new Scanner(System.in);
	//  클래스	객체	 new  생성자	  매개변수
		
	}

}
