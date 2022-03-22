package Chap13.Ex10;

class Button {
//	OnClickListener : 객체 타입, ocl : 참조 변수
	// ocl 기본값으로 null
	OnClickListener ocl ;
	
	//setter 를 통해서 OnClickListener 의 참조변수 ocl에 객체 주소를 담는다.
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	//InnerInterface 로, static 키가 생략되어 있음
	//Button.OnClickListener 타입으로 호출 가능
	//인터페이스만 존재하고 구현한 자식 클래스가 존재하지 않기 때문에
	// 호출하는 곳에서 ocClick() 메서드를 재정의해서 호출 필요
	interface OnClickListener{
		//추상 메서드 선언. -> 하위에서 오버라이딩 해서 재정의 필요
		void onClick();
	}
	
	//실행 했을 때  ocl.onClick() 호출
	void click() {
		ocl.onClick();		
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {

		//개발자 1 : 클릭시 음악 재생
		
		Button button1 = new Button();

		//OnClickListener 타입으로 객체 생성하여 매개변수로 전달
		/*
		 	A.B = new A.B(){이너인터페이스 B의 메서드를 구현한 코드};
		 */
		
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 1. 음악재생");
			}
		}
		);
		button1.click();
		
		//개발자 2 : 클릭시 네이버 접속
		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 2. 네이버 접속");
			}
		});
		button2.click();
		
		
		
		
		
		
	}

}
