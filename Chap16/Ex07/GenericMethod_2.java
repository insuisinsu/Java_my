package Chap16.Ex07;

//제너릭 클래스 : 클래스를 선언할 때 타입 변수를 선언 <T>
//			   객체를 생성시 T 에 적용할 타입을 지정
//제너릭 메소드 : 일반 클래스 내부의 메서드 선언시 제너릭 타입 변수를 사용

class Genericmethod{	// 일반 클래스
	
	//제너릭 메서드 - 타입 1개
	public<T> T method1(T t) {
		return t;
	}
	//제너릭 메서드 - 타입 1개
	public<T> boolean method2(T t1, T t2) {
		return t1.equals(t2);			//두 값을 비교하여 true, false 리턴
										//기본 자료형일 때는 값을 비교하고
										//참조 자료형일 때는 객체의 주소를 비교
										// 단, String 일 경우 주소가 아닌 값 비교(
	}
	//제너릭 메서드 - 타입 2개
	public <K, V> void method3(K k, V v) {
		System.out.println(k + " : " + v);
	}
	
	public <K, V> void method4() {
		System.out.println("매개변수가 인풋값으로 없는 경우,, 생략하면 오류 발생");
	}
	
}

public class GenericMethod_2 {

	public static void main(String[] args) {

		//1. 일반 클래스의 객체를 생성하고, 제너릭 메서드 호출
		Genericmethod gm = new Genericmethod();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.<String>method1("안녕");
//		String str3 = gm.method1("안녕"); 	// 타입을 알 수 있는 경우 생략 가능 (매개변수로 값을 넣을 때 생량가능)
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=========================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i +" "+i2);
		System.out.println("=========================");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("=========================");
		
		Boolean d1 = gm.<Double>method2(2.55, 2.55);
		Boolean d2 = gm.<Double>method2(2.55, 2.53);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("=========================");
		
		gm.<String, Integer>method3("국어", 90);
		gm.method3("영어", 77); 	//매개변수로 인풋되는 데이터 타입을 추정할 수 있는 경우 <> 를 생략 할 수 있음
		
		gm.<Integer, String> method3(500, "서버 에러 입니다.");
		gm.method3(402, "파일을 찾을 수 없습니다");
		
		gm.method4();		
		
		
		
		
		
		
	}

}
