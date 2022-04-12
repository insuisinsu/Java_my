package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {

//		���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
//		1. �Է� ���� ����
		//������ ����
		File inFile1 = new File("E:\\PIS\\JAVA\\src\\Chap19\\files\\FileInputStream1.txt");
		//����� ���� : ���� �۾����丮�� �������� ����
		File inFile = new File("Chap19\\files\\FileInputStream1.txt");
		
//		2. InputStream ��ü�� �����ؾ� ������ ������ �о���� �� ����
		InputStream is = new FileInputStream(inFile);
			//InputStream �� �߻�Ŭ������. ��, ���� ��ü ���� �Ұ��� , Ÿ�����θ� ���� ����
		
//		���� ���� ���
		
		//UTF-8 : ���� - 1, �ѱ� - 3
		//UTF-16 : ���� - 2, �ѱ� - 2
		//MS949 : ���� - 1, �ѱ� - 2
		//EUC-KR : ���� - 1, �ѱ� - 2
		
//		JAVA ���� �� �ٲ� ó��
//		UNIX	: \n
//		Windows	: \r\n	.. \r �� �����ص� ��. / �ܼ��̳� �޸��忡�� enter �� ������ \r\n
//		MAC		: \r
		
		
		System.out.println(is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.println();
		//��Ʈ���� ���� ������ �޸𸮿��� ������.
		//���� �б� ���ؼ��� ���ο� ��Ʈ���� �����ؾ� ��
		
		
		//int read() : �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� �������� ���� ��� -1 ����
//		while ���� ����ؼ� �� ���� ���
		InputStream is1 = new FileInputStream(inFile);
		int data;
		while((data = is1.read()) != -1) {
			System.out.print((char)data);
		}System.out.println(); System.out.println();
	
		
		// available() : ��Ʈ���� ���� ����Ʈ ���� ���
		InputStream is2 = new FileInputStream(inFile);
		while((data = is2.read()) != -1) {
			System.out.println("���� ������ : "+(char)data+" ���� ����Ʈ �� : "+is2.available());
		}
		
		is.close();
		is1.close();
		is2.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
