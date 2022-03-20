package Chap12.Ex9;

import org.xml.sax.SAXNotRecognizedException;

public class Ex01 {
	public static void main(String[] args) {
		
		//1. SamsungPhone 타입으로 객체 생성
		SamsungPhone s1 = new SamsungPhone();
		
		//2.
		s1.printLogo();			//interface 에서 상속되어 내려온 기능
		s1.sendCall();
		s1.receiveCall();
		s1.flash();				//
		
		System.out.println("================");
		
		//2. PhoneInterface 로 업캐스팅
		PhoneInterface s2 = new SamsungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
//		s2.flash();		//SamsungPhone  클래스의 메소드라서 다운캐스팅 필요
		SamsungPhone ss = (SamsungPhone) s2;	//PhoneInterface 에서 SamsungPhone
		ss.flash(); 	//
		
		

		int num = 15;

		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
	}

}
