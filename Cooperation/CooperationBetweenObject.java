package Cooperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
	
	Student(String studentName){
		this.studentName = studentName;
		money = 100000;
	}
	
	public void TakeBus(Bus bus) {
		bus.Take(1000);
		money -= 1000;
	}
	public void TakeOffBus(Bus bus) {
		bus.TakeOff();
	}
	
	public void TakeSubway(Subway subway) {
		subway.Take(1500);
		money -= 1500;
	}
	public void TakeOffSubway(Subway subway) {
		subway.TakeOff();
	}
	
}

class Bus {
	int busName;			//100 번 버스, 200 번 버스	<- 생성자로 인풋값 받아서 이름 정하기
	int passengerCount;		//승객수
	int money;				//버스의 수입

	Bus (int busName){
		this.busName = busName;
		passengerCount = 0;
		money = 0;
	}
	
	public void Take(int money) {
		this.money += money;
		passengerCount += 1;
	}
	public void TakeOff() {
		passengerCount -= 1;
	}
	
}

class Subway {
	String lineNumber;		//1호선	<- 생성자로 인풋값 받아서 이름 정하기
	int passengerCount;		//승객수
	int money;				//지하철의 수입
	
	Subway (String lineNumber){
		this.lineNumber = lineNumber;
		passengerCount = 0;
		money = 0;
	}
	
	public void Take(int money) {
		this.money = this.money + money;
		passengerCount += 1;
	}
	public void TakeOff() {
		passengerCount -= 1;
	}
}

public class CooperationBetweenObject {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Student> sList = new ArrayList();
	private static ArrayList<Bus> bList = new ArrayList();
	private static ArrayList<Subway> wList = new ArrayList();
	
	private static void createStudent() {
		System.out.println("--------------------------------------------------------");
		System.out.println("1. 학생객체 생성");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("이름을 입력하세요. >>");
		String name = sc.next();
		
		Student newStudent = new Student(name);
		sList.add(newStudent);
	}
	
	private static void studentList() {
		System.out.println("--------------------------------------------------------");
		System.out.println("2. 학생 정보 출력 및 선택");
		System.out.println("--------------------------------------------------------");
		
		for(int i = 0; i < sList.size() ; i++) {
			//각 방의 객체를 담는 변수를 선언
			Student student = sList.get(i); // 0 ~ 99 방의 객체를 account 참조 변수에 담는다.
			if(student != null) {
				System.out.print("이름 : "+student.studentName+"     ");
				System.out.println("잔액 : " + student.money+" 원");
			}
		}
	}
	
	private static void TakeBus() {
		System.out.println("버스에 탈 학생의 이름을 입력하세요.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("타려는 버스 번호를 입력하세요.");
		int busNo = sc.nextInt();
		Bus bus = findBus(busNo);
		if(bus == null) {
			System.out.println("해당 버스가 존재하지 않습니다.");
			return;
		}
		
		student.TakeBus(bus);
		
		System.out.println(student.studentName+" 님이 " + bus.busName+" 번 버스를 탔습니다. ");
		System.out.println(student.studentName+" 님의 남은 돈은 "+student.money+" 원 입니다.");
		System.out.print(bus.busName+" 번 버스의 승객은 "+bus.passengerCount+" 명 이고, ");
		System.out.println("총 수입은 "+bus.money+" 입니다.");
	}
	
	private static void TakeOffBus() {
		System.out.println("버스에서 내릴 학생의 이름을 입력하세요.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("내리려는 버스 번호를 입력하세요.");
		int busNo = sc.nextInt();
		Bus bus = findBus(busNo);
		if(bus == null) {
			System.out.println("해당 버스가 존재하지 않습니다.");
			return;
		}
		
		student.TakeOffBus(bus);
		
		System.out.println(student.studentName+" 님이 " + bus.busName+" 번 버스에서 내렸습니다.");
		System.out.println(student.studentName+" 님의 남은 돈은 "+student.money+" 원 입니다.");
		System.out.print(bus.busName+" 번 버스의 승객은 "+bus.passengerCount+" 명 이고, ");
		System.out.println("총 수입은 "+bus.money+" 입니다.");
	}
	
	private static void TakeSubway() {
		System.out.println("버스에 탈 학생의 이름을 입력하세요.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("타려는 지하철 호선을 입력하세요.");
		String subNo = sc.next();
		Subway subway = findSubway(subNo);
		if(subway == null) {
			System.out.println("해당 호선이 존재하지 않습니다.");
			return;
		}
		
		student.TakeSubway(subway);
		
		System.out.println(student.studentName+" 님이 " + subway.lineNumber+" 호선 지하철을 탔습니다. ");
		System.out.println(student.studentName+" 님의 남은 돈은 "+student.money+" 원 입니다.");
		System.out.print(subway.lineNumber+" 번 지하철의 승객은 "+subway.passengerCount+" 명 이고, ");
		System.out.println("총 수입은 "+subway.money+" 입니다.");
	}
	
	private static void TakeOffSubway() {
		System.out.println("지하철에서 내릴 학생의 이름을 입력하세요.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("내리려는 지하철의 호선을 입력하세요.");
		String subNo = sc.next();
		Subway subway = findSubway(subNo);
		if(subway == null) {
			System.out.println("해당 호선이 존재하지 않습니다.");
			return;
		}
		
		student.TakeOffSubway(subway);
		
		System.out.println(student.studentName+" 님이 " + subway.lineNumber+" 호선 지하철에서 내렸습니다. ");
		System.out.println(student.studentName+" 님의 남은 돈은 "+student.money+" 원 입니다.");
		System.out.print(subway.lineNumber+" 번 지하철의 승객은 "+subway.passengerCount+" 명 이고, ");
		System.out.println("총 수입은 "+subway.money+" 입니다.");
	}
	
	private static Student findStudent(String name) {
		Student student = null;
		for (int i = 0; i < sList.size(); i++) {
			if(sList.get(i) != null) {
				String dbName = sList.get(i).studentName;
				if(dbName.equals(name)) {
					student = sList.get(i);
					break;
				}
			}
		}
		return student;
	}
	
	private static Bus findBus(int busNo) {
		Bus bus = null;
		for (int i = 0; i < bList.size(); i++) {
			if(bList.get(i) != null) {
				int dbBusNo = bList.get(i).busName;
				if(dbBusNo == busNo) {
					bus = bList.get(i);
					break;
				}
			}
		}
		return bus;
	}
	
	private static Subway findSubway(String subNo) {
		Subway subway = null;
		for (int i = 0; i < wList.size(); i++) {
			if(wList.get(i) != null) {
				String dbSubNo = wList.get(i).lineNumber;
				if(dbSubNo.equals(subway.lineNumber)) {
					subway = wList.get(i);
					break;
				}
			}
		}
		return subway;
	}
	
	
	
	
	
	public static void main(String[] args) {

		bList.add(new Bus(1));bList.add(new Bus(2));bList.add(new Bus(3));
		bList.add(new Bus(4));bList.add(new Bus(5));
		wList.add(new Subway("1"));wList.add(new Subway("2"));wList.add(new Subway("3"));
		wList.add(new Subway("4"));wList.add(new Subway("5"));
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("1. 학생객체 생성  |  2. 학생정보 출력 및 선택  |  3. 버스 타기 | 4. 버스 내리기 | 5. 전철 타기 | 6. 전철 내리기 | 7. 종료");
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("선택>>");
			int selectNO = sc.nextInt();
			
			if(selectNO == 1) {
				createStudent(); 	//메소드 호출
			}else if(selectNO == 2) {
				studentList();
			}else if(selectNO == 3) {
				TakeBus();
			}else if(selectNO == 4){
				TakeOffBus();
			}else if(selectNO == 5){
				TakeSubway();
			}else if(selectNO == 6){
				TakeOffSubway();
			}else if(selectNO == 7){
				run = false;
			}
			
		}
		sc.close();
		System.out.println("프로그램 종료");
		
	}

}
