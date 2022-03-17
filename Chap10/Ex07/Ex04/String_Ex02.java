package Chap10.Ex07.Ex04;

class C {
	String name;
	C(String name){
		this.name = name;
	}
}

class D {
	String name;
	D(String name){
		this.name = name;
	}
	@Override
	public String toString() {		//패키지명.클래스명@해쉬코드 --> name 필드의 값을 리턴
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((D)obj).name) {
			return	true;
		}else {
			return false;					
		}
	}
}

public class String_Ex02 {

	public static void main(String[] args) {

		String s1 = new String("Hi");
		String s2 = "Hi";
		System.out.println(s1);
		
		//String 클래스는 equals() 도 재정의 되어 있음
		System.out.println(s1.equals(s2));
		
		C c1 = new C("Hi");
		C c2 = new C("Hi");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));	//false , 객체의 주소를 비교하기 때문
		System.out.println("=========");
		D d1 = new D("Hi");
		D d2 = new D("Hi");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
	}

}
