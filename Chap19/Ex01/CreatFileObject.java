package Chap19.Ex01;

import java.io.File;	// 파일과 폴더를 다루는 객체
import java.io.IOException;

public class CreatFileObject {

	public static void main(String[] args) throws IOException {

/* 		주의 : 이클립스에서 파일 생성시 C:\ 에 생성하면 권한 문제로 인한 오류가 발생할 수 있음
 			. 이클립스를 관리자 권한으로 실행
 			. 폴더 내부에 파일 생성
		
		File 객체 내의 폴더 식별자를 적용할 경우
		C:\abc\abc.txt 인 경우
		1. Windows	: String path = "C:\\abc\\abc.txt"		"" 안에 특수문자를 처리하기 위한 기호 = \
	  -> Windows 10 : String path = "C:/abc/abc.txt"
		2. Mac		: String path = "C:/abc/abc.txt"  
		
		호환을 위해서 공통적으로 사용할 수 있는 코드
		String path = "C:"+File.separator + "abc" + File.separator + "abc.txt"
		
		
*/		
		
//		1. File 객체를 사용해서 폴더 생성
//		해당 파일이나 폴더가 존재하지 않는 경우
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {				//해당 경로에 파일이나 폴더가 존재하면 true
			tempDir.mkdir();				//폴더 생성 명령어		
		}
		System.out.println(tempDir.exists());
		
//		2. File 객체를 사용해서 파일 생성
		File newFile = new File("C:/temp001/newfile.txt");	//C:\ 에 파일을 생성할 경우 권한문제로 파일생성 예외가발생할 수 있음
													//이클립스를 관리자 권한으로 실행해야 함
		if(!newFile.exists()) {
				newFile.createNewFile();	//파일 생성시 예외처리 필요함		/권한 문제 등으로 생성 불가할 수도
		}
		System.out.println(newFile.exists());
		System.out.println();
		
//		3. 파일 구분자
		
		File newFile2 = new File("C:\\temp001\\newfile01.txt");	//Window10 미만
		File newFile3 = new File("C:/temp001/newfile02.txt");	//Window10 or Mac
		if(!newFile2.exists()) { newFile2.createNewFile();}
		if(!newFile3.exists()) { newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
//		모든 OS 에서 공통으로 식별 가능한 코드
		File newFile4 = new File("C:"+File.separator+"temp001"+File.separator+"newfile03.txt");
		if(!newFile4.exists()) { newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
//		4. 절대 경로로 처리 : 수정사항이 생기면 매번 경로를 다시 잡아줘야 됨
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath());		//File 객체에 저장된 파일의 절대경로를 출력
		
//		5. 상대 경로로 처리 <- 권장
//		1) 현재 나의 작업폴더의 위치를 알아야함
		System.out.println(System.getProperty("user.dir"));	//현재 작업 폴더의 위치
		File newFile6 = new File("newFile06.txt");
		if(!newFile6.exists()) { newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
	}

}
