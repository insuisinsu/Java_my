package Chap0607.Ex06;

class Aaa{
	//필드(인스턴스 필드) : 객체 생성 후에 사용 가능
	int m = 3;					
	
	//필드(static 필드) : 객체 생성없이 사용가능, 객체 생성 후에도 사용이 가능
	// --> 모든 객체가 공유하는 변수
	static int n = 4;			
								
	//메소드(인스턴스 메소드): 객체를 생성 후 호출 가능
	//인스턴스 필드와 static 필드 모두 올 수 있음
	void print1() {
		System.out.println("인스턴스 메소드 -- "+" m : "+m+",  n : "+n);
	}
	//메소드(static 메소드): 객체 생성 없이도 호출 가능
	//static 메소드 에서는 인스턴스 필드가 올 수 없음
	//static 필드만 가능!
		//??-> static 필드는 객체 생성이 불필요하지만, 인스턴스 필드는 객체 생성이 반드시 필요하기 때문에
	
	static void print2() {
		int i = 3;
		System.out.println("인스턴스 메소드 -- "+" m : 올 수 없음 "+i+",  n : "+n);
	}
	
}

public class Static_01 {

	public static void main(String[] args) {

		//1. 객체 생성 후 필드와 메소드 호출
		// -- 인스턴스 필드, static 필드, 인스턴스 메소드, static 메소드  모두 호출 가능
		
		Aaa aaa = new Aaa();
		aaa.m = 10;					// 인스턴스 필드 호출
		aaa.n = 20;					// static 필드 호풀
		aaa.print1(); 				// 인스턴스 메소드 호출
		aaa.print2(); 				// static 메소드 호출
		
		//2. 객체 생성없이 클래스명으로 static 필드와 메소드 호출
		// -- static 필드, static 메소드 호출 가능
		
		Aaa.n = 100;		// static 필드: 클래스 명으로 호출됨
		Aaa.print2();		// static 메소드 : 클래스 명으로 호출됨
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);  
		
		eee.n = 300;
		System.out.println("static 필드가 적용된 필드는 모든 객체에서 공통으로 바라보는 변수");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}














