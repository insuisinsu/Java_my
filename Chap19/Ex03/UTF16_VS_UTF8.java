package Chap19.Ex03;

import java.io.UnsupportedEncodingException;

public class UTF16_VS_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {

/*
  	UTF-16	�������� : �ѱ�, ���� - 2byte
  			. ���� ó�� 2byte ¥�� BOM �ĺ� �ڵ尡 �߰���
  	UTF-8	�������� : �ѱ� - 2byte, ���� - 1byte
 */
		//����
		byte[] b1 = "abc".getBytes("UTF-16");
			//BOM �ĺ� �ڵ� : 2byte
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
		//�ѱ�
		byte[] b3 = "������".getBytes("UTF-16");
			//BOM �ĺ� �ڵ� : 2byte
			//������ : 6byte
		byte[] b4 = "������".getBytes("UTF-8");
			//�ѱ� 3byte
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
