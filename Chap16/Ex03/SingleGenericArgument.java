package Chap16.Ex03;

/*
 Object : 모든 객체를 저장할 수 있지만,, 다운캐스팅 필요, 캐스팅시 예외가 발생 될 수 있음(약한 타입 체크)
 Generic 클래스 : 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있음.

 제너릭 타입 변수 : T (Type), K (Key), V (Value), N(Number), E (Element)
				 A - Z 까지 임의로 넣을 수 있음
			wrapper 클래스 : 기본 타입을 객체화 시켜놓은 클래스
			기본타입	-> 객체
			int -> Integer
			boolean -> Boolean
			Char -> Charter
			double -> Double
			float -> Float
 */
 
			


//제너릭 클래스
class MyClass<T>{
	private T t;
	public T get() {		//getter 필드의 값을 가져오기
		return t;
	}
	public void set(T t) {		//setter 필드의 값을 할당
		this.t = t;
		
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {

		//제너릭 클래스 객체 생성 <String> 입력 
		MyClass<String> mc1 = new MyClass<String>();	//wrapper 를 넣어야 함.
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		//제네릭 클래스 객체 생성 <Integer> 입력
		MyClass<Integer> mc2 = new MyClass<Integer>();		
		mc2.set(123);
		System.out.println(mc2.get());
		
		//제네릭 클래스 객체 생성 <Double> 입력
		MyClass<Double> mc3 = new MyClass();	// 생성자의 자료형은 생략 가능함
		mc3.set(3.14);
		System.out.println(mc3.get());
		
		//강한 타입 체크 (컴파일 단계에서 오류를 출력)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(null);
//		mc4.set("안녕");		//실행시에 오류를 방지시켜줌7	
		System.out.println(mc4.get());
		
		
		
	}

}
