package Chap0607.Ex02;


//다양한 타입의 메소드 형식 (return 타입이 있는 경우(int, double, Stirng 등)
//					  (return 타입이 없는 경우 void 키를 사용)
public class ExternalCallMethods {

	public static void main(String[] args) {

		//객체생성
		A a = new A();						// 같은 패키지 내의 클래스는 import 없이 호출해서 사용 가능
		
		//메소드 호출
		a.print();
		int k = a.data();
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethode(0);
		a.printMethode(4);
		
		//주의
		System.out.println(a.data()); 		//출력구문에 호출 가능한 메소드 (리턴이 있는 메소드)
//		System.out.println(a.print());		//오류발생 //return이 없는 메소드// 출력인데 또 출력해서..?
		a.print();
		System.out.println(a.sum(4, 10.5));	
//		System.out.println(a.printMethode(33));
		
		
		
	}

}
