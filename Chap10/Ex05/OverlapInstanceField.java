package Chap10.Ex05;

//인스턴스 필드는 오버라이딩 되지 않음

class AA {				//부모 클래스
	int m =3;			//인스턴스 필드
	void print () {
		System.out.println("AA class");
	}
}

class BB extends AA {
	int m = 4;			//인스턴스 필드
	void print () {
		System.out.println("BB class");
	}
}

class CC extends AA {
	int m = 5;			//인스턴스 필드
	void print () {
		System.out.println("CC class");
	}
}

public class OverlapInstanceField {

	public static void main(String[] args) {
		//1. 객체 생성
		AA aa = new AA();
		BB bb = new BB();
		CC cc = new CC();
		
		AA ab = new BB();
		AA ac = new CC();
		
		//2. 인스턴스 필드 출력
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(cc.m);
		System.out.println();
		System.out.println(ab.m);
		System.out.println(ac.m);
		System.out.println();
		
		//3. 오버라이드된 메소드 출력
		aa.print();
		bb.print();
		cc.print();
		System.out.println();
		ab.print();
		ac.print();
	}

}
