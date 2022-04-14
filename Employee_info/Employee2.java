package Employee_info;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Employee 객체를 TreeSet에 저장. 
// TreeSet 에 일반객체를 넣을때 어떤 컬럼을 정렬할지를 지정. Comparable<E>,  Comparator<E> 
// compare() 재정의 필요
// Employee 객체를 수정하지 않고. empNo 를 기준으로 오름차순 정리 

public class Employee2 {
	
	private static TreeSet<Employee> tSet = new TreeSet<Employee>(new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			if(o1.getEmpNo() < o2.getEmpNo()) { 		//내림차순 정렬처리
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
		//배열 객체에 저장. 
		System.out.println("---------------------------------");
		System.out.println("1. 사원정보 신규등록");
		System.out.println("---------------------------------");
		System.out.println("사원번호를 입력하세요. >>");
		int empNo = sc.nextInt();  
		System.out.println("이름을 입력 하세요. >>");
		String empName = sc.next(); 
		System.out.println("연락처를 입력하세요. >>");
		String phone = sc.next(); 
		System.out.println("나이를 입력하세요. >>");
		int age = sc.nextInt(); 
		System.out.println("부서를 입력하세요. >>");
		String dept = sc.next(); 
		System.out.println("직급을 입력하세요. >>");
		String compRank = sc.next(); 
		
		//각 필드의 정보를 사용자로 부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장. 
		Employee newEmployee = new Employee(empNo, empName, phone, age, dept, compRank);    //생성자를 통해서 객체에 필드값적용후 객체 생성. 
			  
		tSet.add(newEmployee) ;   
		System.out.println(empName + " 님의 정보가 정상적으로 입력되었습니다.");
			 		
	}
	
	private static void employeeList() {
		//배열의 각 방을 순회 하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력. 
		System.out.println("---------------------------------");
		System.out.println("2. 사원정보 출력");
		System.out.println("---------------------------------");
		System.out.println("사번"+"		"+"이름"+"		"+"연락처"+"		"+"나이"+"		"+"부서"+"		"+"직급");
		//배열의 각방의 null아닌 경우 , 객체의 필드의 값을 출력. 
		Iterator<Employee> ir = tSet.iterator();
		while(ir.hasNext()) {
			Employee employee = ir.next();    // 0 ~ 99 방의 객체를 account 참조 변수에 담는다. 
			if (employee != null) {    //각 방의 값이 null이 아닐 경우만 객체정보를 가져와서 출력. 
				
				System.out.println(employee.getEmpNo()+" 	"+employee.getEmpName()+" 	"+employee.getPhone()+" 	"+employee.getAge()+" 	"+
						employee.getDept()+" 	"+employee.getCompRank());
			}
		}	
	}
	
	
	private static void searchEmpoyee() {
		//1. 사용자로 부터 수정할 사번을 받아야 한다. 
		//2. 사용자로 받은 사번을 배열에 저장된 객체내의 사번 확인후
		//3. 수정할 필드를 선택 받고 수정값을 받아서 저장
		
		System.out.println("---------------------------------");
		System.out.println("3.사원정보 수정");
		System.out.println("---------------------------------");
		System.out.println("수정할 사번 >>");
		int no = sc.nextInt(); 
		
		//해당 사번을 배열에서 찾아서 찾은 객체를 받아온다. 
		Employee Employee = findEmployee(no);     
		
		if (Employee == null) {
			System.out.println("결과 : 해당 사번이 존재하지 않습니다. ");
			return;    
		}
		
		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("수정할 필드 선택[1.연락처, 2.나이, 3.부서, 4.직급] >>");
			System.out.println("-----------------------------------------------");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("수정할 연락처를 입력하세요. >>");
				Employee.setPhone(sc.next());
			}else if (selectNO == 2) {
				System.out.println("수정할 나이를 입력하세요. >>");
				Employee.setAge(sc.nextInt());
			}else if (selectNO == 3) {
				System.out.println("수정할 부서를 입력하세요. >>");
				Employee.setDept(sc.next());
			}else if (selectNO == 4) {
				System.out.println("수정할 직급을 입력하세요. >>");
				Employee.setCompRank(sc.next());
			}
			run = false;
		}
		System.out.println("수정사항이 저장되었습니다.");
	}
	
	
	
	private static void deleteEmployee() {
		
		System.out.println("---------------------------------");
		System.out.println("4.사원정보 삭제");
		System.out.println("---------------------------------");
		System.out.println("삭제할 사번 >>");
		int no = sc.nextInt();
		
		//해당 사원을 배열에서 찾아서 찾은 객체를 받아온다. 
		Employee Employee = findEmployee(no);
		
		if (Employee == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.  ");
			return;    
		}
		tSet.remove(Employee);
		
		System.out.println(Employee.getEmpName()+" 님 의 정보가 삭제되었습니다.");
	}

	
	
	//배열에서 Employee 객체 내의 empNo 와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌. 
	//수정, 삭제할때 공통코드 , 여러 메소드에서 중복 사용 될때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어 준다. 
	private static Employee findEmployee(int empNo) {
		Employee Employee = null ; 
		Iterator<Employee> ir = tSet.iterator();
		
		while(ir.hasNext()) {
			Employee a1 = ir.next();
			int dbEmpNo = a1.getEmpNo(); //배열의 각 방에 저장된 객체의 ano를 dbAno 변수에 할당. 
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
			System.out.println("1.사원정보 신규등록 | 2.사원정보 보기 | 3.사원정보 수정 | 4.사원정보 삭제 | 5.종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("선택>>");
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
		System.out.println("프로그램 종료");
		
		

	}

}
