package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_3 {

	public static void main(String[] args) throws IOException {

//		�ܼ� ��ǲ�� �ѱ� ó��			: 1-byte �� ������ �ѱ�ó���� ���� ����. . �迭�� �о�� �ѱ� ����
// 		InputStream  System.in
		
		InputStream is = System.in;		//�ѹ��� ������ �� �ִ�.   close() ���� ���� �������� �ѹ��� ȣ��
		
		System.out.println("�ѱ��� �Է��ϼ���. >>");
		
//		n-byte �迭 �б� ( byte[] ó�� ��ġ���� ���� ������ ���� )
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		// \n\r ����
			//count1 �� byteArray1 �� ����� ���� ���� (\n\r ����)
		
		
		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("�迭 ���� �� ����(r�� n�� ����) : " + count1);
		System.out.println("======================");
		System.out.println();
		
		
//		3. n-byte ���� �б� (length ��ŭ �о�ͼ� byte[] �迭�� offset ��ġ�� �����ض�
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		
		String str2 = new String(byteArray2, 0, offset+count2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
