package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {

//		현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
//		1. 입력 파일 생성
		//절대경로 설정
		File inFile1 = new File("E:\\PIS\\JAVA\\src\\Chap19\\files\\FileInputStream1.txt");
		//상대경로 설정 : 현재 작업디렉토리를 기준으로 설정
		File inFile = new File("Chap19\\files\\FileInputStream1.txt");
		
//		2. InputStream 객체를 생성해야 파일의 내용을 읽어들일 수 있음
		InputStream is = new FileInputStream(inFile);
			//InputStream 은 추상클래스임. 즉, 직접 객체 생성 불가능 , 타입으로만 선언 가능
		
//		파일 내용 출력
		
		//UTF-8 : 영어 - 1, 한글 - 3
		//UTF-16 : 영어 - 2, 한글 - 2
		//MS949 : 영어 - 1, 한글 - 2
		//EUC-KR : 영어 - 1, 한글 - 2
		
//		JAVA 에서 줄 바꿈 처리
//		UNIX	: \n
//		Windows	: \r\n	.. \r 은 생략해도 됨. / 콘솔이나 메모장에서 enter 를 넣으면 \r\n
//		MAC		: \r
		
		
		System.out.println(is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.println();
		//스트림은 값을 읽으면 메모리에서 삭제됨.
		//새로 읽기 위해서는 새로운 스트림을 생성해야 함
		
		
		//int read() : 한 바이트를 읽어서 값이 존재할 경우 양수를 리턴, 읽은 데이터가 존재하지 않을 경우 -1 리턴
//		while 문을 사용해서 한 번에 출력
		InputStream is1 = new FileInputStream(inFile);
		int data;
		while((data = is1.read()) != -1) {
			System.out.print((char)data);
		}System.out.println(); System.out.println();
	
		
		// available() : 스트림의 남은 바이트 수를 출력
		InputStream is2 = new FileInputStream(inFile);
		while((data = is2.read()) != -1) {
			System.out.println("읽은 데이터 : "+(char)data+" 남은 바이트 수 : "+is2.available());
		}
		
		is.close();
		is1.close();
		is2.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
