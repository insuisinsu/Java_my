package Chap19.Ex04;

public class Ascii_Code_Print {

	public static void main(String[] args) {

		
//	 	Ascii 33 번 부터 126 까지 출력
//		0~32 는 출력할 수 없는 코드임
		
		System.out.println("======================================");
		System.out.println("ASCII	문자		ASCII	문자");
		System.out.println("======================================");
		

		for (int i = 33; i <= 140; i+=2) {
			System.out.println(i+"	"+(char)i+"		"+(i+1)+"	"+(char)(i+1));
		}
		
		
	}

}
