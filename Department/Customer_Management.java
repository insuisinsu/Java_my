package Department;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



/*
	��Ӱ� ���⼺.
	
	��ȭ���� ������ ���α׷�
	�� ��� 1. Silver  	: 1% ����, 0% ����
			2. Gold		: 2% ����, 5% ����
			3. VIP		: 5% ����, 10%����, ��翡����Ʈ ����
			
 */

class Customer {
	int customerID;			//�� ID
	String customerName;	//�� �̸�
	String customerGrade;	//�� ��� (Silver, Gold, VIP)
	double bonusPoint;		//���ʽ� ����Ʈ ��
	double bonusRatio;		//���ʽ� ����Ʈ ������ ( 1, 2, 5% )
			
	public String toString () {
		return "    "+customerID+"  " +customerName+"  "+customerGrade+"  "+bonusRatio*100+"%  "+bonusPoint+" ��";
	}
	
	public double calcPrice(int price) {	
//		��ǰ�� ������ ��ǲ �޾Ƽ�, ���ʽ� ����Ʈ �����ϴ� �ڵ�
//		���η� �� �ִ� ����� �������̵� �ؼ� ���
		bonusPoint = bonusPoint + price*bonusRatio; 
		return price;  //���ε� ������ ����
	}
	
//	����ȣ �ߺ�����
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

//	����ȣ ������ ����
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

//	���̸�, ��� �ҷ�����
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
	double saleRatio;	//��ǰ ���η�
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
	private int agentID;		//������ �Ǵ� setter �� ���� ����, �ʵ�X
	double saleRatio;	//��ǰ ���η�
	VIPCustomer(int customerID, String customerName, int agentID){
		super.customerID = customerID;		
		super.customerName = customerName;
		super.customerGrade	= "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
//	������ƮID �ҷ�����
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}


	@Override
	public String toString() {
		return "    "+customerID+"  " +customerName+"  "+customerGrade+"  "+bonusRatio*100+"%" + bonusPoint + " ������ƮID : "+agentID;
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
			System.out.println("1. �Ϲݰ� ��� | 2. Gold ����� | 3. VIP �� ��� | 4. ���� ��� | 5. ��ǰ���� | 6. ���� ");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("�Ϲݰ� ���");
				System.out.println("����ȣ�� �Է��ϼ���. >>");
				id = sc.nextInt();
				System.out.println("�̸��� �Է��ϼ���.");
				name = sc.next();
				customerList.add(new SilverCustomer(id, name));
			}else if (selectNO == 2) {
				System.out.println("Gold �� ���");
				System.out.println("����ȣ�� �Է��ϼ���. >>");
				gold.setCustomerID(sc.nextInt());
				System.out.println("�̸��� �Է��ϼ���.");
				gold.setCustomerName(sc.next());
				customerList.add(gold);
			}else if (selectNO == 3) {
				System.out.println("VIP �� ���");
				System.out.println("����ȣ�� �Է��ϼ���. >>");
				vip.setCustomerID(sc.nextInt());
				System.out.println("�̸��� �Է��ϼ���.");
				vip.setCustomerName(sc.next());
				System.out.println("��������� ID�� �Է��ϼ���.");
				vip.setAgentID(sc.nextInt());
				customerList.add(vip);
			}else if (selectNO == 4) {
				System.out.println("�� ID  | �� �̸� | �� ��� | ���ʽ� ����Ʈ ���� | ������ƮID(VIP����)");
				for(Customer k : customerList) {
					System.out.println(k);
				}
			}else if (selectNO == 5) {
				System.out.println("��ǰ ������ �������ּ���.");
				System.out.println("�����Ͻô� ������ ����ȣ�� �Է��ϼ���.");
				int customerID = sc.nextInt();
				System.out.println("���� ��ǰ�� ������ �Է��ϼ���.");
				int price = sc.nextInt();
				if(customerID == silver.getCustomerID()) {
					silver.calcPrice(price);
					System.out.println(silver.getCustomerName() + " ������ "+price+" �� �����ϼ̽��ϴ�.");
					System.out.print(silver.getCustomerName() + " ������ �����  "+silver.getCustomerGrade()+" �̰�, ");
					System.out.println("���� ����Ʈ�� "+silver.bonusPoint+" �Դϴ�.");
					
				}else if (customerID == gold.getCustomerID()) {
					System.out.println(gold.getCustomerName() + " ������ "+gold.calcPrice(price)+" �� �����ϼ̽��ϴ�.");
					System.out.print(gold.getCustomerName() + " ������ �����  "+gold.getCustomerGrade()+" �̰�, ");
					System.out.println("���� ����Ʈ�� "+gold.bonusPoint+" �̰�, "+price*gold.saleRatio+" �� ���εǾ����ϴ�.");
				}else if (customerID == vip.getCustomerID()){
					System.out.println(vip.getCustomerName() + " ������ "+vip.calcPrice(price)+" �� �����ϼ̽��ϴ�.");
					System.out.print(vip.getCustomerName() + " ������ �����  "+vip.getCustomerGrade()+" �̰�, ");
					System.out.println("���� ����Ʈ�� "+vip.bonusPoint+" �̰�, "+price*vip.saleRatio+" �� ���εǾ����ϴ�.");
				}else {
					System.out.println("��ġ�ϴ� �� ��ȣ�� ã�� �� �����ϴ�.");
				}
				
				
			}else if (selectNO == 6) {
				run = false; 
			}
			
		}
		sc.close(); 
		System.out.println("���α׷� ����");
		
		
	}

}
