package Chap19.Ex04;

public class Ascii_Code_Print {

	public static void main(String[] args) {

		
//	 	Ascii 33 �� ���� 126 ���� ���
//		0~32 �� ����� �� ���� �ڵ���
		
		System.out.println("======================================");
		System.out.println("ASCII	����		ASCII	����");
		System.out.println("======================================");
		

		for (int i = 33; i <= 140; i+=2) {
			System.out.println(i+"	"+(char)i+"		"+(i+1)+"	"+(char)(i+1));
		}
		
		
	}

}
