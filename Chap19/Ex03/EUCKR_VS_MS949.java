package Chap19.Ex03;

import java.io.UnsupportedEncodingException;

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {

/*
 		EUCKR  	. 한국 표준, 한글 표현가능
 				. 한글 약 11,000 자 중 2200 자만 표기 가능
 				. 영문 - 1byte, 한글 - 2byte
 				. 웹 페이지에서 출력할 때(요즘은 UTF-8을 많이 씀)
 				
 		MS949	. MS사에서 개발한 한글 표기 방식
 				. 약 11,000 자 모두 표기 가능
 				. 영문 - 1byte, 한글 - 2byte
 				. Windows OS 의 기본 설정
 				. (ANSI)
 				
 		UTF-8	. <가변 길이>
 				. 모든 서버(Web, FTP, Mail, DB ... 등), git, Mac 의 기본설정
 		 		. 영문 - 1byte, 한글 - 3byte
 		 
 		UTF-16 	. <고정 길이>
 				. 영문, 한글 - 2byte
 				. BOM 2byte
 				
 		문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우, 해당 인코딩 타입으로 조합을 해야 깨지지 않음
 		
 		< 이클립스에서 인코딩 타입 설정 3가지 >
 		
 		1. 전역 설정			:
 		2. 프로젝트에서 설정	:
 		3. 파일에서 설정		:
 		
 		. 우선순위 : 파일 > 프로젝트 > 전역
 		
 		
 
 */
		
		//EUCK vs. MS949
		
//		1. 영문자를 byte 로 내보내고 String 으로 변환
		byte[] b1 = "a".getBytes("EUC_KR");		
		byte[] b2 = "a".getBytes("MS949");		
		//문자를 byte로 변환, -> 네트워크로 문자, 그림, 동영상 등 을 byte 스트림으로 변환해서 전송
		//getBytes() 는 예외 발생됨 / UnsupportedEncodingException
		//오타로 인하여 인코딩할 수 없는 예외 방지
		
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "EUC-KR")); 	//byte[]  를  문자열로 바꿈
		System.out.println(new String(b2, "MS949"));
		
//		2. 한글을 byte 로 내보내고 String 으로 가져오기
		byte[] b3 = "가".getBytes("EUC_KR");
		byte[] b4 = "가".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));
		
//		3. EUC-KR 현재 사용 가능한 것만 표기, 약 2000자
//		   MS949 모두 표기 가능, 약 11,000 자 
		byte[] b5 = "봵".getBytes("EUC_KR");
		byte[] b6 = "봵".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
