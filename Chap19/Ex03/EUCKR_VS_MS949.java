package Chap19.Ex03;

import java.io.UnsupportedEncodingException;

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {

/*
 		EUCKR  	. �ѱ� ǥ��, �ѱ� ǥ������
 				. �ѱ� �� 11,000 �� �� 2200 �ڸ� ǥ�� ����
 				. ���� - 1byte, �ѱ� - 2byte
 				. �� ���������� ����� ��(������ UTF-8�� ���� ��)
 				
 		MS949	. MS�翡�� ������ �ѱ� ǥ�� ���
 				. �� 11,000 �� ��� ǥ�� ����
 				. ���� - 1byte, �ѱ� - 2byte
 				. Windows OS �� �⺻ ����
 				. (ANSI)
 				
 		UTF-8	. <���� ����>
 				. ��� ����(Web, FTP, Mail, DB ... ��), git, Mac �� �⺻����
 		 		. ���� - 1byte, �ѱ� - 3byte
 		 
 		UTF-16 	. <���� ����>
 				. ����, �ѱ� - 2byte
 				. BOM 2byte
 				
 		���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� ������ ����
 		
 		< ��Ŭ�������� ���ڵ� Ÿ�� ���� 3���� >
 		
 		1. ���� ����			:
 		2. ������Ʈ���� ����	:
 		3. ���Ͽ��� ����		:
 		
 		. �켱���� : ���� > ������Ʈ > ����
 		
 		
 
 */
		
		//EUCK vs. MS949
		
//		1. �����ڸ� byte �� �������� String ���� ��ȯ
		byte[] b1 = "a".getBytes("EUC_KR");		
		byte[] b2 = "a".getBytes("MS949");		
		//���ڸ� byte�� ��ȯ, -> ��Ʈ��ũ�� ����, �׸�, ������ �� �� byte ��Ʈ������ ��ȯ�ؼ� ����
		//getBytes() �� ���� �߻��� / UnsupportedEncodingException
		//��Ÿ�� ���Ͽ� ���ڵ��� �� ���� ���� ����
		
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "EUC-KR")); 	//byte[]  ��  ���ڿ��� �ٲ�
		System.out.println(new String(b2, "MS949"));
		
//		2. �ѱ��� byte �� �������� String ���� ��������
		byte[] b3 = "��".getBytes("EUC_KR");
		byte[] b4 = "��".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));
		
//		3. EUC-KR ���� ��� ������ �͸� ǥ��, �� 2000��
//		   MS949 ��� ǥ�� ����, �� 11,000 �� 
		byte[] b5 = "�v".getBytes("EUC_KR");
		byte[] b6 = "�v".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
