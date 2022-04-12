package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in	 : Console 에서 input 을 받는 자바에서 제공해주는 객체, InputStream
 		Windows : 콘솔에서 Enter = \r\n
 		MAC		: 콘설에서 Enter = \r
 	System.out	 : Console 로 출력하는 객체, OutputStream
 */

public class ConsoleInputObject_1_1 {

	public static void main(String[] args) throws IOException {

		//1. Console 에서 인풋받기 위한 객체 생성
		InputStream is1 = System.in;		//new 없이 생성함 // is1 은 콘솔에서 인풋 받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>");
		
		int data;
		
		while((data = is1.read()) != '\n') {	//1byte 씩 읽어서 int data 에 할당 
			System.out.print((char)data);
		}
		System.out.println(data);			//10 <- \n
		System.out.println(is1.read());		//더 이상 read 가 없음
		
		
		
	}

}
