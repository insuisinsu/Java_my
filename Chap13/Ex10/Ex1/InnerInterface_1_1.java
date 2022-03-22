package Chap13.Ex10.Ex1;

class A{
	/*
	 	B : �������̽� Ÿ��, b : ���� ���� - ���� �Ҵ��ϴ� ���
	 	
	 	1. ��ü ���� �� ���� �Ҵ�
	 	2. �����ڸ� ���ؼ� ���� �Ҵ�
	 	3. setter �� ���ؼ� ���� �Ҵ�. 
	 */
	
	B b;
	
	A (){}
	A(B b){
		
	}
	
	public void setB (B b) {
		this.b = b;
	}
	
	interface B {
		void play();
		void stop();
	}
	
	//play(), stop() ������
	void abc() {
		b.play();
		b.stop();
	}
}


public class InnerInterface_1_1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.setB(new A.B() {
			
			@Override
			public void play() {
				System.out.println("a �� play");
			}
			
			@Override
			public void stop() {
				System.out.println("a �� stop");
			}
			
		});
		
		a.abc();
		
		System.out.println("-------------");
		
		//1. ��ü ���� �� �ʵ忡 ���� �Ҵ��ϴ� ���
		A a1 = new A();
		//�������̽� A.B
		a1.b = (A.B) new A.B() {
			public void play() {System.out.println("a1�� play");};
			public void stop() {System.out.println("a1�� stop");};
		};
		a1.abc();
		
		//2. �����ڸ� ���ؼ� ���� �Ҵ�
		
		//������ ���ο�  A.B Ÿ���� ��ü ���� �� �ֱ�
		A a2 = new A(
			new A.B() {
					
				@Override
				public void stop() {
					System.out.println("a2 �� stop");
				}
				
				@Override
				public void play() {
					System.out.println("a2 �� play");
				}
			}
		);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
