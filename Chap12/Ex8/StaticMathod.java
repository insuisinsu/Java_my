package Chap12.Ex8;

//�������̽� ���ο� static Ű�� �� �޼ҵ�
// : ���� �ڽĿ��� ���� ���� �ٷ� ȣ��
/*
 �������̽� ���� ���� ���
 	1. �ʵ� 	: (public static final)
 	2. �޼ҵ�	: (public abstract)	(�߻�޼ҵ�)
 			: (public) default 	(�����ΰ� �ִ� �޼ҵ�)
 			: (public) static 	(�����ΰ� �ְ�, ��ü ���� ���� ȣ��)
 
 
 */
interface A{
	static void abc() {
		System.out.println("A �������̽��� ���� �޼ҵ� abc()");
	}
}

public class StaticMathod {

	public static void main(String[] args) {

		//1. ����(static) �޼ҵ� ȣ��
		A.abc(); 	// interface �̸����� �ٷ� ȣ�� ����
		
	}

}
