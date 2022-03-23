package Chap14.Ex05;

import javax.naming.spi.DirStateFactory.Result;

/*
 	���� ������ ��ü���� AutoCloseable �� ����غ���
 	try(with Resource)
 	try(��ü ���� ����){} catch{} : �ڵ����� close() ��
 	
 	1. AutoCloseable �������̽��� close() �� �������̵� �ؾ���.
 	
 		java.lang.AutoCloseable : java.lang �� import ���� ������� �ʾƵ� ��
 		java.lang.Object
 	 
 	. ���ܸ� ó���ϴ� ���
 	1. try catch �� ����ؼ� ���� ó��
 		- �ڽ��� ���� ���� ó��
 	2. throws �� ���ؼ� ���� ó��
 		- ���ܸ� ���� �ƴ� ȣ���ϴ� ������ ó���ϵ��� ���ܸ� ó�� �ϵ��� �̷��.
 		- ���� ���� .. �޼ҵ忡�� ���� ó��
 		throw : ���ܸ� ������ �߻���Ŵ
 	
 */
 
class A implements AutoCloseable{
	
	String resource;				//resource == null
	
	A (String resource){			// �������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {	//close() �� �ڵ����� ȣ��ȴ�.
		if(resource != null) {
			resource = null;
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
			System.out.println(resource);
		}
	}
}



public class TrywithResource_2 {

	public static void main(String[] args) {

		// 1. �ڵ� ���ҽ� ����
		try (A a1 = new A("Ư������");){
			
		}catch(Exception e){
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}	//finally ����� a1.close() �� �ڵ����� ȣ��
		
		System.out.println("====================");
		
		//2. �������� ���ҽ� ����
		A a2 = null;
				
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		}catch(Exception e){
			
		}finally {
			if(a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
				}
				
			}
		}
		
		
		
		
		
		
		
	}

}
