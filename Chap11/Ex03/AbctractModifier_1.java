package Chap11.Ex03;

/*
 	abstrack(�߻�)�޼ҵ� : ���࿵���� ���� �޼ҵ�
 		�޼ҵ��� �⺻ ���� : void print () {}
 		�߻� �޼ҵ��� ���� : abstract void print ();
 		�߻� Ŭ������ ���� : abstract class A { �߻� �޼ҵ� �ϳ� �̻� ����}
 			-> �߻�Ŭ������ ��üȭ �� �� ����. ��, Ÿ�����δ� ���� �� �� �ִ�.
 				// ���� : �޼ҵ带 �������ش� (ȸ���� ��ɱ��� �޼ҵ� ����)
 				// ���� : �������� �߻�޼ҵ带 �������̵� �ؼ� ������ �ۼ�
 				// -> ���� Ŭ�������� �޼ҵ� �������̵� �� ������ �����ϱ� ���� ���
 			//�ڽ� Ŭ�������� �޼ҵ带 �������ؼ� �����θ� �ۼ�
 */

abstract class AF{
	abstract void print();			//�߻�Ŭ����
	abstract void cry();
}
class BF extends AF{
	@Override
	void print() {
		System.out.println("��ũ��Ʈ Ŭ���� : �߻� Ŭ������ �߻� �޽����� ��� ������ Ŭ����");
	}
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
//class CF extends AF{ // �θ��� �߻� �޼ҵ� �� �Ϻθ� ������ ��� -> �߻� Ŭ����
//	@Override
//	void print() {
//	}
//}
//
//class DF extends CF{	// ��ũ��Ʈ Ŭ���� : �θ��� ��� �߻�޼ҵ带 ���������� ������ Ŭ����
//	
//}
public class AbctractModifier_1 {

	public static void main(String[] args) {

	}

}
