package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {

		//1. �Է� ���� ����
		File inFile = new File("Chap19/Ex04/FileInputStream1.txt");
		
		//2. byte ���� �б� - �� ����Ʈ�� �о ó��
		
		InputStream is1 = null; 	// ��ü ����
		try {
			is1 = new FileInputStream(inFile); 	//��ü ����
			int data;
			while((data=is1.read()) != -1) {	//������ �ֱ� ������ read() �� ����ص� ����
												//�ѱ��� ��� byte �迭�� �����ϰ�, read(byte�迭) ���
												// ?-> �ѱ��� 2byte �ϱ� 1byte �� ������ ǥ�� �Ұ��� 
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}finally {
			if(is1 != null) {
				try {
					is1.close();			//null �϶� close() �� ȣ���ϸ� IOException �߻�
				} catch (IOException e) {
				}
			}
		}
		System.out.println();
		System.out.println("try(with resource){} �� �����ϱ� ==========");
		
		//2.2
		try (InputStream is11 = new FileInputStream(inFile);) {
			 	//try(with resource : ��ü����) <- close() �� �ڵ����� �� ,, FileInputStream �� closable �������̽��� �����ϰ� ����
			int data;
			while((data=is11.read()) != -1) {	//������ �ֱ� ������ read() �� ����ص� ����
												//�ѱ��� ��� byte �迭�� �����ϰ�, read(byte�迭) ���
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}System.out.println();System.out.println();
		
		//3.1 n-byte ������ �б� - byte[] �� ó����ġ���� ���� ���� ������ ����
		// ���� ����Ʈ�� ���ÿ� �о ó���ӵ��� ����
		// �迭�� ���� ũ�⸸ŭ �о�鿩�� byte �迭�� ���� -> �ѱ�ó�� ����
		
		InputStream is2 = new FileInputStream(inFile);		//throws �� ó��(������ �ȵ�)
		byte[] byteArray1 = new byte[9]; 	//�迭 index 9�� , 0 ~ 8 ����
		
		int count1;
		while((count1 = is2.read(byteArray1)) != -1) {		// -1 : ������ ������ ����
						//is2.read() : 1byte �� ����
			for(int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(" : count1 = " + count1);
//			System.out.println();
//			System.out.println("===============");
//			String str = new String(byteArray1, Charset.forName("MS949"));
//			System.out.println(str);
		}
		
		is2.close();
		System.out.println();
		
		//3.2 n-byte ������ �о �ѱ�ó�� [] �迭 ������ �о �ѱ� ó��
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		while( (count2 = is3.read(byteArray2)) != -1) {	//count2 = 100, -1
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		is3.close();
		System.out.println("===");
		
		//3.3 n-byte ������ �о ����.. offset, length ���
		
		InputStream is4 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;		// offset + length �� byte �迭�� ũ�⸦ �Ѿ�� ������
		int count4 = is4.read(byteArray4, offset, length);
		//length ��ŭ �տ��� �о�ͼ� byteArray4 �� offset ��ġ�� ����
		//offset ��ŭ �� ������ length ��ŭ �����´ٴ� �Ҹ��ε�
		System.out.println(count4);
//		while( count4 != -1) {
			for( int i =0; i< offset+count4; i++) {
				System.out.print((char) byteArray4[i]);
			}
//		}
		is4.close();
		
		
		
		
		
		
		
		
		
	}

}