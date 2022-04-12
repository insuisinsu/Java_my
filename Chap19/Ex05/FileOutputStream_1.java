package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
	InputStream			: �߻�Ŭ����
	OutputStream		: �߻�Ŭ����
	-> �� ���� ������ Ŭ������ FileInputStream, FileOutputStream
	
	FileInputStream		: byte() ���� ������ �б�
	FileOutputStream	: byte() ���� ������ ����
	
	�ܼ�, �޸��忡�� Enter �� ������ Windows��   \r\n �� �Էµ� .. ��, \r �� ���� ����
								MAC ������  \n
	
 */

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
//		1. �Է����� ���� ( ���� �������� ���� )
		File outFile = new File("Chap19/Ex05/FileOutputStream1.txt");
		System.out.println(outFile.isFile());
//		2. 1byte �� �б�
		OutputStream os1 = new FileOutputStream(outFile);
//		FileOutStream�� �������� �ʴ� ������ ������ ����� ������

//		write() �� ���ۿ�(�޸�, RAM)�� ����  = ���Ͽ� ���� �Էµ� ���� �ƴϴ�
//			���۰� ���� ����, ���Ͽ� ���Ⱑ ��
		os1.write('J');										//write : IOException �߻�
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');		// 13(byte) : ����	// ��������
		os1.write('\n');		// 10(byte)	: ����
		
//		��, flush() : ���ۿ� ����� ������ ���Ͽ� ������ ����
		os1.flush();

//		close() �� ȣ���ϸ� flush() �� �ڵ����� ȣ��Ǳ� ������
//		flush() �� ���� ����������, ����� ���� ������		
		os1.close();
		
//		2. n-byte ���� ���� ( byte[] �� offset ���� length ���� byte ������ ����)?? ��� ���� �׷�
		
		OutputStream os2 = new FileOutputStream(outFile);	//�����
//							FileOutputStream(���ϰ�ü, �̾��(boolean append)(false �� �⺻ - �����, true - �̾��)
		
		byte[] byteArray1 = "Hello!".getBytes(); 	// String --> byte �� ��ȯ : getByte();
		
		os2.write(byteArray1);
		os2.write('\n'); 		// \r�� ���� ����, \n �� �־ Windows ���� ���� ó����
		
		os2.flush();
		os2.close();
		
//		3. n-byte ���� ���� (byte[] �� offset ���� length ���� byte ������ ����)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8); 	//write �϶��� offset ��ŭ(7byte) ���� �����ϰ� ������ �߿� 8byte �о ����
										//read �϶��� �ݴ�� offset ��ŭ ���� ���� ���
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
	}

}
