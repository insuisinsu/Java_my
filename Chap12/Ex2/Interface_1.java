package Chap12.Ex2;

//�������̽� : �ܺο� ���θ� ���� �����ִ� ����     		�ܼ�Ʈ ( �ܺ� ������ġ >> �ܼ�Ʈ << ����)
				//������ (���, TV) , API
//��ü ���� �Ұ�, Ÿ���� ���� ����
//��� �ʵ�� �ݵ�� : public static final �� �����Ǿ� ����
//��� �޼ҵ�� : public abstract �� �����Ǿ� ����		(�ڹ� 1.8 ����) // �� ���Ĵ� (default �޼ҵ� ����)

interface A{
	public static final int A = 3;
	public abstract void abc();
}

interface B{
	int A = 3;
	void abc();
}

abstract class C {			//�߻�Ŭ������ abstract �� ������ �� ����
	abstract void abc();		
}

public class Interface_1 {

	public static void main(String[] args) {
		
		//�������̽��� ��ü ���� �Ұ� : <- �������� ���� �޼ҵ尡 ���ԵǾ� �ֱ� ����
		// A a = new A(); �Ұ�
		
		//1. �������̽��� static �ʵ� ���� ���
		
		System.out.println(A.A);	//�������̽��� �ʵ� ���.. static Ű�� �־ �ٷ� ��� ����
		System.out.println(B.A);
		
		//2. final �� ����Ǿ� �ֱ� ������ ���� ������ �� ����
		
//		A.A = 5;
//		B.A = 5;
		
		
		
	}

}
