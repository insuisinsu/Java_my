package Chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ���� (���� sc �� ���� ��)
		
		String name = scanner.next(); // ���ڿ��� ��ǲ�޵��� ��
		System.out.println("�̸��� "+ name + ",");
		
		String city = scanner.next();
		System.out.println("���ô� " + city +", ");
		
		int age = scanner.nextInt(); // Int �������� ��ǲ�޾Ƽ� �о����
		System.out.println("���̴� " + age +",");
		
		double weight = scanner.nextDouble();  // Double �Ǽ���
		System.out.println("ü���� " + weight + ",");
		
		boolean single = scanner.nextBoolean();  // (Boolean ���� (True or False)
		System.out.println("���� ���δ� "+ single + "�Դϴ�.");
		scanner.close();
	}

}
