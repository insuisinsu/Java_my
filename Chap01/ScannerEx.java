package Chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력해주세요.");
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성 (보통 sc 로 많이 씀)
		
		String name = scanner.next(); // 문자열을 인풋받도록 함
		System.out.println("이름은 "+ name + ",");
		
		String city = scanner.next();
		System.out.println("도시는 " + city +", ");
		
		int age = scanner.nextInt(); // Int 정수값을 인풋받아서 읽어들임
		System.out.println("나이는 " + age +",");
		
		double weight = scanner.nextDouble();  // Double 실수값
		System.out.println("체중은 " + weight + ",");
		
		boolean single = scanner.nextBoolean();  // (Boolean 논리값 (True or False)
		System.out.println("독신 여부는 "+ single + "입니다.");
		scanner.close();
	}

}
