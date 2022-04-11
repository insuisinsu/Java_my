package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Ex3_Exception1 {

	public static void main(String[] args) {

/*
 		1. is1 <- InputStream ��ü ���� (���� ���) - Exception-ms949.txt, ����ó�� try,catch
 		2. is2 <- InputStream ��ü ���� (��� ���) - Exception-UTF-8.txt, ����ó�� try ~ with resource�� ����ó��
 				close() �� �ڵ����� ó��
 		
 		FileInputStream ���� �о ����ϼ���
 */
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println();
		File ms949 = new File("C:/Users/insu/Desktop/INSU/PIS/Java_my/Java_my/Chap19/Ex04/exception-ms949.txt");
		
//		1-1. �� ���ܿ� ���� try 2���� ó��
		InputStream is1 = null;			//���� ������ ����.. ?? finally ������� is1.close() �� �ϱ� ���� / 
										// try �ȿ��� �����ϸ� finally ���� ȣ�� �Ұ���
		byte[] arr1 = new byte[80];
		
		try {
			is1 = new FileInputStream(ms949);	//FileInputStream() �� FileNotFoundException �� �߻��� �� �־ ����ó��
		}catch (IOException e) {
			System.out.println("����1");
		}
		
		int data1 = 0;
		try {
			while((data1 = is1.read(arr1)) != -1){
				String str = new String(arr1, 0, data1, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e1) {
			System.out.println("����2");
		}finally {
			if(is1 != null) {
				try {
					is1.close();
				} catch (IOException e) {
				}
			}
		}System.out.println(); System.out.println();
		
//		1-2. ���� ���ܸ� try 1���� ó��
		InputStream is11 = null;
		byte[] arr11 = new byte[100];
		int data11 = 0;
		try {
			is11 = new FileInputStream(ms949);
			while((data11 = is11.read(arr11)) != -1) {
				String str1 = new String(arr11, 0, data11, Charset.forName("MS949"));
				System.out.println(str1);
			}
		} catch (IOException e1) {
			System.out.println("���ܿ���");
		}finally {
			if(is11 != null) {
				try {
					is11.close();
				} catch (IOException e) {
				}
				
			}
		}
		
			
		
		System.out.println(); System.out.println();
			
		
		File utf8 = new File("Chap19/Ex04/exception-UTF-8.txt");
		
		byte[] arr2 = new byte[80];
			//�ѱ�ó�� #1
		int data2 = 0;
		
		try (InputStream is2 = new FileInputStream(utf8)){
			//try(with resource : ��ü ����, RAM �� ���) <- close() �� �ڵ����� ó���� .. AutoClosable �� ������ Ŭ�����̾�� ��
			
			while((data2 = is2.read(arr2)) != -1) {		
				//�ѱ�ó�� #2 : is.read(byte�迭);
				String str2 = new String(arr2, 0, data2, Charset.forName("UTF-8"));
					//�ѱ�ó�� #3 : new String(byte�迭, offset, length, "encoding")
				System.out.print(str2);
			}
		}catch (IOException e) {
			System.out.println("����3");
		}
		
		
	}

}
