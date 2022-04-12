package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;		//System.out : �ֿܼ� ���,, byte ������ ���
		
//		1. 1-byte ���
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');		//���ۿ����� ����Ǿ� ����
		os.write('\n');
		
		os.flush(); 		//������ ������ console �� ���
		
//		2. n-byte ���		//byte �� �ֿܼ� ���
		byte[] byteArra1 = "Hello!".getBytes();		// String �� byte �� ��ȯ
		os.write(byteArra1);
		os.write('\n');			// \r\n
		
		os.flush();
		
//		3. n-byte ���
		byte[] byteArray2 = "Better the last smile than first laughter".getBytes();
		os.write(byteArray2, 7, 8);
		//write(byte�迭, offset, length) offset ��ŭ �����ϰ�, length ��ŭ �����
		os.flush();
		
		
		os.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
