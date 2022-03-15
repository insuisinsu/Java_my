package Chap10.Ex03;

//instanceof : 객체 내부의 캐스팅 가능여부를 알 수 있도록 하는 키워드
//업캐스팅한 객체 내부에 어떤 타입이 존재하는지 True or False 
//다운 캐스팅시 런타임 오류가 발생될 수 있다.
//다운 캐스팅시 해당 타입이 객체에 존재할 때 다운 캐스팅 하도록 설정

class A {
	int m;
	void a() {
		System.out.println("m : "+m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : "+n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {

		//1. intstanceof
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof A);
		System.out.println(ab instanceof B);
		
		//aa 객체에 B 타입이 포함되어 있을 경우에만 캐스팅 한다.
		//-> 런타임 시 오류 방지 위함
		
		if ( aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa를 B 로 캐스팅 했습니다.");
		}else {
			System.out.println("aa는 B 타입으로 캐스팅 불가합니다.");
		}
		
		if ( ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab를 B 로 캐스팅 했습니다.");
		}else {
			System.out.println("ab는 B 타입으로 캐스팅 불가합니다.");
		}
		
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}
		
	}

}






