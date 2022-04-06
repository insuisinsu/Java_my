package Chap17.Ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Account{					//���� ������ �����ϴ� ��ü, �߿��� �ʵ��̱� ������ private �� ���� ĸ��ȭ �Ǿ�����
								//��ü������ �ʵ� ������ �Ұ���,, ������(), getter(), setter() ���ؼ� ó��
								//DTO, VO : �� �������� �ʵ��� ���� �����ϰ� �����ϴ� ���
	private String ano;		//���¹�ȣ
	private String owner;	//���� ��, �̸�
	private int balance;	//���� �ݾ�
	
	Account(String ano, String owner, int balance){	// ��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε� ��Ŵ
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	//getter, setter 
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	
	
	
}

public class BankAccountUsingArrayList_1 {
	//�÷���(ArrayList<E>)�� ����ؼ� Account ��ü ���
	//�迭�� �����ÿ� ��ũ��(index)�� ��������� ��,, index �� 0 ���� ���� / .length() �� ���� ũ�� Ȯ�� / 
	//�迭�� ���� ũ�Ⱑ �����Ǿ� ������, �÷����� ���� ũ�Ⱑ ������(�þ��(����) �پ����� ����)
	//�÷����� .add() �� ����Ͽ� ���� ������ �濡 ���� �ְ�,
	// .remove(���ȣ) �� ���� ���� ������
	private static ArrayList<Account> aList = new ArrayList();		//�迭�� ��ü ����.
	//Account[] : �迭 Ÿ��.����Ÿ��.. �迭�� �� �濡 ���� �������� ���� ��� -> �⺻������ Null
	
	
	private static Scanner sc = new Scanner(System.in);
	
	//�Ʒ� ���Ǵ� �޼ҵ� ����
	private static void createAccount() {	//�޼ҵ� ȣ��, ��ü ���� ���� �޼ҵ������ ȣ��(static)
		//�ڵ� �ۼ� : 1. ���»��� // ��ĳ�ʷ� 1) ���¹�ȣ, 2) �̸�, 3) �ʱ� ������ݾ�
		//���� ���� ��ǲ �޾Ƽ� �迭 ��ü�� ����
		System.out.println("--------------------------------------------------------");
		System.out.println("1. ���»���");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("���¹�ȣ�� �Է��ϼ���. >>");
		String ano = sc.next();		//���¹�ȣ�� ��ǲ �޾Ƽ� ano ������ �Ҵ� (�������� : �޼ҵ� �������� ���)
		
		System.out.println("�̸��� �Է��ϼ���. >>");
		String owner = sc.next();
		
		System.out.println("���� ������ �ʱ� �ݾ��� �Է��ϼ���.");
		int balance = sc.nextInt();
		
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ���� �� ��ü�� �ʵ��� ���� ����
		Account newAccount = new Account(ano, owner, balance);	//�����ڸ� ���ؼ� ��ü�� �ʵ尪 ������ ��ü ����
		
		//�迭 ������ �޼ҵ� �ܺο��� �����, ���������� : ��� �޼ҵ忡�� ��� ����
			
		aList.add(newAccount);
				
	}
	
	private static void accountList() {
		//�ڵ� �ۼ� : 2. ���� ��� ��� // �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ���
		System.out.println("--------------------------------------------------------");
		System.out.println("2. ���¸��");
		System.out.println("--------------------------------------------------------");
		
		//�迭�� �� ���� ��ȸ�ϸ鼭 null �� �ƴѰ�� ��ü�� ������ �ʵ��� ���� ���
		for(int i = 0; i < aList.size() ; i++) {
			//�� ���� ��ü�� ��� ������ ����
			Account account = aList.get(i); // 0 ~ 99 ���� ��ü�� account ���� ������ ��´�.
			if(account != null) {
				System.out.print("���¹�ȣ : "+account.getAno()+"     ");
				System.out.print("������ : "+account.getOwner()+"    ");
				System.out.println("�ܾ� : " + account.getBalance()+" ��");
			}
		}
		
	}
	private static void deposit () {
		//�ڵ� �ۼ� : 3. ���� // ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݾ��� ��ǲ�ް�(�Աݾ� : ) �ش� ���¿� ����
		//1) ����ڷκ��� �Ա��� ���¸� �Է� �޴´�.
		//2) ����ڿ��� ���� ���¹�ȣ�� �迭�� ����� ��ü���� Ȯ���� �� �ش� ���¿� �Ա���
		System.out.println("--------------------------------------------------------");
		System.out.println("3. �����ϱ�");
		System.out.println("--------------------------------------------------------");
		System.out.println("������ ���� ��ȣ�� �Է��ϼ���.>>");
		String ano = sc.next();
		
		//�ش� ���¸� ã�Ƽ�, ã�� ��ü�� ���Ϲ޾� �´�.
		Account account = findAccount(ano);		//findAccount(ano) �� ȣ���ؼ� ������ ���� ã��
		if(account == null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;		//�޼ҵ� ����
		}
		System.out.print("���¹�ȣ : "+account.getAno()+"     ");
		System.out.print("������ : "+account.getOwner()+"    ");
		System.out.println("�ܾ� : " + account.getBalance()+" ��");
		
		//�Ա��� �ݾ� ��ǲ �ޱ�
		System.out.println("������ �ݾ��� �Է��ϼ���.>>");
		int money = sc.nextInt();
		
		//������ �ܾ��� getBalance() �� �ҷ����� �Է� ���� money�� ���ؼ� .setBalance �� ������
		account.setBalance(account.getBalance() + money);	
		System.out.println("�ش� ���¿� ���������� �Ա� �Ǿ����ϴ�.");
		System.out.print("���¹�ȣ : "+account.getAno()+"     ");
		System.out.print("������ : "+account.getOwner()+"    ");
		System.out.println("�ܾ� : " + account.getBalance()+" ��");
	}
	private static void withdraw() {
		//�ڵ� �ۼ� : 4. ��� // ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݾ��� ��ǲ�ް�(��ݾ� : ) �ش� ���¿� ����
		System.out.println("���");
		System.out.println("--------------------------------------------------------");
		System.out.println("4. ����ϱ�");
		System.out.println("--------------------------------------------------------");
		System.out.println("����� ���� ��ȣ�� �Է��ϼ���.>>");
		String ano = sc.next();
		
		//�ش� ���¸� ã�Ƽ�, ã�� ��ü�� ���Ϲ޾� �´�.
		Account account = findAccount(ano);		//findAccount(ano) �� ȣ���ؼ� ������ ���� ã��
		if(account == null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return;		//�޼ҵ� ����
		}
		System.out.print("���¹�ȣ : "+account.getAno()+"     ");
		System.out.print("������ : "+account.getOwner()+"    ");
		System.out.println("�ܾ� : " + account.getBalance()+" ��");
		
		//����� �ݾ� ��ǲ �ޱ�
		System.out.println("����� �ݾ��� �Է��ϼ���.>>");
		int money = sc.nextInt();
		
		//������ �ܾ��� getBalance() �� �ҷ����� �Է� ���� money�� ���ؼ� .setBalance �� ������
		account.setBalance(account.getBalance() - money);	
		System.out.println("�ش� ���¿��� ���������� ��� �Ǿ����ϴ�.");
		System.out.print("���¹�ȣ : "+account.getAno()+"     ");
		System.out.print("������ : "+account.getOwner()+"    ");
		System.out.println("�ܾ� : " + account.getBalance()+" ��");
		
		
		
	}
	
	//�迭���� Account ��ü ���� ano'���¹�ȣ' �� ������ ���¸� ã�Ƽ�, ã�� ��ü�� �������� ������.
	// ���� �޼ҵ忡�� �ߺ����� ���Ǵ� �κ��� ������ �޼ҵ带 �����ؼ� �����ϰ� �������
	// ���� �� ��ݿ� ���Ǵ� ���� �ڵ�
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < aList.size(); i++) {
			if(aList.get(i) != null) {	//�迭���� ���� null �� �ƴ� ��쿡 ��ü�� ano'���¹�ȣ'�� Ȯ��
				//�� ��ü�� �濡 ano �� ��� ���� ����
				String dbAno = aList.get(i).getAno();	//�� �濡 ����� ��ü�� ano �� dbAno�� ����
											//get(i) �� ��ü�� �ҷ�����, getAno()�� �� ��ü�� �ʵ尪�� ������ 
				if(dbAno.equals(ano)) {
					account = aList.get(i); //account ���������� ��ü�� �ּ������� ��´�.
					break;
				}
			}
		}
		return account;
	}
	
	public static void main(String[] args) {
		
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. ���»���  |  2. ���¸��  |  3. ����  |  4. ���  |  5. ����  ");
			System.out.println("--------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = sc.nextInt();
			
			if(selectNO == 1) {
				createAccount(); 	//�޼ҵ� ȣ��
			}else if(selectNO == 2) {
				accountList();
			}else if(selectNO == 3) {
				deposit();
			}else if(selectNO == 4) {
				withdraw();
			}else if(selectNO == 5) {
				run = false;
				//break;
			}
			
		}
		sc.close();
		System.out.println("���α׷� ����");
		
	}

}