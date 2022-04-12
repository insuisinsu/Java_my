package Chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
	InputStream			: 추상클래스
	OutputStream		: 추상클래스
	-> 이 것을 구현한 클래스가 FileInputStream, FileOutputStream
	
	FileInputStream		: byte() 단위 데이터 읽기
	FileOutputStream	: byte() 단위 데이터 쓰기
	
	콘솔, 메모장에서 Enter 를 넣으면 Windows는   \r\n 이 입력됨 .. 단, \r 은 생략 가능
								MAC 에서는  \n
	
 */

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
//		1. 입력파일 생성 ( 아직 존재하지 않음 )
		File outFile = new File("Chap19/Ex05/FileOutputStream1.txt");
		System.out.println(outFile.isFile());
//		2. 1byte 씩 읽기
		OutputStream os1 = new FileOutputStream(outFile);
//		FileOutStream에 존재하지 않는 파일을 넣으면 실행시 생성됨

//		write() 는 버퍼에(메모리, RAM)에 쓰기  = 파일에 직접 입력된 것이 아니다
//			버퍼가 가득 차면, 파일에 쓰기가 됨
		os1.write('J');										//write : IOException 발생
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');		// 13(byte) : 엔터	// 생략가능
		os1.write('\n');		// 10(byte)	: 엔터
		
//		단, flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기
		os1.flush();

//		close() 를 호출하면 flush() 가 자동으로 호출되기 때문에
//		flush() 는 생략 가능하지만, 사용할 것을 권장함		
		os1.close();
		
//		2. n-byte 단위 쓰기 ( byte[] 의 offset 부터 length 개의 byte 데이터 쓰기)?? 얘는 뭐임 그럼
		
		OutputStream os2 = new FileOutputStream(outFile);	//덮어쓰기
//							FileOutputStream(파일객체, 이어쓰기(boolean append)(false 가 기본 - 덮어쓰기, true - 이어쓰기)
		
		byte[] byteArray1 = "Hello!".getBytes(); 	// String --> byte 로 변환 : getByte();
		
		os2.write(byteArray1);
		os2.write('\n'); 		// \r은 생략 가능, \n 만 넣어도 Windows 에서 엔터 처리됨
		
		os2.flush();
		os2.close();
		
//		3. n-byte 단위 쓰기 (byte[] 의 offset 부터 length 개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8); 	//write 일때는 offset 만큼(7byte) 앞을 생략하고 나머지 중에 8byte 읽어서 저장
										//read 일때는 반대로 offset 만큼 앞을 비우고 출력
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
	}

}
