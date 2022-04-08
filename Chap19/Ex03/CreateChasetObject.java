package Chap19.Ex03;

import java.nio.charset.Charset;

public class CreateChasetObject {

	public static void main(String[] args) {

		
//		문자 엔코딩 설정을 적용하는 방법
//		1. Charset.defaultCharset()	: 시스템의 기본 설정 불러오기
		
		Charset cs1 = Charset.defaultCharset();
		
		System.out.println(cs1);		//MS949 의 확장 == x-windows-949
										//UTF-8
		
//		2. Charset.forNames("인코딩 타입(MS949)")	: 인코딩 타입 직접 할당하기
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC-KR");	//존재하지 않는 인코딩을 넣으면 예외발생 UnsupportedCharsetException
		System.out.println(cs4);
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("UTF-16"));
		
		
		
		
		
		
		
		
	}

}
