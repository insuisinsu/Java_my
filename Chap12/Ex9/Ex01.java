package Chap12.Ex9;

import org.xml.sax.SAXNotRecognizedException;

public class Ex01 {
	public static void main(String[] args) {
		
		//1. SamsungPhone Ÿ������ ��ü ����
		SamsungPhone s1 = new SamsungPhone();
		
		//2.
		s1.printLogo();			//interface ���� ��ӵǾ� ������ ���
		s1.sendCall();
		s1.receiveCall();
		s1.flash();				//
		
		System.out.println("================");
		
		//2. PhoneInterface �� ��ĳ����
		PhoneInterface s2 = new SamsungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
//		s2.flash();		//SamsungPhone  Ŭ������ �޼ҵ�� �ٿ�ĳ���� �ʿ�
		SamsungPhone ss = (SamsungPhone) s2;	//PhoneInterface ���� SamsungPhone
		ss.flash(); 	//
		
		

		int num = 15;

		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
	}

}
