package Chap12.Ex9;

public class SamsungPhone implements PhoneInterface{

	//인터페이스에서 정의한 메소드를 구현하기
	@Override
	public void sendCall() {
		System.out.println("띠링띠링~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어용");
	}
	
	//추가적인 SamsungPhone 만의 기능 추가하기
	public void flash() {
		System.out.println("불빛이 번쩍");
	}
	
}
