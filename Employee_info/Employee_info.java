package Employee_info;

import java.util.Objects;
import java.util.Arrays;
import java.util.Scanner;

class Employee{			//사원의 정보를 담은 클래스
	int empNo;			//사원번호
	String empName;		//사원이름
	String phone;		//전화번호
	int age;			//나이
	String dept;		//부서
	String compRank; 	//직급
	
	Employee(int empNo, String empName, String phone, int age, String dept, String compRank){
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	
	@Override
		public boolean equals(Object obj) {
			if (obj instanceof Employee) {
				if(this.empNo == ((Employee)obj).empNo) 
					return true;
			}
			return false;
		}
	@Override
		public int hashCode() {
			return Objects.hash(empNo);
		}
	
	
	
	
	
}

