package Chap12.Ex11;

abstract class D{
	//�߻� �޼ҵ� = �������� ���� �� �޼ҵ�
	//Ŭ���� ���ο� �߻� �޼ҵ尡 �� ��� abstract  Ű�� �־�� ��
	//�߻� Ŭ������ ��üȭ �� �� ����
	abstract void print();
}
	//�ڽ� Ŭ������ �߻�Ŭ������ �޼ҵ带 ������ �ؾ���
class E extends D{

	@Override
	void print() {
		System.out.println("E class, print()");
	}
	
}
public class AbstractClass_3 {

	public static void main(String[] args) {

		D d1 = new E();
		D d2 = new E();
		D d3 = new E(); 
		d1.print();
		d2.print();
		d3.print();
		
		D d4 = new E() {
			void print() {
				System.out.println("d4");
			}
		};
		
		D d5 = new E() {
			void print() {
				System.out.println("d5");
			}
		};
		
		D d6 = new E() {
			void print() {
				System.out.println("d6");
			}
		};
		d4.print();
		d5.print();
		d6.print();
		
		D d7 = new D() {
			void print() {
				System.out.println("d7");
			}
		};
		d7.print();
	}

}
