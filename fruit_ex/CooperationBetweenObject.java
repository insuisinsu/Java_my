package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

//��ü���� ���� 
/*				�л��� �뵷 : 100,000
 		�л� 		: 			������ Ż��(-1000��)	����ö�� Ż�� (-1,500)
 		����		: 1,000��	�°��� ����, ���� ����	
 		����ö 	: 1,500�� 						�°��� ����, ���� ����
 
 */

class Student {
	String studentName; // �л���
	int money ; // �л��� ������, �ʱⰪ : 100,000

	@Override
	public String toString() {
		return "�л��� : " + studentName + ", " + "�� : " + money;
	}

	public void takeBus(Bus bus, Student student) { // �л��� ������ ������? ������ ���� ���� �ؾ� �Ѵ�.
		money = money - 1000;
		bus.take(student);
	}

	public void takeOutBus(Bus bus, Student student) { // �������� ����.
		bus.takeOut(student);
	}

	public void takeSubway(Subway subway, Student student) { // ����ö�� Ż��
		money = money - 1500;
		subway.take(student);
	}

	public void takeOutSubway(Subway subway, Student student) { // ����ö�� ������
		subway.takeOut(student);
	}

}

class Bus {
	int busName; // 100�� ����, 200���� <== ��ǲ���� �޾Ƽ� , ������.
	int passengerCount = 0; // �°���
	int money = 0; // ������ ����

	public void take(Student student) { // ������ ������ ó��, �°����� ó��
		this.money = this.money + 1000;
		passengerCount = passengerCount + 1;
		System.out.println(student.studentName + "�� " + busName + "�� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���." + student.studentName
				+ "���� ���� �ݾ���" + student.money + "�Դϴ�. " + busName + "�� ������ �°���" + passengerCount + "�� �̰�, ������ " + money
				+ "�Դϴϴ�.");
	}

	public void takeOut(Student student) { // �°����� ����
		passengerCount = passengerCount - 1;
		System.out.println(student.studentName + "�� " + busName + "�� ������ ���Ƚ��ϴ�. ��ſ� �Ϸ�Ǽ���." + student.studentName
				+ "���� ���� �ݾ���" + student.money + "�Դϴ�. " + busName + "�� ������ �°���" + passengerCount + "�� �̰�, ������ " + money
				+ "�Դϴϴ�.");
	}

}

class Subway {
	String lineNumber; // "1ȣ��", 2ȣ��, 3ȣ��
	int passengerCount; // �°���
	int money; // ����

	// �����ڸ� ���ؼ� ����ö ȣ���� ��ǲ �޾Ƽ� Ȱ��ȭ.

	public void take(Student student) { // ������ ó���ϴ� �޼ҵ�, �°���
		this.money = this.money + 1500;
		passengerCount = passengerCount + 1;
		System.out.println(student.studentName + "�� " + lineNumber + "ȣ�� ��ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���." + student.studentName
				+ "���� ���� �ݾ���" + student.money + "�Դϴ�. " + lineNumber + "ȣ�� ��ö���� �°���" + passengerCount + "�� �̰�, ������ "
				+ money + "�Դϴϴ�.");
	}

	public void takeOut(Student student) { // ����ö���� �°�����
		passengerCount = passengerCount - 1;
		System.out.println(student.studentName + "�� " + lineNumber + "ȣ�� ��ö���� ���Ƚ��ϴ�. ��ſ� �Ϸ�Ǽ���." + student.studentName
				+ "���� ���� �ݾ���" + student.money + "�Դϴ�. " + lineNumber + "ȣ�� ��ö�� �°���" + passengerCount + "�� �̰�, ������ "
				+ money + "�Դϴϴ�.");
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
		 * �л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�.
		 * ============================================= 1. �л���ü ���� | 2. �л����� ��� �� ���� 3.
		 * ������ Ž | 4. ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����. 7. ����
		 * ============================================= ����>> 1 �л��̸� : �� �Է� :
		 * 
		 * ����>> 2 =====�л����� ���===== �л��̸� ������
		 * 
		 * 
		 * 
		 * �л�����(�̸��Է�)>>
		 * 
		 * 
		 * ����>> 3 000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 000 ���� �������� 000 �Դϴ�. ���� 000���� �°���
		 * 000���̰� ������000 �Դϴ�.
		 * 
		 * ����>> 4 000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 000 ���� �������� 000 �Դϴ�. ���� 00���� �°��� 000���̰�
		 * ������ 000 �Դϴ�.
		 * 
		 * ����>> 5 000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 000 ���� �������� 000 �Դϴ�. ����ö 00 ȣ���� �°���
		 * 00���̰� ������ 000 �Դϴ�.
		 * 
		 * ����>> 6 000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~ 000 ���� �������� 000 �Դϴ�. ����ö 00 ȣ���� �°���
		 * 00���̰� ������ 000 �Դϴ�.
		 */

		boolean run = true;
		Student s1 = null;
		int busName = 0;
		String subwayName = null;
		boolean on = true;

		while (run) {
			System.out.println("=========================================================\r\n"
					+ "1. �л���ü ���� | 2. �л����� ��� �� ���� | " + "3. ������ Ž |4.  ������ ���� | 5. ����ö�� Ž | 6. ����ö�� ���� | 7. ����  \r\n"
					+ "=========================================================");
			int num = sc.nextInt();

			if (num == 1) {
				Student student = new Student();
				System.out.println("�л��Է� >>");
				student.studentName = sc.next();
				System.out.println("�� �Է� >>");
				student.money = sc.nextInt();
				studentList.add(student);
			} else if (num == 2) {
				System.out.println(studentList.toString());
				System.out.println("�л� ���� : ");
				String name = sc.next();
				for (Student k : studentList) {
					if (k.studentName.equals(name)) {
						s1 = k;
					}
				}
			} else if (num == 3) {
				System.out.println("100�� ������ 200�� ������ ��� ������ Ÿ�ðڽ��ϱ�? : ");
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
				System.out.println("1ȣ�� ��ö, 2ȣ�� ��ö, 3ȣ�� ��ö �� ��ȣ���� Ÿ�ðڽ��ϱ�? : ");
				subwayName = sc.next();
				if (subwayName.equals("1ȣ��")) {
					subway1.lineNumber = "1ȣ��";
					s1.takeSubway(subway1, s1);
				} else if (subwayName.equals("2ȣ��")) {
					subway2.lineNumber = "2ȣ��";
					s1.takeSubway(subway2, s1);
				} else if (subwayName.equals("3ȣ��")) {
					subway3.lineNumber = "3ȣ��";
					s1.takeSubway(subway3, s1);
				}
			} else if (num == 6) {
				if (subwayName.equals("1ȣ��")) {
					subway1.takeOut(s1);
				} else if (subwayName.equals("2ȣ��")) {
					subway2.takeOut(s1);
				} else if (subwayName.equals("3ȣ��")) {
					subway3.takeOut(s1);
				}
			} else if (num == 7) {
				System.out.println("���α׷��� ���� �մϴ�.");
				break;

			}

		}
	}
}
