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
 		1. is1 <- InputStream 객체 생성 (절대 경로) - Exception-ms949.txt, 예외처리 try,catch
 		2. is2 <- InputStream 객체 생성 (상대 경로) - Exception-UTF-8.txt, 예외처리 try ~ with resource로 예외처리
 				close() 를 자동으로 처리
 		
 		FileInputStream 으로 읽어서 출력하세요
 */
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println();
		File ms949 = new File("C:/Users/insu/Desktop/INSU/PIS/Java_my/Java_my/Chap19/Ex04/exception-ms949.txt");
		
//		1-1. 각 예외에 맞춰 try 2개로 처리
		InputStream is1 = null;			//전역 변수로 선언.. ?? finally 블락에서 is1.close() 를 하기 위함 / 
										// try 안에서 선언하면 finally 에서 호출 불가함
		byte[] arr1 = new byte[80];
		
		try {
			is1 = new FileInputStream(ms949);	//FileInputStream() 은 FileNotFoundException 이 발생할 수 있어서 예외처리
		}catch (IOException e) {
			System.out.println("예외1");
		}
		
		int data1 = 0;
		try {
			while((data1 = is1.read(arr1)) != -1){
				String str = new String(arr1, 0, data1, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e1) {
			System.out.println("예외2");
		}finally {
			if(is1 != null) {
				try {
					is1.close();
				} catch (IOException e) {
				}
			}
		}System.out.println(); System.out.println();
		
//		1-2. 여러 예외를 try 1개로 처리
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
			System.out.println("예외예외");
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
			//한글처리 #1
		int data2 = 0;
		
		try (InputStream is2 = new FileInputStream(utf8)){
			//try(with resource : 객체 생성, RAM 을 사용) <- close() 가 자동으로 처리됨 .. AutoClosable 을 구현한 클래스이어야 함
			
			while((data2 = is2.read(arr2)) != -1) {		
				//한글처리 #2 : is.read(byte배열);
				String str2 = new String(arr2, 0, data2, Charset.forName("UTF-8"));
					//한글처리 #3 : new String(byte배열, offset, length, "encoding")
				System.out.print(str2);
			}
		}catch (IOException e) {
			System.out.println("예외3");
		}
		
		
	}

}
