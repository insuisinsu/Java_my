package Chap19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_utf8 {

	public static void main(String[] args) {

		//1. ?ŒŒ?¼ê°ì²´ ?ƒ?„± 
				File  rwFile = new File ("src\\Chap19\\EX08\\rwFile_utf8.txt");
				
				try ( Writer writer = new FileWriter(rwFile); ) {    //Writer : ì¶”ìƒ ?´?˜?Š¤, FileWriter : Writerë¥? êµ¬í˜„?•œ ??‹ ?´?˜?Š¤ 
					//OutputStream 	: byte ?‹¨?œ„ ì¶œë ¥ , ì¶”ìƒ?´?˜?Š¤ , FileOutputStream  ,  ë¬¸ì, ?°?´?„°, MP3, JPG, AVG .... ëª¨ë“  ì²˜ë¦¬ 
					//Writer 		: char ?‹¨?œ„ ì¶œë ¥ , ì¶”ìƒ?´?˜?Š¤ , FileWriter , ë¬¸ì ?Š¹?™”?•´?„œ ì²˜ë¦¬ 
					
					writer.write("?•ˆ?…•?•˜?„¸?š”\n".toCharArray());   //String ===> Charë°°ì—´?— ???¥. 
					writer.write("Hello \n");  	// String 
					writer.write('A');
					writer.write('\r');
					writer.write('\n');
					writer.write("ë°˜ê°‘?Šµ?‹ˆ?‹¤", 2, 3);
					writer.flush(); 
						
				} catch (IOException e) { } 
				
				// 2. FileReaderë¥? ?´?š©?•œ ?ŒŒ?¼ ?½ê¸? (Default UTF-8 )    <=== Charactorset ì§?? • ?˜µ?…˜?´ ?—†?‹¤. 
				
				try ( Reader reader = new FileReader(rwFile); ){
					
					int data ; 
					while ( (data = reader.read()) != -1 ) {
						System.out.print((char) data);
					}
						
				} catch (Exception e) {} 	
				
				
		
	}

}
