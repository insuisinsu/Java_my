package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;		//Console �� ���ؼ� ��ǲ�� ����
		
//		1. 1byte ������ �б�
		int data;
		while( (data = is.read()) != '\r') {	//is.read() �� ȣ��� �� �ֿܼ��� ��ǲ�� ���
			System.out.print((char)data);
		}
		is.read();	//10 <- \n
		//���ۿ� \n �� �����־ ���������. ���ۿ��� \n �� ������ ������ ���� read() �� \n �� ��
		System.out.println();
		System.out.println("====================================");
		System.out.println();
		
//		2. n-byte ������ �б� ( byte[] �� ó�� ��ġ���� ���� �����͸� ����)
		
		
		byte[] byteArray1 = new byte[100];	//�ֿܼ��� �迭�� ����� �� \r\n ���� �����
		int count1 = is.read(byteArray1);	//count1 �� 100, 100, 100, 30, -1  �̷������� ���� ����
											//��ũ��(100) ��ŭ�� �дٰ� ������(30) �а�, ���� ������ -1 �� ��
		//count1 �� �迭���� ���� ���� ������ ����		
		
		
		for(int i =0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		System.out.println("==");
		int count2;
		count2=is.read(byteArray1); 
		System.out.println(new String(byteArray1));
		
		
		System.out.println("===========");
		
//		3. n-byte ������ �а� ( length ��ŭ �о�ͼ� byte[] offset ��ġ���� ����
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArray2, offset, length);
		
		for(int i =0; i < offset+length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
	
		is.close();		//���� �������� ó������� ��.   �߰��� close() �ϸ� �ٽ� ȣ�� �Ұ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
