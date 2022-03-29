package Chap16.Ex07;

//제너릭 메서드 내부에서 사용 가능한 메서드 : Object 클래스의 메서드만 사용 가능

class A{
	public <T> void method1(T t){
//		System.out.println(t.length()); 	//t.length() 는 String 클래스에서 글자수를 리턴해줌//사용불가
		System.out.println(t.equals("안녕"));	//t.equals() 는 Object 클래스의 메서드이기 때문에 사용가능
		
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method1("안녕");
		
		
	}

}
