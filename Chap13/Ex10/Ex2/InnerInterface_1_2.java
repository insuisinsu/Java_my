package Chap13.Ex10.Ex2;


/*
 	1. ��ü ������ �ʵ忡 ���� ���� �Ҵ� (d1)
 	2. setter �� ���ؼ� �� �Ҵ� (d2)
 	3. �����ڸ� ���ؼ� �� �Ҵ� (d3)
 */
class Abc{
	Abc(){}
	Def d;
	Abc(Def d){
		
	}
	
	public void setD(Def d) {
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi () {
		d.run();
		d.fly();
	}
}

public class InnerInterface_1_2 {

	public static void main(String[] args) {
		//1.
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d1 run()");
			}
			
			@Override
			public void fly() { 
				System.out.println("d1 fly()");
			}
		};
		d1.ghi();
		
					
		//2.
		Abc d2 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("d2 run()");
					}
					
					@Override
					public void fly() {
						System.out.println("d2 fly()");
					}
				});
		d2.ghi();	// <-- �갡 ������ d3 ������  ������ d2, d3 �� �� �� ����		
		
		//3.
		Abc d3 = new Abc();
		d3.setD(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d3 run()");
			}
			
			@Override
			public void fly() {
				System.out.println("d3 fly()");
			}
		});
		d3.ghi();
	}

}
