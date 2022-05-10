package Cooperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
  	��ü���� ����
  							�л��� 100,000������ ����
  	�л�		: 				������ Ż ��(������ - 1000��) 		����ö Ż ��(������ - 1500��)
  	�л� 5�� 
  	����		: ��� 1000��		�°��� ����, ���� ���� 				
  	����ö	: ��� 1500��										�°��� ����, ���� ����
  	
  	
 */

class Student {
	String studentName;		//�л��̸�
	int money; 				//�л��� ������, 100000 ���� ����
	
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
	int busName;			//100 �� ����, 200 �� ����	<- �����ڷ� ��ǲ�� �޾Ƽ� �̸� ���ϱ�
	int passengerCount;		//�°���
	int money;				//������ ����

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
	String lineNumber;		//1ȣ��	<- �����ڷ� ��ǲ�� �޾Ƽ� �̸� ���ϱ�
	int passengerCount;		//�°���
	int money;				//����ö�� ����
	
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
		System.out.println("1. �л���ü ����");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("�̸��� �Է��ϼ���. >>");
		String name = sc.next();
		
		Student newStudent = new Student(name);
		sList.add(newStudent);
	}
	
	private static void studentList() {
		System.out.println("--------------------------------------------------------");
		System.out.println("2. �л� ���� ��� �� ����");
		System.out.println("--------------------------------------------------------");
		
		for(int i = 0; i < sList.size() ; i++) {
			//�� ���� ��ü�� ��� ������ ����
			Student student = sList.get(i); // 0 ~ 99 ���� ��ü�� account ���� ������ ��´�.
			if(student != null) {
				System.out.print("�̸� : "+student.studentName+"     ");
				System.out.println("�ܾ� : " + student.money+" ��");
			}
		}
	}
	
	private static void TakeBus() {
		System.out.println("������ Ż �л��� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("Ÿ���� ���� ��ȣ�� �Է��ϼ���.");
		int busNo = sc.nextInt();
		Bus bus = findBus(busNo);
		if(bus == null) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
			return;
		}
		
		student.TakeBus(bus);
		
		System.out.println(student.studentName+" ���� " + bus.busName+" �� ������ �����ϴ�. ");
		System.out.println(student.studentName+" ���� ���� ���� "+student.money+" �� �Դϴ�.");
		System.out.print(bus.busName+" �� ������ �°��� "+bus.passengerCount+" �� �̰�, ");
		System.out.println("�� ������ "+bus.money+" �Դϴ�.");
	}
	
	private static void TakeOffBus() {
		System.out.println("�������� ���� �л��� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("�������� ���� ��ȣ�� �Է��ϼ���.");
		int busNo = sc.nextInt();
		Bus bus = findBus(busNo);
		if(bus == null) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
			return;
		}
		
		student.TakeOffBus(bus);
		
		System.out.println(student.studentName+" ���� " + bus.busName+" �� �������� ���Ƚ��ϴ�.");
		System.out.println(student.studentName+" ���� ���� ���� "+student.money+" �� �Դϴ�.");
		System.out.print(bus.busName+" �� ������ �°��� "+bus.passengerCount+" �� �̰�, ");
		System.out.println("�� ������ "+bus.money+" �Դϴ�.");
	}
	
	private static void TakeSubway() {
		System.out.println("������ Ż �л��� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("Ÿ���� ����ö ȣ���� �Է��ϼ���.");
		String subNo = sc.next();
		Subway subway = findSubway(subNo);
		if(subway == null) {
			System.out.println("�ش� ȣ���� �������� �ʽ��ϴ�.");
			return;
		}
		
		student.TakeSubway(subway);
		
		System.out.println(student.studentName+" ���� " + subway.lineNumber+" ȣ�� ����ö�� �����ϴ�. ");
		System.out.println(student.studentName+" ���� ���� ���� "+student.money+" �� �Դϴ�.");
		System.out.print(subway.lineNumber+" �� ����ö�� �°��� "+subway.passengerCount+" �� �̰�, ");
		System.out.println("�� ������ "+subway.money+" �Դϴ�.");
	}
	
	private static void TakeOffSubway() {
		System.out.println("����ö���� ���� �л��� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Student student = findStudent(name);
		if(student == null) {
			System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("�������� ����ö�� ȣ���� �Է��ϼ���.");
		String subNo = sc.next();
		Subway subway = findSubway(subNo);
		if(subway == null) {
			System.out.println("�ش� ȣ���� �������� �ʽ��ϴ�.");
			return;
		}
		
		student.TakeOffSubway(subway);
		
		System.out.println(student.studentName+" ���� " + subway.lineNumber+" ȣ�� ����ö���� ���Ƚ��ϴ�. ");
		System.out.println(student.studentName+" ���� ���� ���� "+student.money+" �� �Դϴ�.");
		System.out.print(subway.lineNumber+" �� ����ö�� �°��� "+subway.passengerCount+" �� �̰�, ");
		System.out.println("�� ������ "+subway.money+" �Դϴ�.");
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
			System.out.println("1. �л���ü ����  |  2. �л����� ��� �� ����  |  3. ���� Ÿ�� | 4. ���� ������ | 5. ��ö Ÿ�� | 6. ��ö ������ | 7. ����");
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = sc.nextInt();
			
			if(selectNO == 1) {
				createStudent(); 	//�޼ҵ� ȣ��
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
		System.out.println("���α׷� ����");
		
	}

}
