package Chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {

		//1. C:\ �� �۾� ���� ����(temp)
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {tempDir.mkdir();}
		
		//2. ���� ��ü ���� ( C:\Windows )
		File file = new File("C:/Windows");
		
		//3. ���� ��ü�� ���� �޼ҵ� ���
		System.out.println("������ ��� : " + file.getAbsolutePath());
		System.out.println("������ ���� ���� : " + file.isDirectory());
		System.out.println("������ ���� ���� : "+ file.isFile());
		System.out.println("���� �Ǵ� ���� �̸� ��� : "+ file.getName());
		System.out.println("�θ� ������ �̸� ��� : "+ file.getParent());
		System.out.println();
		
		File newFile1 = new File ("C:/temp/abc");
		System.out.println(newFile1.mkdir()); 	//��±����� mkdir�� ������, ������ �����ϴ� ��� true
			//���� ������ ���ؼ� false : ������ ���ߴ� ( �ش������� �����ϴ� ��� , ���� ������ ���� �� ���� ���, �������� ������ ���� �Ұ�)
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/abc/bcd/cde");	//���� ������ �� ���� �����ϱ�
		System.out.println(newFile2.mkdir()); 				//false .. ���� �������� �ѹ��� ���� �Ұ�
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdir());
		
		//4. File ��ü�� ����ؼ� ���� ������ ���� ����
		File[] fname = file.listFiles();
		
		for(File k : fname) {
			System.out.println((k.isDirectory() ? "���� : " : "���� : ")+k.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
