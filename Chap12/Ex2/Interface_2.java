package Chap12.Ex2;

//interface ������ Ŭ����
//Overriding : ������ �޼ҵ带 ���� �����ϴ� ��
//Implements : �̿ϼ� �޼ҵ带 �ϼ���Ű�� ��
//extends	 : �θ� Ŭ������ ����� ��� �޾Ƽ� Ȯ���ϴ� ��

interface AA{
	void cry();			//�߻� �޼ҵ�, public abstract �����Ǿ� ����
	void run();			//+ ������ ����
}

//BB Ŭ������ AA �������̽��� �̿ϼ��� �޼ҵ带 ����

class BB implements AA {

	@Override
	public void cry() {
		System.out.println("�߿�");
	}

	@Override
	public void run() {
		System.out.println("��½");
	}
	
}
		
		
public class Interface_2 {

	public static void main(String[] args) {

		AA aa = new BB();
		aa.cry();
		aa.run();
		
	}

}
