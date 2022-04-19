package fruit_ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 	백화점의 고객 관리 프로그램.  (상속과 다형성) 
	
 	고객 등급 : 1. 일반고객(silver) : 보너스포인트(1%적립), 할인률(없음) , 
 			 2. Gold 고객 : 보너스포인트(2%적립), 할인률(5%)
 			 3. VIP 고객 : 보너스포인트(5%적립), 할인률(10%), 담당에이젼드가 존재 
 */
class Customer{		//일반고객 (Silver)
	int customerID; 		//고객 ID 
	String customerName	;	//고객 이름 
	String customerGrade; 	//고객등급 ( "Silver", "Gold", "VIP" ) 
	double bounsPoint; 		//보너스 포인트 값 : 
	double bonusRatio; 		//보너스 포인트 적립율 : " Silver: 1%, Gold : 2%, VIP : 5% "
	double saleRatio; 
	//생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade : Silver , bonusRatio : 1%
	
	
	public double calcPrice(int price) {			//<<하위 클래스에서 오버라이딩 해서 처리 >>
		//물품의 가격을 받아서 보너스 포인트를 적립하는 코드 
		bounsPoint += price * bonusRatio;
		return price; 	//할인된 가격을 리턴시켜 준다.
	
	}
	
	
}
class GoldCustomer extends Customer{
	double bonusRatio; 	//물품 할인율 : 생성자에서 기본으로 : 5% 
	
	void GoldCustomer(int customerID, String customerName, double saleRatio ) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.saleRatio = saleRatio;
	}
	
	@Override
	public double calcPrice(int price) {
		
		bounsPoint += price * bonusRatio;
		return super.calcPrice(price);
	}
	//생성자에서 기본으로 3개의 필드의 값을 로드 : customerGrade : Gold , bonusRatio : 2%, saleRatio : 5%	
	
	
}
class VIPCustomer extends Customer{
	private int agentID; 	// 생성자, setter , 필드(X)
	double bonusRatio;//물품 할인률 : 10% 
	
	//생성자에서 기본으로 3개의 필드의 값을 로드 : customerGrade : VIP , bonusRatio : 5%, saleRatio : 10%
	void VIPCustomer(int customerID, String customerName, double saleRatio) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.saleRatio = saleRatio;
	}
	
	
	public int getAgentID() {
		return agentID;
	}


	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}



	@Override
	public double calcPrice(int price) {
		bounsPoint += price * bonusRatio;
		return super.calcPrice(price);
	}
	
}


public class Customer_Management {
	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet<>(); 
		Scanner sc = new Scanner(System.in);
			// 고객 ID (customerID) : 중복되지 않도록 처리
		
		
		/*
		
		======================================================================
		1. 일반고객 등록	|   2. VIP 고객등록   |  3. Gold 고객 등록   |  4. 정보 출력    5. 물품구매  5. 종료 
		======================================================================
		선택 >> 1
		==일반고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>2
		==VIP 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 
		담당에이젼트(ID) 등록 : 

		선택 >>3
		==Gold 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>4
		==고객 정보 출력  입니다. ==
		고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>



		선택 >>5
		==물품가격을 지불해 주세요 ==
		구매 물품 가격 :  

		000 고객님 000 원 지불 하셨습니다. 
		000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 

		*/
		
		Customer customer = new Customer();
		GoldCustomer goldcustomer = new GoldCustomer();
		VIPCustomer vipcustomer = new VIPCustomer();
		
		customer.customerGrade = "Silver";
		goldcustomer.customerGrade = "Gold";
		vipcustomer.customerGrade = "VIP";
		
		customer.saleRatio = 0.0;
		goldcustomer.saleRatio = 0.05;
		vipcustomer.saleRatio = 0.1;
		
		customer.bonusRatio = 0.01;
		goldcustomer.bonusRatio = 0.02;
		vipcustomer.bonusRatio = 0.05;
		
		boolean boo = true;
		
		while (boo) {
			
			System.out.println("=========================================================================================\r\n" + "1. 일반고객 등록	|  2. VIP 고객등록  |  3. Gold 고객등록  |  4. 정보 출력  |  5. 물품구매  | 6. 종료 \r\n" + "=========================================================================================");
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("==일반고객 등록 입니다. ==");
				System.out.print("고객 아이디 : ");
				customer.customerID = sc.nextInt();
				System.out.print("고객이름 : ");
				customer.customerName = sc.next();
				customerList.add(customer);
			} else if(num == 2) {
				System.out.println("==VIP 고객 등록 입니다. ==");
				System.out.print("고객 아이디 : ");
				vipcustomer.customerID = sc.nextInt();
				System.out.print("고객이름 : ");
				vipcustomer.customerName = sc.next();
				System.out.println("담당에이젼트(ID) 등록 : ");
				vipcustomer.setAgentID(sc.nextInt());
				customerList.add(vipcustomer);
			} else if (num == 3) {
				System.out.println("==Gold 고객 등록 입니다. ==");
				System.out.print("고객 아이디 : ");
				goldcustomer.customerID = sc.nextInt();
				System.out.print("고객이름 : ");
				goldcustomer.customerName = sc.next();
				customerList.add(goldcustomer);
			} else if (num == 4) {
				System.out.println("==고객님 정보 출력합니다. ==");
				System.out.println("고객 ID \t " + "  고객 이름 \t" + "고객등급 \t" + "할인률 \t" + "보너스포인트비율 \t" + "에이젼트ID<VIP고객>");
				for(Customer k : customerList) {
						System.out.println(k.customerID + "\t" + k.customerName  +"\t"+ k.customerGrade + "\t\t" + k.saleRatio  + "\t\t" + k.bonusRatio  + "\t\t"  + vipcustomer.getAgentID());
				}
			} else if (num == 5) {
				System.out.println("==물품가격을 지불해 주세요 ==");
				System.out.print("구매 물품 가격 : ");
				int price = sc.nextInt();
				for(Customer k : customerList) {
					System.out.println(k.customerName + " 고객님 " + price + " 원 지불하셨습니다.");
					System.out.println(k.customerName + " 고객님의 등급은 " + k.customerGrade + " 이고 현재 포인트는 " + k.bounsPoint + " 이고 할인은 " + k.calcPrice(price)*k.saleRatio + " 원 되었습니다. ");
				}
			} else if (num == 6) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}

}
