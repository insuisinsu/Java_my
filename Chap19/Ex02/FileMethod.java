package Chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {

		//1. C:\ 에 작업 폴더 생성(temp)
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {tempDir.mkdir();}
		
		//2. 파일 객체 생성 ( C:\Windows )
		File file = new File("C:/Windows");
		
		//3. 파일 객체의 여러 메소드 사용
		System.out.println("절대경로 출력 : " + file.getAbsolutePath());
		System.out.println("폴더의 존재 유무 : " + file.isDirectory());
		System.out.println("파일의 존재 유무 : "+ file.isFile());
		System.out.println("파일 또는 폴더 이름 출력 : "+ file.getName());
		System.out.println("부모 폴더의 이름 출력 : "+ file.getParent());
		System.out.println();
		
		File newFile1 = new File ("C:/temp/abc");
		System.out.println(newFile1.mkdir()); 	//출력구문에 mkdir을 넣으면, 폴더가 존재하는 경우 true
			//여러 이유로 인해서 false : 생성을 못했다 ( 해당폴더가 존재하는 경우 , 권한 문제로 만들 수 없는 경우, 하위폴더 여러개 생성 불가)
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/abc/bcd/cde");	//하위 폴더를 한 번에 생성하기
		System.out.println(newFile2.mkdir()); 				//false .. 하위 폴더까지 한번에 생성 불가
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdir());
		
		//4. File 객체를 사용해서 하위 폴더의 정보 추출
		File[] fname = file.listFiles();
		
		for(File k : fname) {
			System.out.println((k.isDirectory() ? "폴더 : " : "파일 : ")+k.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
