package Chap0607.Ex03;

class Car{
	String company;				//필드(인스턴스 필드)의 company를 알려주는 this,   Heap 메모리엥 저장
	String model;				// 인스턴스 : 객체화를 했을 때 사용이 가능한 필드
	String color;
	double maxSpeed;
	
	Car (String company, String model, String c, double d){
		this.company = company;
		this.model = model;
		color = c;				//this. 가 생략된 상태
		maxSpeed = d;			//this. 가 생략된 상태
	}
	
	void work() {				//메소드(인스턴스 메소드) : Heap 영역의 메소드명과 포인터를 저장
								//메소드의 전체 구문은 클래스 영역의 메소드 영역에 저장
		System.out.println("이 차량은 제조사 "+company+" 의 " + model + " 이며,");
		System.out.println("최대 시속 "+maxSpeed+"km/h 를 자랑합니다.");
		System.out.println("가장 인기있는 색상은 "+color+" 입니다.");
	}
	
	
	
}


public class Q1 {

	public static void main(String[] args) {
		//생성자를 통해서 기본 값을 할당 후 메모리의 내용을 work() 메소드를 사용해서 출력
		
		Car sonata = new Car("현대자동차", "Sonata", "검정색", 230.5);
		sonata.work();
		
		
		
		
	}

}
