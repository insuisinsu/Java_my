package Chap12.Ex4;


//인터페이스 상속시 자식 클래스 접근 지정자 오류
//인터페이스의 메소드를 재정의 할 때는 반드시 public 을 넣어줘야 함
// ?? 인터페이스의 메소드는 public static 이 생략되어 있기 때문!

interface A{
	public abstract void abc();
}

class F implements A{
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}

interface B{
	void abc();
}


class C implements A{
	public void abc() { 			// interface A 의 abc() 를 오버라이딩
									// A 의 abc() 는 public static 이 생략되어 있기 때문에
									// A의 자식인 C 의 abc() 에도 public 을 넣어줘야 함
	}		
}

class E implements B{
		@Override
		public void abc() {
	}
}

public class Interface_4 {

	public static void main(String[] args) {

	}

}
