package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {

//		FileOutputStream �� ����ؼ� �ѱ�ó��
//		1. ������ ���� ����
		File outFile = new File("Chap19/Ex05/FileOutputStream2.txt");
		//�⺻������ ��Ŭ������ default charactorSet���� �����
		
//		2. n-byte ������ ���� ó�� - byte[] �� ó������ ������ ����
		OutputStream os2 = new FileOutputStream(outFile);
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes(Charset.forName("MS949"));
			//�� 10byte ?-> �ѱ��� ���ڿ� 2byte �� ó����
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
//		3. n-byte ���� - byte[] �� offset ���� length ���� byte ������ ����
		OutputStream os3 = new FileOutputStream(outFile, true);		//true - �̾ ����
		byte[] byteArray2 = "�ݰ����ϴ�...".getBytes(Charset.forName("MS949"));
//		byte[] byteArray2 = "�ݰ����ϴ�.".getBytes(Charset.defaultCharset()); // �⺻ charset ���� ��������
		os3.write(byteArray2, 6, 6); 	// 2byte ��� 2byte �� ����
										//write �϶��� offset ��ŭ(7byte) ���� �����ϰ� ������ �߿� 8byte �о ����
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
