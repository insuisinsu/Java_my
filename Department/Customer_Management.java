package Department;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



/*
	상속과 다향성.
	
	백화점의 고객관리 프로그램
	고객 등급 1. Silver  	: 1% 적립, 0% 할인
			2. Gold		: 2% 적립, 5% 할인
			3. VIP		: 5% 적립, 10%할인, 담당에이전트 존재
			
 */

class Customer {
	int customerID;			//고객 ID
	String customerName;	//고객 이름
	String customerGrade;	//고객 등급 (Silver, Gold, VIP)
	double bonusPoint;		//보너스 포인트 값
	double bonusRatio;		//보너스 포인트 적립률 ( 1, 2, 5% )
			
	public String toString () {
		return "    "+customerID+"  " +customerName+"  "+customerGrade+"  "+bonusRatio*100+"%  "+bonusPoint+" 점";
	}
	
	public double calcPrice(int price) {	
//		물품의 가격을 인풋 받아서, 보너스 포인트 적립하는 코드
//		할인률 이 있는 등급은 오버라이드 해서 계산
		bonusPoint = bonusPoint + price*bonusRatio; 
		return price;  //할인된 가격을 리턴
	}
	
//	고객번호 중복방지
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if(this.customerID == ((Customer)obj).customerID) 
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}

//	고객번호 순으로 정렬
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int compare(Customer o1, Customer o2) {
		if(o1.getCustomerID() < o2.getCustomerID()) { 	
			return -1;
		}else if(o1.getCustomerID() == o2.getCustomerID()) {
			return 0;
		}else {
			return 1;
		}
	}

//	고객이름, 등급 불러오기
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	};
	
	

	
	
}

class SilverCustomer extends Customer {

	SilverCustomer(int customerID, String customerName){
		super.customerID = customerID;		
		super.customerName = customerName;
		super.customerGrade	= "Silver";
		super.bonusRatio = 0.01;
	}
}

class GoldCustomer extends Customer {
	double saleRatio;	//물품 할인률
	GoldCustomer(int customerID, String customerName){
		super.customerID = customerID;		
		super.customerName = customerName;
		super.customerGrade	= "Gold";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.05;
	}
	
	@Override
	public double calcPrice(int price) {
		bonusPoint = bonusPoint + price*bonusRatio;
		return price - price*saleRatio;
	}
	
}

class VIPCustomer extends Customer {
	private int agentID;		//생성자 또는 setter 로 접근 가능, 필드X
	double saleRatio;	//물품 할인률
	VIPCustomer(int customerID, String customerName, int agentID){
		super.customerID = customerID;		
		super.customerName = customerName;
		super.customerGrade	= "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
//	에이전트ID 불러오기
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}


	@Override
	public String toString() {
		return "    "+customerID+"  " +customerName+"  "+customerGrade+"  "+bonusRatio*100+"%" + bonusPoint + " 에이전트ID : "+agentID;
	}
	
	@Override
	public double calcPrice(int price) {
		bonusPoint = bonusPoint + price*bonusRatio;
		return price - price*saleRatio;
	}
}



public class Customer_Management {

	public static void main(String[] args) {

		Set<Customer> customerList = new HashSet();
		Scanner sc = new Scanner(System.in);
		SilverCustomer silver = new SilverCustomer(0, null);
		GoldCustomer gold = new GoldCustomer(0, null);
		VIPCustomer vip = new VIPCustomer(0, null, 0);
		
		int id;
		String name;
		
		
		boolean run = true; 
		while (run) {
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("1. 일반고객 등록 | 2. Gold 고객등록 | 3. VIP 고객 등록 | 4. 정보 출력 | 5. 물품구매 | 6. 종료 ");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("선택>>");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("일반고객 등록");
				System.out.println("고객번호를 입력하세요. >>");
				id = sc.nextInt();
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				customerList.add(new SilverCustomer(id, name));
			}else if (selectNO == 2) {
				System.out.println("Gold 고객 등록");
				System.out.println("고객번호를 입력하세요. >>");
				gold.setCustomerID(sc.nextInt());
				System.out.println("이름을 입력하세요.");
				gold.setCustomerName(sc.next());
				customerList.add(gold);
			}else if (selectNO == 3) {
				System.out.println("VIP 고객 등록");
				System.out.println("고객번호를 입력하세요. >>");
				vip.setCustomerID(sc.nextInt());
				System.out.println("이름을 입력하세요.");
				vip.setCustomerName(sc.next());
				System.out.println("담당직원의 ID를 입력하세요.");
				vip.setAgentID(sc.nextInt());
				customerList.add(vip);
			}else if (selectNO == 4) {
				System.out.println("고객 ID  | 고객 이름 | 고객 등급 | 보너스 포인트 비율 | 에이전트ID(VIP전용)");
				for(Customer k : customerList) {
					System.out.println(k);
				}
			}else if (selectNO == 5) {
				System.out.println("물품 가격을 지불해주세요.");
				System.out.println("구매하시는 고객님의 고객번호를 입력하세요.");
				int customerID = sc.nextInt();
				System.out.println("구매 물품의 가격을 입력하세요.");
				int price = sc.nextInt();
				if(customerID == silver.getCustomerID()) {
					silver.calcPrice(price);
					System.out.println(silver.getCustomerName() + " 고객님은 "+price+" 원 지불하셨습니다.");
					System.out.print(silver.getCustomerName() + " 고객님의 등급은  "+silver.getCustomerGrade()+" 이고, ");
					System.out.println("현재 포인트는 "+silver.bonusPoint+" 입니다.");
					
				}else if (customerID == gold.getCustomerID()) {
					System.out.println(gold.getCustomerName() + " 고객님은 "+gold.calcPrice(price)+" 원 지불하셨습니다.");
					System.out.print(gold.getCustomerName() + " 고객님의 등급은  "+gold.getCustomerGrade()+" 이고, ");
					System.out.println("현재 포인트는 "+gold.bonusPoint+" 이고, "+price*gold.saleRatio+" 원 할인되었습니다.");
				}else if (customerID == vip.getCustomerID()){
					System.out.println(vip.getCustomerName() + " 고객님은 "+vip.calcPrice(price)+" 원 지불하셨습니다.");
					System.out.print(vip.getCustomerName() + " 고객님의 등급은  "+vip.getCustomerGrade()+" 이고, ");
					System.out.println("현재 포인트는 "+vip.bonusPoint+" 이고, "+price*vip.saleRatio+" 원 할인되었습니다.");
				}else {
					System.out.println("일치하는 고객 번호를 찾을 수 없습니다.");
				}
				
				
			}else if (selectNO == 6) {
				run = false; 
			}
			
		}
		sc.close(); 
		System.out.println("프로그램 종료");
		
		
	}

}
