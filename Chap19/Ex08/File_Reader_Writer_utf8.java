package Chap19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_utf8 {

	public static void main(String[] args) {

		//1. ?��?��객체 ?��?�� 
				File  rwFile = new File ("src\\Chap19\\EX08\\rwFile_utf8.txt");
				
				try ( Writer writer = new FileWriter(rwFile); ) {    //Writer : 추상 ?��?��?��, FileWriter : Writer�? 구현?�� ?��?�� ?��?��?�� 
					//OutputStream 	: byte ?��?�� 출력 , 추상?��?��?�� , FileOutputStream  ,  문자, ?��?��?��, MP3, JPG, AVG .... 모든 처리 
					//Writer 		: char ?��?�� 출력 , 추상?��?��?�� , FileWriter , 문자 ?��?��?��?�� 처리 
					
					writer.write("?��?��?��?��?��\n".toCharArray());   //String ===> Char배열?�� ???��. 
					writer.write("Hello \n");  	// String 
					writer.write('A');
					writer.write('\r');
					writer.write('\n');
					writer.write("반갑?��?��?��", 2, 3);
					writer.flush(); 
						
				} catch (IOException e) { } 
				
				// 2. FileReader�? ?��?��?�� ?��?�� ?���? (Default UTF-8 )    <=== Charactorset �??�� ?��?��?�� ?��?��. 
				
				try ( Reader reader = new FileReader(rwFile); ){
					
					int data ; 
					while ( (data = reader.read()) != -1 ) {
						System.out.print((char) data);
					}
						
				} catch (Exception e) {} 	
				
				
		
	}

}
