package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {

//		FileOutputStream 을 사용해서 한글처리
//		1. 저장할 파일 생성
		File outFile = new File("Chap19/Ex05/FileOutputStream2.txt");
		//기본적으로 이클립스의 default charactorSet으로 저장된
		
//		2. n-byte 단위로 쓰기 처리 - byte[] 의 처음부터 끝까지 쓰기
		OutputStream os2 = new FileOutputStream(outFile);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("MS949"));
			//총 10byte ?-> 한글은 한자에 2byte 씩 처리됨
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
//		3. n-byte 쓰기 - byte[] 의 offset 부터 length 개의 byte 데이터 쓰기
		OutputStream os3 = new FileOutputStream(outFile, true);		//true - 이어서 쓰기
		byte[] byteArray2 = "반갑습니다...".getBytes(Charset.forName("MS949"));
//		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset()); // 기본 charset 으로 가져오기
		os3.write(byteArray2, 6, 6); 	// 2byte 띄고 2byte 만 쓰기
										//write 일때는 offset 만큼(7byte) 앞을 생략하고 나머지 중에 8byte 읽어서 저장
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
