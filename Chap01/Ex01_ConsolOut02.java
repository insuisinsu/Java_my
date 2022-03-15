package Chap01;

public class Ex01_ConsolOut02 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 30);
		// 출력포맷, 인자, 인자   %d 는 뒤에 있는 인자를 불러옴
		// %d 는 정수값을 인자로 받을 때 사용 (10진수)
		// 위에서는 %d 가 뒤에있는 30을 받아서  30/n 으로 출력됨
		System.out.printf("나의 나이는 %d 입니다\n", 30);
		
		System.out.printf("%o\n", 10); //%o 는 8진수를 인자값으로 받을 때
		System.out.printf("%x\n", 10); //%x 는 16진수를 인자값으로 받을 때
		System.out.printf("%s\n", "출력"); //%s 는 문자열을 인자값으로 받을 때
		System.out.printf("%f\n", 5.983); //%f 는 실수값을 인자값으로 받을 때
		System.out.printf("%4.2f\n", 5.8); //%4.2f 는 전체 4자리, 소숫점 이하 2자리를 인자값으로 받을 때
						// $n.mf 는 전체 n 자리, 소숫점 이하 m 자리를 인자값으로 받을 때
		System.out.printf("%d 와 %4.2f", 10, 5.8); //%4.2f 는 전체 4자리, 소숫점 이하 2자리를 인자값으로 받을 때
		
	}

}
