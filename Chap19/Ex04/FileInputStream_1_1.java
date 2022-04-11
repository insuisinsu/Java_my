package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {

	public static void main(String[] args) {

//		1. 각 예외에 대해서 각각 처리
		
		File inFile = new File("Chap19\\files\\FileInputStream1.txt");
		
		InputStream is = null;
		
		try {is = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는데요.");
		}
		
		int data;
		try {
			while((data = is.read()) != -1) {	//IOException 발생
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었어요.");
		}
		
		try {
			if(is != null) {
				is.close();
			}
		} catch (IOException e) {
		}

		
//		2. 2 개의 예외를 한번에 처리
		
		InputStream is2 = null;
		int data2 = 0;
		
		try {
			is2 = new FileInputStream(inFile);
			while((data2 = is2.read()) != -1) {		//IOException 으로 포괄적으로 처리  얘가 FileNot~ 보다 상위에 있음
				System.out.print((char)data2);
			}
		}catch (IOException e) {
			System.out.println("예외가 발생했지요.");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("예외가 발생했다오.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
