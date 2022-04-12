package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;		//System.out : 콘솔에 출력,, byte 단위로 출력
		
//		1. 1-byte 출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');		//버퍼에서만 저장되어 있음
		os.write('\n');
		
		os.flush(); 		//버퍼의 내용을 console 에 출력
		
//		2. n-byte 출력		//byte 를 콘솔에 출력
		byte[] byteArra1 = "Hello!".getBytes();		// String 을 byte 로 변환
		os.write(byteArra1);
		os.write('\n');			// \r\n
		
		os.flush();
		
//		3. n-byte 출력
		byte[] byteArray2 = "Better the last smile than first laughter".getBytes();
		os.write(byteArray2, 7, 8);
		//write(byte배열, offset, length) offset 만큼 생략하고, length 만큼 출력함
		os.flush();
		
		
		os.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
