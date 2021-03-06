package Chap0607.Ex06;

//ctatic 키가 할당된 필드는 모든 객체에서 공유해서 사용하는 메모리 영역

class D {
	int m = 3;				//인스턴스 필드 : 객체화 해서 사용
	static int n = 5;		//static 필드 : 객체화 없이 클래스 명으로 호출 가능 (Aaaa.n) + 객체화 해서 사용
								//-> 모든 객체에서 공유하는 필드


}

public class Static_02 {

	public static void main(String[] args) {
		//객체생성
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		
		//인스턴스 필드
			// 각 객체에서 공유되지 않는, 그 객체에서만 사용가능
		d1.m = 5;
		d2.m = 6;
		d3.m = 7;
		d4.m = 8;
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
		
		//정적(static) 필드
			// 객체이름으로 static 필드를 호출
		d1.n = 10;
		d2.n = 100;
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		//클래스 명으로 호출, 객체생성 없이 호출가능
		D.n = 200;
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
		
	}

}
