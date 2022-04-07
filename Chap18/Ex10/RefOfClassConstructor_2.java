package Chap18.Ex10;

interface A{
	B abc(int k);		// B ��ü�� ����
}

class B{
	B(){
		System.out.println("ù���� ������");
	}
	B(int k ){
		System.out.println("�ι�° ������");
	}
	
}



public class RefOfClassConstructor_2 {

	public static void main(String[] args) {

//		1. Ŭ���� ������ ����
//		�͸� �̳� Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {			//abc() ȣ��� B ��ü�� �⺻ ȣ�� = ������ ����
				return new B(3);
			}
		};
		
//		2. ���ٽ�
		A a2 = (int k ) -> {return new B(3);};
		A a3 = k -> new B(3);
		
//		3. Ŭ���� ������ ����
		A a4 = B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
		
		
		
	}

}
