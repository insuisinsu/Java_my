package Chap0607.Ex02;



public class Example_Car {

	public static void main(String[] args) {

		//Car Class 를 객체화 해서 5개의 객체를 생성해서 값을 할당해서 출력해봅시당!

		
		Car avante = new Car();				//객체화
		
		// 변수의 값을 직접 할당, 권장사항 아님 // 메모리에 원하지 않는 값을 직접 할당
		// private 변수명 : 캡슐화 , 직접 변수의 값을 할당하지 못하도록 한다.
		
		avante.company = "현대";
		avante.model = "아반떼";
		avante.color = "검정색";
		avante.maxSpeed = 210;
		
		System.out.println(avante.company);
		System.out.println(avante.model);
		System.out.println(avante.color);
		System.out.println(avante.maxSpeed);
		System.out.println();		
		
		Car sonata = new Car();
		
		//setter 를 통해서 값을 부여 : 변수의 입력되는 값을 제어할 수 있다.
		
		sonata.setCompany("현대");
		sonata.setModel("쏘나타");
		sonata.setColor("흰색");
		sonata.setMaxSpeed(220);		// - or 300 값 이상을 넣을 수 없도록 제어 
		
		//getter 는 메모리의 값을 출력할 때
		System.out.println(sonata.getModel());
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		System.out.println();
		
		Car k3 = new Car();
		
		k3.setCompany("기아");
		k3.setModel("K3");
		k3.setColor("검정색");
		k3.setMaxSpeed(210);
		
		System.out.println(k3.getModel());
		System.out.println(k3.getCompany());
		System.out.println(k3.getColor());
		System.out.println(k3.getMaxSpeed());
		System.out.println();
		
		Car k5 = new Car();

		k5.company = "기아";
		k5.model = "K5";
		k5.color = "황금색";
		k5.maxSpeed = 240;
		
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.color);
		System.out.println(k5.maxSpeed);
		System.out.println();
		
		Car k7 = new Car();
		
		k7.setModel("K7");
		k7.setCompany("기아");
		k7.setColor("은색");
		k7.setMaxSpeed(320);
		
		System.out.println(k7.getCompany());
		System.out.println(k7.getModel());
		System.out.println(k7.getColor());
		System.out.println(k7.getMaxSpeed());
		System.out.println();
		
	}

}
