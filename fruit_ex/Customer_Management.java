package fruit_ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
	��ȭ���� �� ���� ���α׷�. (��Ӱ� ������)
	
	�� ��� : 1. �Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����). ���η�(����),
			2. Gold �� : ���ʽ�����Ʈ (2%����), ���η�(5%)
			3. VIP ��: ���ʽ�����Ʈ (5%����). ���η�(10%), ��翡����Ʈ�� ����
 */

class Customer { 	// �Ϲ� �� (Silver)
	int customerID; 		// �� ���̵�
	String customerName; 	// �� �̸�
	String customerGrade = "Silver"; 	// �� ��� ( "Silver", "Gold", "VIP" )
	double bonusPoint;		// ���ʽ� ����Ʈ ��: 
	double bonusRatio = 1.0; 		// ���ʽ� ����Ʈ ������ : Silver: 1%, gold: 2%, Vip: 5%
	
	Customer () {}
	Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	Customer (int customerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
}
	// getter . setter 
	public int getcustomerID() {return customerID;}
	public void setcustomerID(int customerID) {customerID = customerID;}

	public String getCustomerName() {return customerName;}
	public void setCustomerName(String customerName) {this.customerName = customerName;}

	public String getCustomerGrade() {return customerGrade;}
	public void setCustomerGrade(String customerGrade) {this.customerGrade = customerGrade;}

	public double getBonusPoint() {return bonusPoint;}
	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}
	
	public double getBonusRatio() {return bonusRatio;}
	public void setBonusRatio(double bonusRatio) {this.bonusRatio = bonusRatio;}
	
	
	
	// ��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
	public double calcPrice(double price) { 			// ���� Ŭ�������� �������̵��ؼ� ó�� >> 
		
		// �����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε�(customerGrade : Silver, bonusRatio : 1%)
		
		return price; 	// ���ε� ������ ���� 
	}
	@Override
		public String toString() {
			return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
					" ������ : " +  "0" +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + "VIP�� �ƴմϴ�." ; 
		}
	@Override
		public boolean equals(Object obj) {
			if (obj instanceof Customer) {
				if (this.customerID == ((Customer)obj).customerID)
					return true;
			}
			return false;
		}
	@Override
		public int hashCode() {
			return Objects.hash(customerID);
		}
}

class GoldCustomer extends Customer {
	String customerGrade = "Gold";
	double bonusRatio = 2.0; 
	double saleRatio = 5.0; 		// ��ǰ ������:  �����ڿ��� �⺻���� �ε�: 5%
	
	
	GoldCustomer (int customerID, String customerName) {
			super.customerID = customerID;
			super.customerName = customerName;
	}
	
	GoldCustomer (int customerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio
			, double saleRatio) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = customerGrade;
		super.bonusPoint = bonusPoint;
		super.bonusRatio = bonusRatio;
		this.saleRatio = saleRatio;
	}
	
	@Override
	public double calcPrice(double price) {
		return (price * 0.95);
	}
	// �����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�(customerGrade : Gold, bonusRatio : 2%,  saleRatio :5%)
	// super Ű�� ���� �Ҵ�
	
	@Override
	public String toString() {
		return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
				" ������ : " +  saleRatio +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + "VIP�� �ƴմϴ�." ; 
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if (this.customerID == ((Customer)obj).customerID)
				return true;
		}
		return false;
	}
@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}
}

class VipCustomer extends Customer {
	String customerGrade = "Vip";
	double bonusRatio = 5.0;
	double saleRatio = 10.0; 		// ��ǰ ������ : 10%
	private int agentID; 	// ������, setter, (�ʵ��̸����� ���ٺҰ���)
	
	
	
	VipCustomer (int customerID, String customerName, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		this.agentID = agentID;
	}
	
	VipCustomer (int customerID, String customerName, String customerGrade, double bonusPoint, double bonusRatio,
				double saleRatio, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = customerGrade;
		super.bonusPoint = bonusPoint;
		super.bonusRatio = bonusRatio;
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}
	
	@Override
	public double calcPrice(double price) {
		// TODO Auto-generated method stub
		return (price * 0.9);
	}
	// �����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε�(customerGrade : VIP, bonusRatio : 5%,  saleRatio :10%)
	@Override
	public String toString() {
		return "��ID: " + customerID + " ���̸� : " + customerName + " ����� : " +  customerGrade +
				" ������ : " +  saleRatio +  " ���ʽ�����Ʈ���� : "+ bonusRatio + " ������ƮID : " + agentID ; 
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			if (this.customerID == ((Customer)obj).customerID)
				return true;
		}
		return false;
	}
@Override
	public int hashCode() {
		return Objects.hash(customerID);
	}
}


public class Customer_Management {
	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("1. �Ϲݰ� ���  | 2. VIP �����  | 3. Gold �����  | 4. ���� ���  | 5. ��ǰ����  | 6. ����");
			System.out.println("==================================================================================");
			System.out.print("���� >> ");
			int No = sc.nextInt();
			if (No == 1) {
				System.out.println("== �Ϲݰ� ��� �Դϴ�. ==");
				System.out.print("- �� ���̵�: ");
				int customerID = sc.nextInt();
				System.out.print("- �� �̸�: ");
				String customerName = sc.next();
				
				customerList.add(new Customer (customerID, customerName) );
				
			} else if (No == 2) {
				System.out.println("== VIP�� ��� �Դϴ�. ==");
				System.out.print("- �� ���̵�: ");
				int customerID = sc.nextInt();
				System.out.print("- �� �̸�: ");
				String customerName = sc.next();
				System.out.print("- ��翡����Ʈ(ID) ���: ");
				int agentID = sc.nextInt();
				
				customerList.add(new VipCustomer (customerID, customerName, agentID) );
				
			} 	else if (No == 3) {
				System.out.println("== Gold ��� �Դϴ�. ==");
				System.out.print("- �� ���̵�: ");
				int customerID = sc.nextInt();
				System.out.print("- �� �̸�: ");
				String customerName = sc.next();
				
				customerList.add(new GoldCustomer (customerID, customerName) );
			}	else if (No == 4) {
				System.out.println("== �� ���� ����Դϴ�. ==");
				for (Customer k : customerList) {
					System.out.println(k);
				}
			}	else if (No == 5) {
				for (Customer k : customerList) {
					System.out.print("- �� ���̵�: ");
					int customerID = sc.nextInt();
					System.out.println("-- ��ǰ������ ������ �ּ��� ==");
					System.out.print("-- ���� ��ǰ ���� : " );
					double price1 = sc.nextDouble();
					System.out.print("-- ���ε� ����: ");
					System.out.println(k.calcPrice(price1));
					System.out.println(k.customerID + " ���� " + k.calcPrice(price1) + "�� �����ϼ̽��ϴ�.");
					System.out.println(k.customerID + " ������ ����� " + k.customerGrade + " �̰� ���� ����Ʈ�� " + k.bonusPoint + " �̰� ������ "
						+ (price1 - k.calcPrice(price1)) + " �� �Ǿ����ϴ�.");
				} 
				
			}	else if (No == 6) {
				break;
			}	else {
				System.out.println(" 1~6������ ���ڸ� �Է����ּ���");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		/*
		
		======================================================================
		1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  5. ���� 
		======================================================================
		���� >> 1
		==�Ϲݰ� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>2
		==VIP �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 
		��翡����Ʈ(ID) ��� : 

		���� >>3
		==Gold �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>4
		==�� ���� ���  �Դϴ�. ==
		��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>



		���� >>5
		==��ǰ������ ������ �ּ��� ==
		���� ��ǰ ���� :  

		000 ���� 000 �� ���� �ϼ̽��ϴ�. 
		000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

		*/
		
		
	}
}
