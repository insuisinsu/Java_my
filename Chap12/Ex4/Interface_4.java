package Chap12.Ex4;


//�������̽� ��ӽ� �ڽ� Ŭ���� ���� ������ ����
//�������̽��� �޼ҵ带 ������ �� ���� �ݵ�� public �� �־���� ��
// ?? �������̽��� �޼ҵ�� public static �� �����Ǿ� �ֱ� ����!

interface A{
	public abstract void abc();
}

class F implements A{
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}

interface B{
	void abc();
}


class C implements A{
	public void abc() { 			// interface A �� abc() �� �������̵�
									// A �� abc() �� public static �� �����Ǿ� �ֱ� ������
									// A�� �ڽ��� C �� abc() ���� public �� �־���� ��
	}		
}

class E implements B{
		@Override
		public void abc() {
	}
}

public class Interface_4 {

	public static void main(String[] args) {

	}

}
