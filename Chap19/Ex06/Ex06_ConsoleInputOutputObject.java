package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/*
 	콘솔에서 (배열 100byte 이하로) 한글 인풋 받은 값을 Ex06의 input.txt 에 저장 ,, Charset 은 default 로 설정
 	input.txt 파일의 값을 읽어서 콘솔에 출력
 
 
 */



public class Ex06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {

		File file = new File("Chap19/Ex06/input.txt");
		
		InputStream is = System.in;
		
		System.out.println("한글을 입력하세요. >>");
		
		byte[] byteArray = new byte[100];
		int count = is.read(byteArray);
		
		OutputStream os = new FileOutputStream(file);
		os.write(byteArray);
		os.flush();
		
		
		InputStream is2 = new FileInputStream(file);
		byte[] byteArray2 = new byte[100];
		
		
		int count2;
		while( (count2 = is2.read(byteArray2)) != -1) {	
			System.out.println(new String(byteArray2));
		}
		is2.close();
		
		OutputStream os2 = System.out;
		String str = new String(byteArray2);
		str.getBytes();
		os2.write(byteArray2);
		os2.flush();
		os2.close();
		
		
		
		
		
		
	}

}
