package Cooperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import Chap17.Ex13.Account;

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
		this.money = 100000;
	}
	
//	�ټ�
	public String getStudentName() {return studentName;}
	public void setStudentName(String studentName) {this.studentName = studentName;}
	int getMoney() {return money;}
	void setMoney(int money) {this.money = money;}

	//	���
	public void takeBus(Bus bus) {		//�л��� ������ ���� �� ,, ������ ���� ������
		
		money = 100000;
		bus.take(1000);
		money -= 1000;
	}
	public void takeOutBus(Bus bus) {	//�л��� �������� ����
		bus.takeOut();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
	}
	public void takeOutSubway(Subway subway) {
		subway.takeOut();
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return studentName + "     "+ money + " ��";
	}
	
}

class Bus {
	int busName;			//100 �� ����, 200 �� ����	<- �����ڷ� ��ǲ�� �޾Ƽ� �̸� ���ϱ�
	int passengerCount;		//�°���
	int money;				//������ ����

//	�ټ�
	public int getBusName() {return busName;}
	public void setBusName(int busName) {this.busName = busName;}
	public int getPassengerCount() {return passengerCount;}
	public void setPassengerCount(int passengerCount) {this.passengerCount = passengerCount;}
	public int getMoney() {return money;}
	public void setMoney(int money) {this.money = money;}
	
	Bus(int busName){
		this.busName = busName;
	}
	
	public void take(int money) {	//������ ���� ����, �°��� ����		//������ ������ money�� passengerCount ������Ű�� �ɵ�
		this.money += money;
		passengerCount += 1;
	}
	public void takeOut() {		//������ �״��, �°��� ����
		
	}
	
}

class Subway {
	String lineNumber;		//1ȣ��	<- �����ڷ� ��ǲ�� �޾Ƽ� �̸� ���ϱ�
	int passengerCount;		//�°���
	int money;				//����ö�� ����
	
//	�ټ�	
	public String getLineNumber() {return lineNumber;}
	public void setLineNumber(String lineNumber) {this.lineNumber = lineNumber;}
	public int getPassengerCount() {return passengerCount;}
	public void setPassengerCount(int passengerCount) {this.passengerCount = passengerCount;}
	public int getMoney() {return money;}
	public void setMoney(int money) {this.money = money;}

	Subway(String lineNumber){
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {	//����ö�� ���� ����, �°��� ����		//������ ������ money�� passengerCount ������Ű�� �ɵ�
		
	}
	public void takeOut() {		//������ �״��, �°��� ����
		
	}
}


public class CooperationBetweenObject {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList();
		ArrayList<Bus> busList = new ArrayList();
		ArrayList<Subway> subwayList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Student student = new Student(null);
		Bus bus = new Bus(0);
		Subway subway = new Subway(null);
		
//		���� �� ����ö ��ü ����
		busList.add(new Bus(1));
		busList.add(new Bus(2));
		busList.add(new Bus(3));
		busList.add(new Bus(4));
		busList.add(new Bus(5));
		subwayList.add(new Subway("1"));
		subwayList.add(new Subway("2"));
		subwayList.add(new Subway("3"));
		subwayList.add(new Subway("4"));
		subwayList.add(new Subway("5"));
		
		String name;
		int busNo;
		String subNo;
		
		boolean run = true; 
		while (run) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ���� | 3. ������ Ž | 4. ������ ���� | 5. ����ö�� Ž | 6. ����ö�� ���� | 7. ���� �� ����ö ��� | 8. ����");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("1. �л���ü ����");
				System.out.println("�л��� �̸��� �Է��ϼ���. >>");
				studentList.add(new Student(sc.next()));
				
			}else if (selectNO == 2) {
				System.out.println("�л��̸� | ���� ��");
				for(Student k : studentList) {
					System.out.println(k);
				}
				
			}else if (selectNO == 3) {
				
			}else if (selectNO == 4) {
				
			}else if (selectNO == 5) {
				System.out.println("��ǰ ������ �������ּ���.");
				System.out.println("�����Ͻô� ������ ����ȣ�� �Է��ϼ���.");
				
			}else if (selectNO == 6) {

			}else if (selectNO == 7) {
				run = false; 
			}
			
		}
		sc.close(); 
		System.out.println("���α׷� ����");
		
		/*
		�л� 5�� �Է� : �л��� 100,000���� �ʱⰪ �Ҵ�. 
		=============================================
		1. �л���ü ����  | 2. �л����� ��� �� ����  
		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����  
		=============================================
		����>> 1
		�л��̸�  : 
		 �� �Է�   : 

		����>> 2 
		=====�л����� ���=====
		�л��̸�	������



		�л�����(�̸��Է�)>> 

		//�л� ������ ���Ķ� �����ؼ� �ؾ��ϳ�?

		����>> 3
		// �� �� ���� ������ ����
		
		000 �� 000 �� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		���� 000���� �°��� 000���̰� ������000 �Դϴ�. 

		����>> 4
		000 �� 000 �� ������ ���Ƚ��ϴ�. �¹���~~~. 
		000 ���� �������� 000 �Դϴ�. 
		���� 00���� �°��� 000���̰� ������ 000 �Դϴ�. 

		����>> 5
		000 �� 000 ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. 
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 

		����>> 6
		000 �� 000 ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~
		000 ���� �������� 000 �Դϴ�. 
		����ö 00 ȣ���� �°��� 00���̰� ������  000 �Դϴ�. 
		*/ 

		
		
		
		
		
		
		
		
	}

}
