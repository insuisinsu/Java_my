package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in	 : Console ���� input �� �޴� �ڹٿ��� �������ִ� ��ü, InputStream
 		Windows : �ֿܼ��� Enter = \r\n
 		MAC		: �ܼ����� Enter = \r
 	System.out	 : Console �� ����ϴ� ��ü, OutputStream
 */

public class ConsoleInputObject_1_1 {

	public static void main(String[] args) throws IOException {

		//1. Console ���� ��ǲ�ޱ� ���� ��ü ����
		InputStream is1 = System.in;		//new ���� ������ // is1 �� �ֿܼ��� ��ǲ �޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>");
		
		int data;
		
		while((data = is1.read()) != '\n') {	//1byte �� �о int data �� �Ҵ� 
			System.out.print((char)data);
		}
		System.out.println(data);			//10 <- \n
		System.out.println(is1.read());		//�� �̻� read �� ����
		
		
		
	}

}
