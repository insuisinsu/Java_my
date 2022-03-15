package Chap0607.Ex05;

// 접근 제어자 (캡슐화: 데이터를 외부로 부터 보호) : public, protected, default(생략), private
	// 클래스 이름, 필드명, 메소드명, 생성자명  앞에  접근제어자가 반드시 할당되어 있음
	// 클래스 이름 : Public, default


public class A {

	//필드의 기본 접근 제어자는 default (생략)
	//default 접근자는 같은 패키지 내에 있는 다른 클래스에서도 접근 가능
	//다른 패키지의 클래스에서는 접근 불가
	int m = 3;				
	
	//private : 외부 클래스에서 접근 불가
	private int n = 4;
	
	//public : 다른 패키지에서도 접근 가능
	public int k = 30;
	
	
	void print() {			//접근제어자 default 생략 : 같은 패키지 내의 클래스에서만 사용 가능
		System.out.println("import 성공"+m);
	}
	
	public void print2() {
		System.out.println("외부 패키지의 다른 클래스에서 접근가능 Public"+k);
	}

	public static void main(String[] args) {

		
	}

	}
