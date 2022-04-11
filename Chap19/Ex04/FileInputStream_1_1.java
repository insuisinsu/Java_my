package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {

	public static void main(String[] args) {

//		1. �� ���ܿ� ���ؼ� ���� ó��
		
		File inFile = new File("Chap19\\files\\FileInputStream1.txt");
		
		InputStream is = null;
		
		try {is = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʴµ���.");
		}
		
		int data;
		try {
			while((data = is.read()) != -1) {	//IOException �߻�
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����.");
		}
		
		try {
			if(is != null) {
				is.close();
			}
		} catch (IOException e) {
		}

		
//		2. 2 ���� ���ܸ� �ѹ��� ó��
		
		InputStream is2 = null;
		int data2 = 0;
		
		try {
			is2 = new FileInputStream(inFile);
			while((data2 = is2.read()) != -1) {		//IOException ���� ���������� ó��  �갡 FileNot~ ���� ������ ����
				System.out.print((char)data2);
			}
		}catch (IOException e) {
			System.out.println("���ܰ� �߻�������.");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��ߴٿ�.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
