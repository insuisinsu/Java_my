package Chap19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_utf8 {

	public static void main(String[] args) {

		//1. ??Όκ°μ²΄ ??± 
				File  rwFile = new File ("src\\Chap19\\EX08\\rwFile_utf8.txt");
				
				try ( Writer writer = new FileWriter(rwFile); ) {    //Writer : μΆμ ?΄??€, FileWriter : Writerλ₯? κ΅¬ν? ?? ?΄??€ 
					//OutputStream 	: byte ?¨? μΆλ ₯ , μΆμ?΄??€ , FileOutputStream  ,  λ¬Έμ, ?°?΄?°, MP3, JPG, AVG .... λͺ¨λ  μ²λ¦¬ 
					//Writer 		: char ?¨? μΆλ ₯ , μΆμ?΄??€ , FileWriter , λ¬Έμ ?Ή??΄? μ²λ¦¬ 
					
					writer.write("????Έ?\n".toCharArray());   //String ===> Charλ°°μ΄? ???₯. 
					writer.write("Hello \n");  	// String 
					writer.write('A');
					writer.write('\r');
					writer.write('\n');
					writer.write("λ°κ°?΅??€", 2, 3);
					writer.flush(); 
						
				} catch (IOException e) { } 
				
				// 2. FileReaderλ₯? ?΄?©? ??Ό ?½κΈ? (Default UTF-8 )    <=== Charactorset μ§??  ?΅??΄ ??€. 
				
				try ( Reader reader = new FileReader(rwFile); ){
					
					int data ; 
					while ( (data = reader.read()) != -1 ) {
						System.out.print((char) data);
					}
						
				} catch (Exception e) {} 	
				
				
		
	}

}
