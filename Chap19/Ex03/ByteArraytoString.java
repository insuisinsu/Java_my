package Chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {

//		1. String getBytes()	: String --> Byte[] 로 분해 ,, 문자를 Byte 로 변환하여 배열제 저장
		
		byte[] array1 = "안녕".getBytes();	//Charset 을 지정 안함
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset()); // 땡큐를 byte 로 변환 + 인코딩 타입은 기본
		byte[] array3 = "베리".getBytes(Charset.forName("MS949")); //실행예외 // 땡큐를 byte 로 변환 + 인코딩 타입 설정
		byte[] array4 = "머치".getBytes("UTF-8"); 	//예외처리 필요 //일반예외
		
//		2. 각 인코딩의 바이트 수 출력
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		
//		new String() : byte[] -> String으로 변환,, byte를 문자로 변환
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));	//가져올 때 인코딩 타입이 일치해야 함. 
		String str4 = new String(array4, Charset.forName("UTF-8"));	//가져올 때 인코딩 타입이 일치해야 함. 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array1, Charset.forName("MS949"));
		
		
		
		
		
		
		
		
	}

}
