package Chap13.Ex10.Ex2;


/*
 	1. 객체 생성후 필드에 직접 값을 할당 (d1)
 	2. setter 를 통해서 값 할당 (d2)
 	3. 생성자를 통해서 값 할당 (d3)
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
		d2.ghi();	// <-- 얘가 없으면 d3 나오고  있으면 d2, d3 둘 다 안 나옴		
		
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
