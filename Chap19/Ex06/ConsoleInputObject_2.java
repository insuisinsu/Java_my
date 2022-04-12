package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;		//Console 을 통해서 인풋을 받음
		
//		1. 1byte 단위로 읽기
		int data;
		while( (data = is.read()) != '\r') {	//is.read() 가 호출될 때 콘솔에서 인풋을 대기
			System.out.print((char)data);
		}
		is.read();	//10 <- \n
		//버퍼에 \n 이 남아있어서 꺼내줘야함. 버퍼에서 \n 을 지우지 않으면 다음 read() 에 \n 이 들어감
		System.out.println();
		System.out.println("====================================");
		System.out.println();
		
//		2. n-byte 단위로 읽기 ( byte[] 의 처음 위치에서 읽은 데이터를 저장)
		
		
		byte[] byteArray1 = new byte[100];	//콘솔에서 배열에 저장될 때 \r\n 까지 저장됨
		int count1 = is.read(byteArray1);	//count1 은 100, 100, 100, 30, -1  이런식으로 값이 들어가짐
											//방크기(100) 만큼씩 읽다가 나머지(30) 읽고, 값이 없으면 -1 이 됨
		//count1 은 배열에서 읽은 값의 갯수를 저장		
		
		
		for(int i =0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		System.out.println("==");
		int count2;
		count2=is.read(byteArray1); 
		System.out.println(new String(byteArray1));
		
		
		System.out.println("===========");
		
//		3. n-byte 단위로 읽고 ( length 만큼 읽어와서 byte[] offset 위치에서 저장
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArray2, offset, length);
		
		for(int i =0; i < offset+length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
	
		is.close();		//제일 마지막에 처리해줘야 함.   중간에 close() 하면 다시 호출 불가능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
