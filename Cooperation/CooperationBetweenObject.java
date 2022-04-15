package Cooperation;

import java.util.ArrayList;

/*
  	객체간의 협업
  							학생은 100,000원으로 시작
  	학생		: 				버스를 탈 때(가진돈 - 1000원) 		지하철 탈 때(가진돈 - 1500원)
  	학생 5명 
  	버스		: 요금 1000원		승객수 증가, 수입 증가 				
  	지하철	: 요금 1500원										승객수 증가, 수입 증가
  	
  	
 */

class Student {
	String studentName;		//학생이름
	int money; 				//학생이 가진돈, 100000 으로 시작
	
	public void takeBus(Bus bus) {		//학생이 버스를 탔을 때 ,, 버스에 돈을 지불함
		bus.take(1000);
	}
	public void takeOutBus(Bus bus) {	//학생이 버스에서 내림
		bus.takeOut();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
	}
	public void takeOutSubway(Subway subway) {
		subway.takeOut();
	}
	
	
}

class Bus {
	int busName;			//100 번 버스, 200 번 버스	<- 생성자로 인풋값 받아서 이름 정하기
	int passengerCount;		//승객수
	int money;				//버스의 수입
	
	public void take(int money) {	//버스의 수입 증가, 승객수 증가		//수입이 들어오면 money랑 passengerCount 증가시키면 될듯
		
	}
	public void takeOut() {		//수입은 그대로, 승객수 감소
		
	}
	
}

class Subway {
	String lineNumber;		//1호선	<- 생성자로 인풋값 받아서 이름 정하기
	int passengerCount;		//승객수
	int money;				//지하철의 수입
	
	public void take(int money) {	//지하철의 수입 증가, 승객수 증가		//수입이 들어오면 money랑 passengerCount 증가시키면 될듯
		
	}
	public void takeOut() {		//수입은 그대로, 승객수 감소
		
	}
}


public class CooperationBetweenObject {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList();
		
		/*
		학생 5명 입력 : 학생당 100,000만원 초기값 할당. 
		=============================================
		1. 학생객체 생성  | 2. 학생정보 출력 및 선택  
		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  
		=============================================
		선택>> 1
		학생이름  : 
		 돈 입력   : 

		선택>> 2 
		=====학생정보 출력=====
		학생이름	가진돈



		학생선택(이름입력)>> 

		//학생 선택한 이후랑 구분해서 해야하나?

		선택>> 3
		// 몇 번 버스 탔는지 선택
		
		000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		버스 000번의 승객은 000명이고 수입은000 입니다. 

		선택>> 4
		000 님 000 번 버스를 내렸습니다. 굿바이~~~. 
		000 님의 남은돈은 000 입니다. 
		버스 00번의 승객은 000명이고 수입은 000 입니다. 

		선택>> 5
		000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 

		선택>> 6
		000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~
		000 님의 남은돈은 000 입니다. 
		지하철 00 호선의 승객은 00명이고 수입은  000 입니다. 
		*/ 

		
		
		
		
		
		
		
		
	}

}
