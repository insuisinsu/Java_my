package Employee_info;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Employee ��ü�� TreeSet�� ����. 
// TreeSet �� �Ϲݰ�ü�� ������ � �÷��� ���������� ����. Comparable<E>,  Comparator<E> 
// compare() ������ �ʿ�
// Employee ��ü�� �������� �ʰ�. empNo �� �������� �������� ���� 

public class Employee2 {
	
	private static TreeSet<Employee> tSet = new TreeSet<Employee>(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if(o1.getEmpNo() < o2.getEmpNo()) { 		//�������� ����ó��
				return -1;
			}else if(o1.getEmpNo() == o2.getEmpNo()) {
				return 0;
			}else {
				return 1;
			}
		};
	});
	private static Scanner sc = new Scanner(System.in); 
	
	private static void createEmployee() {
		//�迭 ��ü�� ����. 
		System.out.println("---------------------------------");
		System.out.println("1. ������� �űԵ��");
		System.out.println("---------------------------------");
		System.out.println("�����ȣ�� �Է��ϼ���. >>");
		int empNo = sc.nextInt();  
		System.out.println("�̸��� �Է� �ϼ���. >>");
		String empName = sc.next(); 
		System.out.println("����ó�� �Է��ϼ���. >>");
		String phone = sc.next(); 
		System.out.println("���̸� �Է��ϼ���. >>");
		int age = sc.nextInt(); 
		System.out.println("�μ��� �Է��ϼ���. >>");
		String dept = sc.next(); 
		System.out.println("������ �Է��ϼ���. >>");
		String compRank = sc.next(); 
		
		//�� �ʵ��� ������ ����ڷ� ���� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����. 
		Employee newEmployee = new Employee(empNo, empName, phone, age, dept, compRank);    //�����ڸ� ���ؼ� ��ü�� �ʵ尪������ ��ü ����. 
			  
		tSet.add(newEmployee) ;   
		System.out.println(empName + " ���� ������ ���������� �ԷµǾ����ϴ�.");
			 		
	}
	
	private static void employeeList() {
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���. 
		System.out.println("---------------------------------");
		System.out.println("2. ������� ���");
		System.out.println("---------------------------------");
		System.out.println("���"+"		"+"�̸�"+"		"+"����ó"+"		"+"����"+"		"+"�μ�"+"		"+"����");
		//�迭�� ������ null�ƴ� ��� , ��ü�� �ʵ��� ���� ���. 
		Iterator<Employee> ir = tSet.iterator();
		while(ir.hasNext()) {
			Employee employee = ir.next();    // 0 ~ 99 ���� ��ü�� account ���� ������ ��´�. 
			if (employee != null) {    //�� ���� ���� null�� �ƴ� ��츸 ��ü������ �����ͼ� ���. 
				
				System.out.println(employee.getEmpNo()+" 	"+employee.getEmpName()+" 	"+employee.getPhone()+" 	"+employee.getAge()+" 	"+
						employee.getDept()+" 	"+employee.getCompRank());
			}
		}	
	}
	
	
	private static void searchEmpoyee() {
		//1. ����ڷ� ���� ������ ����� �޾ƾ� �Ѵ�. 
		//2. ����ڷ� ���� ����� �迭�� ����� ��ü���� ��� Ȯ����
		//3. ������ �ʵ带 ���� �ް� �������� �޾Ƽ� ����
		
		System.out.println("---------------------------------");
		System.out.println("3.������� ����");
		System.out.println("---------------------------------");
		System.out.println("������ ��� >>");
		int no = sc.nextInt(); 
		
		//�ش� ����� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�. 
		Employee Employee = findEmployee(no);     
		
		if (Employee == null) {
			System.out.println("��� : �ش� ����� �������� �ʽ��ϴ�. ");
			return;    
		}
		
		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("������ �ʵ� ����[1.����ó, 2.����, 3.�μ�, 4.����] >>");
			System.out.println("-----------------------------------------------");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("������ ����ó�� �Է��ϼ���. >>");
				Employee.setPhone(sc.next());
			}else if (selectNO == 2) {
				System.out.println("������ ���̸� �Է��ϼ���. >>");
				Employee.setAge(sc.nextInt());
			}else if (selectNO == 3) {
				System.out.println("������ �μ��� �Է��ϼ���. >>");
				Employee.setDept(sc.next());
			}else if (selectNO == 4) {
				System.out.println("������ ������ �Է��ϼ���. >>");
				Employee.setCompRank(sc.next());
			}
			run = false;
		}
		System.out.println("���������� ����Ǿ����ϴ�.");
	}
	
	
	
	private static void deleteEmployee() {
		
		System.out.println("---------------------------------");
		System.out.println("4.������� ����");
		System.out.println("---------------------------------");
		System.out.println("������ ��� >>");
		int no = sc.nextInt();
		
		//�ش� ����� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�. 
		Employee Employee = findEmployee(no);
		
		if (Employee == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.  ");
			return;    
		}
		tSet.remove(Employee);
		
		System.out.println(Employee.getEmpName()+" �� �� ������ �����Ǿ����ϴ�.");
	}

	
	
	//�迭���� Employee ��ü ���� empNo �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������. 
	//����, �����Ҷ� �����ڵ� , ���� �޼ҵ忡�� �ߺ� ��� �ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�. 
	private static Employee findEmployee(int empNo) {
		Employee Employee = null ; 
		Iterator<Employee> ir = tSet.iterator();
		
		while(ir.hasNext()) {
			Employee a1 = ir.next();
			int dbEmpNo = a1.getEmpNo(); //�迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�. 
			if (dbEmpNo == empNo) {	
				Employee = a1; 
				return Employee;
			}	
		}
			return Employee; 
	}
	
	
	

	public static void main(String[] args) {
		
		

		boolean run = true; 
		while (run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1.������� �űԵ�� | 2.������� ���� | 3.������� ���� | 4.������� ���� | 5.����");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				createEmployee() ; 	 
			}else if (selectNO == 2) {
				employeeList(); 
			}else if (selectNO == 3) {
				searchEmpoyee(); 
			}else if (selectNO == 4) {
				deleteEmployee(); 
			}else if (selectNO == 5) {
				run = false; 
			}
			
		}
		sc.close(); 
		System.out.println("���α׷� ����");
		
		

	}

}
