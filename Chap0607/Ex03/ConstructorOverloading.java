package Chap0607.Ex03;



//생성자 오버로딩
class Abc{
	int a, b, c;
	String d;
	
	Abc () {System.out.println(a + ", " + b + ", "+ c);}					// 기본 생성자
	
	Abc(int a) {				// 매개변수가 1개인 생성자
		this.a = a;
		System.out.println(a);
	}				
	
	Abc (String d){
		this.d = d;
		System.out.println(d);
	}
	Abc (int a, int b){			// 매개변수가 2개인 생성자
		this.a = a;
		this.b = b;
		System.out.println(a+ " " + b);
	}
	
	Abc (int a, int b, int c){	// 매개변수가 3개인 생성자
		this.a = a; this.b = b; this.c = c;
		System.out.println(a +" " + b +" " + c);
	}
	
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc () ;		// 기본 생성자 호출
		Abc abc1 = new Abc (1);		// 매개변수가 1개인 생성자 호출
		Abc abc2 = new Abc ("호랑이");
		Abc abc3 = new Abc (11, 22);
		Abc abc4 = new Abc (111, 222, 333);
		
	}

}
