package Chap19.Ex01;

import java.io.File;	// ���ϰ� ������ �ٷ�� ��ü
import java.io.IOException;

public class CreatFileObject {

	public static void main(String[] args) throws IOException {

/* 		���� : ��Ŭ�������� ���� ������ C:\ �� �����ϸ� ���� ������ ���� ������ �߻��� �� ����
 			. ��Ŭ������ ������ �������� ����
 			. ���� ���ο� ���� ����
		
		File ��ü ���� ���� �ĺ��ڸ� ������ ���
		C:\abc\abc.txt �� ���
		1. Windows	: String path = "C:\\abc\\abc.txt"		"" �ȿ� Ư�����ڸ� ó���ϱ� ���� ��ȣ = \
	  -> Windows 10 : String path = "C:/abc/abc.txt"
		2. Mac		: String path = "C:/abc/abc.txt"  
		
		ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ�
		String path = "C:"+File.separator + "abc" + File.separator + "abc.txt"
		
		
*/		
		
//		1. File ��ü�� ����ؼ� ���� ����
//		�ش� �����̳� ������ �������� �ʴ� ���
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {				//�ش� ��ο� �����̳� ������ �����ϸ� true
			tempDir.mkdir();				//���� ���� ��ɾ�		
		}
		System.out.println(tempDir.exists());
		
//		2. File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newfile.txt");	//C:\ �� ������ ������ ��� ���ѹ����� ���ϻ��� ���ܰ��߻��� �� ����
													//��Ŭ������ ������ �������� �����ؾ� ��
		if(!newFile.exists()) {
				newFile.createNewFile();	//���� ������ ����ó�� �ʿ���		/���� ���� ������ ���� �Ұ��� ����
		}
		System.out.println(newFile.exists());
		System.out.println();
		
//		3. ���� ������
		
		File newFile2 = new File("C:\\temp001\\newfile01.txt");	//Window10 �̸�
		File newFile3 = new File("C:/temp001/newfile02.txt");	//Window10 or Mac
		if(!newFile2.exists()) { newFile2.createNewFile();}
		if(!newFile3.exists()) { newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
//		��� OS ���� �������� �ĺ� ������ �ڵ�
		File newFile4 = new File("C:"+File.separator+"temp001"+File.separator+"newfile03.txt");
		if(!newFile4.exists()) { newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
//		4. ���� ��η� ó�� : ���������� ����� �Ź� ��θ� �ٽ� ������ ��
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath());		//File ��ü�� ����� ������ �����θ� ���
		
//		5. ��� ��η� ó�� <- ����
//		1) ���� ���� �۾������� ��ġ�� �˾ƾ���
		System.out.println(System.getProperty("user.dir"));	//���� �۾� ������ ��ġ
		File newFile6 = new File("newFile06.txt");
		if(!newFile6.exists()) { newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
	}

}
