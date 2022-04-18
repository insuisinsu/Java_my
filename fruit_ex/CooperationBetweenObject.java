package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

//객체간의 협업 
/*				학생의 용돈 : 100,000
 		학생 		: 			버스를 탈때(-1000원)	지하철을 탈때 (-1,500)
 		버스		: 1,000원	승객수 증가, 수입 증가	
 		지하철 	: 1,500원 						승객수 증가, 수입 증가
 
 */

class Student {
	String studentName; // 학생명
	int money ; // 학생이 가진돈, 초기값 : 100,000

	@Override
	public String toString() {
		return "학생명 : " + studentName + ", " + "돈 : " + money;
	}

	public void takeBus(Bus bus, Student student) { // 학생이 버스를 탔을때? 버스에 돈을 지불 해야 한다.
		money = money - 1000;
		bus.take(student);
	}

	public void takeOutBus(Bus bus, Student student) { // 버스에서 내림.
		bus.takeOut(student);
	}

	public void takeSubway(Subway subway, Student student) { // 지하철을 탈때
		money = money - 1500;
		subway.take(student);
	}

	public void takeOutSubway(Subway subway, Student student) { // 지하철을 내릴때
		subway.takeOut(student);
	}

}

class Bus {
	int busName; // 100번 버스, 200버스 <== 인풋값을 받아서 , 생성자.
	int passengerCount = 0; // 승객수
	int money = 0; // 버스의 수입

	public void take(Student student) { // 버스의 수입을 처리, 승객수를 처리
		this.money = this.money + 1000;
		passengerCount = passengerCount + 1;
		System.out.println(student.studentName + "님 " + busName + "번 버스를 탔습니다. 즐거운 하루되세요." + student.studentName
				+ "님의 남은 금액은" + student.money + "입니다. " + busName + "번 버스의 승객은" + passengerCount + "명 이고, 수입은 " + money
				+ "입니니다.");
	}

	public void takeOut(Student student) { // 승객수만 감소
		passengerCount = passengerCount - 1;
		System.out.println(student.studentName + "님 " + busName + "번 버스를 내렸습니다. 즐거운 하루되세요." + student.studentName
				+ "님의 남은 금액은" + student.money + "입니다. " + busName + "번 버스의 승객은" + passengerCount + "명 이고, 수입은 " + money
				+ "입니니다.");
	}

}

class Subway {
	String lineNumber; // "1호선", 2호선, 3호선
	int passengerCount; // 승객수
	int money; // 수입

	// 생성자를 통해서 지하철 호선을 인풋 받아서 활성화.

	public void take(Student student) { // 수입을 처리하는 메소드, 승객수
		this.money = this.money + 1500;
		passengerCount = passengerCount + 1;
		System.out.println(student.studentName + "님 " + lineNumber + "호선 전철을 탔습니다. 즐거운 하루되세요." + student.studentName
				+ "님의 남은 금액은" + student.money + "입니다. " + lineNumber + "호선 전철의의 승객은" + passengerCount + "명 이고, 수입은 "
				+ money + "입니니다.");
	}

	public void takeOut(Student student) { // 지하철에서 승객감소
		passengerCount = passengerCount - 1;
		System.out.println(student.studentName + "님 " + lineNumber + "호선 전철에서 내렸습니다. 즐거운 하루되세요." + student.studentName
				+ "님의 남은 금액은" + student.money + "입니다. " + lineNumber + "호선 전철의 승객은" + passengerCount + "명 이고, 수입은 "
				+ money + "입니니다.");
	}

}

public class CooperationBetweenObject {
	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Subway subway1 = new Subway();
		Subway subway2 = new Subway();
		Subway subway3 = new Subway();
		/*
		 * 학생 5명 입력 : 학생당 100,000만원 초기값 할당.
		 * ============================================= 1. 학생객체 생성 | 2. 학생정보 출력 및 선택 3.
		 * 버스를 탐 | 4. 버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림. 7. 종료
		 * ============================================= 선택>> 1 학생이름 : 돈 입력 :
		 * 
		 * 선택>> 2 =====학생정보 출력===== 학생이름 가진돈
		 * 
		 * 
		 * 
		 * 학생선택(이름입력)>>
		 * 
		 * 
		 * 선택>> 3 000 님 000 번 버스를 탔습니다. 즐거운 하루되세요. 000 님의 남은돈은 000 입니다. 버스 000번의 승객은
		 * 000명이고 수입은000 입니다.
		 * 
		 * 선택>> 4 000 님 000 번 버스를 내렸습니다. 굿바이~~~. 000 님의 남은돈은 000 입니다. 버스 00번의 승객은 000명이고
		 * 수입은 000 입니다.
		 * 
		 * 선택>> 5 000 님 000 호선 지하철를 탔습니다. 즐거운 하루되세요. 000 님의 남은돈은 000 입니다. 지하철 00 호선의 승객은
		 * 00명이고 수입은 000 입니다.
		 * 
		 * 선택>> 6 000 님 000 호선 지하철를 내렸습니다. 안녕 ~~~ 000 님의 남은돈은 000 입니다. 지하철 00 호선의 승객은
		 * 00명이고 수입은 000 입니다.
		 */

		boolean run = true;
		Student s1 = null;
		int busName = 0;
		String subwayName = null;
		boolean on = true;

		while (run) {
			System.out.println("=========================================================\r\n"
					+ "1. 학생객체 생성 | 2. 학생정보 출력 및 선택 | " + "3. 버스를 탐 |4.  버스를 내림 | 5. 지하철을 탐 | 6. 지하철을 내림 | 7. 종료  \r\n"
					+ "=========================================================");
			int num = sc.nextInt();

			if (num == 1) {
				Student student = new Student();
				System.out.println("학생입력 >>");
				student.studentName = sc.next();
				System.out.println("돈 입력 >>");
				student.money = sc.nextInt();
				studentList.add(student);
			} else if (num == 2) {
				System.out.println(studentList.toString());
				System.out.println("학생 선택 : ");
				String name = sc.next();
				for (Student k : studentList) {
					if (k.studentName.equals(name)) {
						s1 = k;
					}
				}
			} else if (num == 3) {
				System.out.println("100번 버스와 200번 버스중 몇번 버스를 타시겠습니까? : ");
				busName = sc.nextInt();
				if (busName == 100) {
					bus1.busName = 100;
					s1.takeBus(bus1, s1);
				} else if (busName == 200) {
					bus2.busName = 200;
					s1.takeBus(bus2, s1);
				}
			} else if (num == 4) {
				if (busName == 100) {
					s1.takeOutBus(bus1, s1);
				} else if (busName == 200) {
					s1.takeOutBus(bus2, s1);
				}
			} else if (num == 5) {
				System.out.println("1호선 전철, 2호선 전철, 3호선 전철 중 몇호선을 타시겠습니까? : ");
				subwayName = sc.next();
				if (subwayName.equals("1호선")) {
					subway1.lineNumber = "1호선";
					s1.takeSubway(subway1, s1);
				} else if (subwayName.equals("2호선")) {
					subway2.lineNumber = "2호선";
					s1.takeSubway(subway2, s1);
				} else if (subwayName.equals("3호선")) {
					subway3.lineNumber = "3호선";
					s1.takeSubway(subway3, s1);
				}
			} else if (num == 6) {
				if (subwayName.equals("1호선")) {
					subway1.takeOut(s1);
				} else if (subwayName.equals("2호선")) {
					subway2.takeOut(s1);
				} else if (subwayName.equals("3호선")) {
					subway3.takeOut(s1);
				}
			} else if (num == 7) {
				System.out.println("프로그램을 종료 합니다.");
				break;

			}

		}
	}
}
