package Chap12.Ex1;

//�߻� �޼ҵ带 ����ϴ� 2��° ���
// --> �ڽ� ��ü �������� �͸� Ŭ������ Ȱ���ϴ� ���
	// 1���� �ӽ÷� ����� �� ��� = �̺�Ʈ ó���� �� ��
	//���� : �ڽ� Ŭ���� ������ ���� �ʴ´�.
	//���� : ���� ���� ��ü�� �����ؾ� �� ��� �ڵ尡 ����� �� ����

abstract class AAA{
	abstract void abc();
}


public class AbstractClass_2 {

	public static void main(String[] args) {

		AAA aaa = new AAA() {
			void abc() {
				System.out.println("���2 : ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ����");
			}
		};
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("���2 :");
			}
		};
		
		
		
		
		aaa.abc();
		aaa2.abc();
		
		
	}

}
