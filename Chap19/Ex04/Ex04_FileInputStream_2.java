package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Ex04_FileInputStream_2 {

	public static void main(String[] args) {

		/*
		 	is1 : ms949 �ѱ۷� �б�, try (with resource) �� ����ó�� 
		 	is2 : UTF-8 �ѱ۷� �б�, try �� ����ó��
		 	
		 */

		
		
		File ms949 = new File("Chap19/Ex04/files/file_ms949.txt");
		File utf8 = new File("Chap19/Ex04/files/file_utf-8.txt");
		
		byte[] arr = new byte[200];
		
		try (InputStream is1 = new FileInputStream(ms949);){
			int data;
			while((data = is1.read(arr)) != -1) {
				System.out.println(new String(arr, Charset.forName("MS949")));
			}
		}catch(IOException e) {
			System.out.println("���ܹ߻�");
		}
		
		
		
		InputStream is2;
		int data;
		try {
			is2 = new FileInputStream(utf8);
			while((data = is2.read(arr)) != -1) {
				System.out.print(new String(arr, Charset.forName("UTF-8")));
			}
		} catch (IOException e) {
		} finally {
			try {
				is2.close();
			} catch (IOException e) {
			}
		}
		
		
		
		
		
		
		
		
	}

}
