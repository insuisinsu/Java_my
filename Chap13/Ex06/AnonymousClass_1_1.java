package Chap13.Ex06;

//�������̽� : �߻� �޼ҵ带 ����
interface AA {
	//�߻� �޼ҵ�	: public abstract �� �����Ǿ� ����
	public abstract void cry();
	void fly();		
}

class BB {
	AA a = new C();
	void abc() {
		a.cry();
		a.fly();
	}
	//class C �� interface AA �� �޼��带 �����ϴ� Ŭ����
	class C implements AA{

		@Override
		public void cry() {
			System.out.println("�۸�");
		}

		@Override
		public void fly() {
			System.out.println("�����ƿ�");
		}
		
	}
}

public class AnonymousClass_1_1 {

	public static void main(String[] args) {
		BB b = new BB();
		b.abc();
	}

}
