package Chap14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
  	Checked Exception (�Ϲ� ����)
	: ������ �ܰ迡�� ���� �߻� ,, -> ������ �ϱ� ����(����(����)�ϱ� ����)
	==> ���� �ϱ� ���� ����ó�� �ʿ�
	
	unChecked Exception (���� ����) , Runtime Exception
	: ����ÿ� ���ܰ� �߻��� ���� ����
	==> �ʼ��� �ƴ����� ����ó�� �ʿ�, 
*/

class A{
	B b;		// b = null
	A (){}		//�⺻������
	A (B b){
		this.b = b;
	}
	
	interface B{
		void cry();
	}
	
	void abc() {
		System.out.println(b);
		b.cry();
	}
}
class CheckedException {

	public static void main(String[] args) {

		//1. Checked Exception
		// . ������ �ܰ迡�� ����ó�� �ʿ�
		
		//InterruptedException : ������ �߰��� �����Ⱑ �߻��ϸ� ���ܰ� �߻�
//		Thread.sleep(1000);
		
		
		//ClassNotFoundException : Ŭ������ ã�� ���ϴ� ����
//		Class cls = Class.forName("java.lang.Object");
		
		//IOException : ��Ʈ��ũ���� ����(����) �� �о� �� �� �ִ� ����
		//Syste.in : �ܼ��� ����.
		InputStreamReader in = new InputStreamReader(System.in);
//		in.read()
		
		//FileNotFouneException : ������ ã�� ���ϴ� ���ܰ� �߻��� �� ����
//		FileInputStream fis = new FileInputStream("text.txt");
		
		//2. unCheckedException(Runtime Exception)
		//	. ���� �ÿ� �߻��Ǵ� ����
		
		//NullPointExcption : ��ü�� null �� ���¿��� ��ü�� �ʵ峪 �޼��带 ȣ���ϴ� ���
		A a1 = new A();
//		a1.abc(); 		//������ �ܰ迡���� ������ �߻����� ������ ���� �ܰ迡�� ���� �߻�
		
	}

}
