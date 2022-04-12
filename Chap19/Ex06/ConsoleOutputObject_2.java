package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {

//		한글을 콘솔에 출력
//		1-byte로 출력시 한글 출력 불가.. 한글은 2byte 부터이기 때문에
		
		OutputStream os = System.out;
		
//		2. n-byte 출력 (byte[] 배열에 처음부터 끝까지 데이터 쓰기
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.defaultCharset());
		
		os.write(byteArray1);
		os.write('\n');			//여기까지는 아직 버퍼에만 쓰여짐
		
		os.flush();				//버퍼에 있는 내용을 콘솔에 출력
		
		
//		3. n-byte 출력 ( byte[] 의 offset 부터 length 개의 byte 데이터 쓰기 )
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2, 6, 4);		//offset 만큼 생략하고 나머지를 length 만큼 출력
		
		os.flush();
		os.close();
		
		
		
		
		
	}

}
