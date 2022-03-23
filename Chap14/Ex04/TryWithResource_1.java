package Chap14.Ex04;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		/*
		1. ���� ���ҽ� ����. (���� ���α׷��� ���)
			- �ڵ尡 ��� �������� */
			
		System.out.println("���ڸ� �Է��ϼ���");
		InputStreamReader isr2 = null;		//����� �ݵ�� �޸𸮿��� ��ü�� ����, isr2.close() ȣ��
		//System.in : �ֿܼ��� �Է��� �޵��� ó�� - �� ���� ��ǲ�� ���� �� ����
		// ��ü�� ����Ǹ� �� �� ��ǲ�� ���� ����.. ( �� �� ������ ��ü�� ����ȴٴ� ���ε�)
		
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();    //�Ϲݿ��� - ������ �ܰ迡��,,
											   //IOException : �Է� ��� ���� 
			System.out.println("�Է±��� :"+input);
		}catch(IOException e) {
			e.printStackTrace();   				//try{} ���� ���ܰ� �߻��� ��� �ڼ��� ���� ��� 
		}finally {								//��ü�� ����ϰ� �� �� �޸� �������� ����
												//���ҽ� ���� : isr2.close()
			if(isr2 != null) {
				try {
					isr2.close();				//IOException �߻�,, try/catch �� ����ߵ�
				} catch (IOException e) {

					e.printStackTrace();
				} 	
			}
		}
		
		
		
		/*
		2. �ڵ� ���ҽ� ����. (Java 1.7 ����)
			- �ڵ尡 ���������� �ʿ� ���� ����
			����1) ����ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü���� ��.
			����2) ��ü�� close() �� �ݵ�� �����ؾ� ��.		
			���� 1, ���� 2 �� ������ �� �ڵ�  ���ҽ� ����
			try(�ڵ����� ���ҽ��� ������ ��ü ����){} catch{} finally{}
		 */
		
		//InputStreamReader �� Autocloseable �������̽��� �����ϰ� ����
		//close() ���� ������ ����
		//Try with Resource : try (with resource = ��ü�� �޸𸮿� �ε�?) {}
		try(InputStreamReader isr1 = new InputStreamReader(System.in); ){
			char input = (char) isr1.read();
			System.out.println("�Է±��� : "+input);
		}catch(IOException e){
			e.printStackTrace();
		}
		//finally ����� �����ϴ��� ��ü�� �ڵ����� close()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
