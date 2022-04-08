package Chap19.Ex03;

import java.nio.charset.Charset;

public class CreateChasetObject {

	public static void main(String[] args) {

		
//		���� ���ڵ� ������ �����ϴ� ���
//		1. Charset.defaultCharset()	: �ý����� �⺻ ���� �ҷ�����
		
		Charset cs1 = Charset.defaultCharset();
		
		System.out.println(cs1);		//MS949 �� Ȯ�� == x-windows-949
										//UTF-8
		
//		2. Charset.forNames("���ڵ� Ÿ��(MS949)")	: ���ڵ� Ÿ�� ���� �Ҵ��ϱ�
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC-KR");	//�������� �ʴ� ���ڵ��� ������ ���ܹ߻� UnsupportedCharsetException
		System.out.println(cs4);
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("UTF-16"));
		
		
		
		
		
		
		
		
	}

}
