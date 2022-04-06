package Chap17.Ex16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Chap10.Ex07.Ex03.ObjectMethod_Hashcode;

//Account ��ü�� TreeSet �� ����.  ano[���¹�ȣ], owner[�̸�], balance[����]
//TreeSet �� �Ϲݰ�ü�� ���� �� � �÷��� ���������� ��������� �� / Comparable<E>, Comparator<E>
//Account ��ü�� �������� �ʰ�, balance �� ������������ ����

public class BankAccountUsingTreeSet_1 {
	private static Set<Account> aSet = new TreeSet();		//�迭�� ��ü ����.
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
			
		aSet.add(newAccount);
				
	}
	
	private static void accountList() {
		//�ڵ� �ۼ� : 2. ���� ��� ��� // �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ���
		System.out.println("--------------------------------------------------------");
		System.out.println("2. ���¸��");
		System.out.println("--------------------------------------------------------");
		
		Iterator<Account> iterator = aSet.iterator();
		
		while(iterator.hasNext()) {				//ù��° ��
			Account account = iterator.next();	//iterator �� ���� account �� ������
			if(account != null) {
				System.out.print("���¹�ȣ : "+iterator.next().getAno()+"     ");
				System.out.print("������ : "+iterator.next().getOwner()+"    ");
				System.out.println("�ܾ� : " + iterator.next().getBalance()+" ��");
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
		Iterator<Account> iterator = aSet.iterator();
		
		while(iterator.hasNext()) {
			Account a1 = iterator.next();
			String dbAno = a1.getAno();
			if(dbAno.equals(ano)) {
				account = a1;
				return account;
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
