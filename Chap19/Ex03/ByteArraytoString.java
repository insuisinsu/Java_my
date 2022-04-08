package Chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {

//		1. String getBytes()	: String --> Byte[] �� ���� ,, ���ڸ� Byte �� ��ȯ�Ͽ� �迭�� ����
		
		byte[] array1 = "�ȳ�".getBytes();	//Charset �� ���� ����
		byte[] array2 = "��ť".getBytes(Charset.defaultCharset()); // ��ť�� byte �� ��ȯ + ���ڵ� Ÿ���� �⺻
		byte[] array3 = "����".getBytes(Charset.forName("MS949")); //���࿹�� // ��ť�� byte �� ��ȯ + ���ڵ� Ÿ�� ����
		byte[] array4 = "��ġ".getBytes("UTF-8"); 	//����ó�� �ʿ� //�Ϲݿ���
		
//		2. �� ���ڵ��� ����Ʈ �� ���
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		
//		new String() : byte[] -> String���� ��ȯ,, byte�� ���ڷ� ��ȯ
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));	//������ �� ���ڵ� Ÿ���� ��ġ�ؾ� ��. 
		String str4 = new String(array4, Charset.forName("UTF-8"));	//������ �� ���ڵ� Ÿ���� ��ġ�ؾ� ��. 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array1, Charset.forName("MS949"));
		
		
		
		
		
		
		
		
	}

}
