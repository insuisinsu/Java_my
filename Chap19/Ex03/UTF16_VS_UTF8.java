package Chap19.Ex03;

import java.io.UnsupportedEncodingException;

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {

/*
  	UTF-16	고정길이 : 한글, 영문 - 2byte
  			. 제일 처음 2byte 짜리 BOM 식별 코드가 추가됨
  	UTF-8	가변길이 : 한글 - 2byte, 영문 - 1byte
 */
		//영문
		byte[] b1 = "abc".getBytes("UTF-16");
			//BOM 식별 코드 : 2byte
			//abc : 6byte
		byte[] b2 = "abc".getBytes("UTF-8");
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println();
		
		for (byte b : b1) {
			System.out.printf("%02X", b);
			System.out.println();
		}System.out.println();
		
		for (byte b : b2) {
			System.out.printf("%02X", b);
			System.out.println();
		}
		System.out.println(new String (b1, "UTF-16"));
		System.out.println(new String (b2, "UTF-8"));
		
		
		System.out.println();
		//한글
		byte[] b3 = "가나다".getBytes("UTF-16");
			//BOM 식별 코드 : 2byte
			//가나다 : 6byte
		byte[] b4 = "가나다".getBytes("UTF-8");
			//한글 3byte
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println();
		
		for (byte b : b3) {
			System.out.printf("%02X", b);
			System.out.println();
		}System.out.println();
		
		for (byte b : b4) {
			System.out.printf("%02X", b);
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(new String (b3, "UTF-16"));
		System.out.println(new String (b4, "UTF-8"));
		
		
		
		
	}

}
