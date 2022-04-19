package fruit_ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 	��ȭ���� �� ���� ���α׷�.  (��Ӱ� ������) 
	
 	�� ��� : 1. �Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����), ���η�(����) , 
 			 2. Gold �� : ���ʽ�����Ʈ(2%����), ���η�(5%)
 			 3. VIP �� : ���ʽ�����Ʈ(5%����), ���η�(10%), ��翡�����尡 ���� 
 */
class Customer{		//�Ϲݰ� (Silver)
	int customerID; 		//�� ID 
	String customerName	;	//�� �̸� 
	String customerGrade; 	//����� ( "Silver", "Gold", "VIP" ) 
	double bounsPoint; 		//���ʽ� ����Ʈ �� : 
	double bonusRatio; 		//���ʽ� ����Ʈ ������ : " Silver: 1%, Gold : 2%, VIP : 5% "
	double saleRatio; 
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade : Silver , bonusRatio : 1%
	
	
	public double calcPrice(int price) {			//<<���� Ŭ�������� �������̵� �ؼ� ó�� >>
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ� 
		bounsPoint += price * bonusRatio;
		return price; 	//���ε� ������ ���Ͻ��� �ش�.
	
	}
	
	
}
class GoldCustomer extends Customer{
	double bonusRatio; 	//��ǰ ������ : �����ڿ��� �⺻���� : 5% 
	
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
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : Gold , bonusRatio : 2%, saleRatio : 5%	
	
	
}
class VIPCustomer extends Customer{
	private int agentID; 	// ������, setter , �ʵ�(X)
	double bonusRatio;//��ǰ ���η� : 10% 
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : VIP , bonusRatio : 5%, saleRatio : 10%
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
			// �� ID (customerID) : �ߺ����� �ʵ��� ó��
		
		
		/*
		
		======================================================================
		1. �Ϲݰ� ���	|   2. VIP �����   |  3. Gold �� ���   |  4. ���� ���    5. ��ǰ����  5. ���� 
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
			
			System.out.println("=========================================================================================\r\n" + "1. �Ϲݰ� ���	|  2. VIP �����  |  3. Gold �����  |  4. ���� ���  |  5. ��ǰ����  | 6. ���� \r\n" + "=========================================================================================");
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("==�Ϲݰ� ��� �Դϴ�. ==");
				System.out.print("�� ���̵� : ");
				customer.customerID = sc.nextInt();
				System.out.print("���̸� : ");
				customer.customerName = sc.next();
				customerList.add(customer);
			} else if(num == 2) {
				System.out.println("==VIP �� ��� �Դϴ�. ==");
				System.out.print("�� ���̵� : ");
				vipcustomer.customerID = sc.nextInt();
				System.out.print("���̸� : ");
				vipcustomer.customerName = sc.next();
				System.out.println("��翡����Ʈ(ID) ��� : ");
				vipcustomer.setAgentID(sc.nextInt());
				customerList.add(vipcustomer);
			} else if (num == 3) {
				System.out.println("==Gold �� ��� �Դϴ�. ==");
				System.out.print("�� ���̵� : ");
				goldcustomer.customerID = sc.nextInt();
				System.out.print("���̸� : ");
				goldcustomer.customerName = sc.next();
				customerList.add(goldcustomer);
			} else if (num == 4) {
				System.out.println("==���� ���� ����մϴ�. ==");
				System.out.println("�� ID \t " + "  �� �̸� \t" + "����� \t" + "���η� \t" + "���ʽ�����Ʈ���� \t" + "������ƮID<VIP��>");
				for(Customer k : customerList) {
						System.out.println(k.customerID + "\t" + k.customerName  +"\t"+ k.customerGrade + "\t\t" + k.saleRatio  + "\t\t" + k.bonusRatio  + "\t\t"  + vipcustomer.getAgentID());
				}
			} else if (num == 5) {
				System.out.println("==��ǰ������ ������ �ּ��� ==");
				System.out.print("���� ��ǰ ���� : ");
				int price = sc.nextInt();
				for(Customer k : customerList) {
					System.out.println(k.customerName + " ���� " + price + " �� �����ϼ̽��ϴ�.");
					System.out.println(k.customerName + " ������ ����� " + k.customerGrade + " �̰� ���� ����Ʈ�� " + k.bounsPoint + " �̰� ������ " + k.calcPrice(price)*k.saleRatio + " �� �Ǿ����ϴ�. ");
				}
			} else if (num == 6) {
				System.out.println("����");
				break;
			}
			
		}
		
	}

}
