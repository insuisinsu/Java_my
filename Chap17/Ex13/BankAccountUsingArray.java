package Chap17.Ex13;

import java.util.Scanner;

class Account{
	private String ano;		//���¹�ȣ
	private String owner;	//���� ��, �̸�
	private int balance;	//���� �ݾ�
	
}

public class BankAccountUsingArray {
	//�迭�� ����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100];		//�迭�� ��ü ����.
	private static Scanner sc = new Scanner(System.in);
	
	//�Ʒ� ���Ǵ� �޼ҵ� ����
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���»��� // ��ĳ�ʷ� 1) ���¹�ȣ, 2) �̸�, 3) �ʱ� ������ݾ�
		//���� ���� ��ǲ �޾Ƽ� �迭 ��ü�� ����
		System.out.println("���»���");
	}
	
	private static void accountList() {
		//�ڵ� �ۼ� : 2. ���� ��� ��� // �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ���
		System.out.println("���¸��");
	}
	private static void deposit () {
		//�ڵ� �ۼ� : 3. ���� // ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݾ��� ��ǲ�ް�(�Աݾ� : ) �ش� ���¿� ����
		System.out.println("����");
	}
	private static void withdraw() {
		//�ڵ� �ۼ� : 4. ��� // ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݾ��� ��ǲ�ް�(��ݾ� : ) �ش� ���¿� ����
		System.out.println("���");
	}
	
	//�迭���� Account ��ü ���� ano'���¹�ȣ' �� ������ ���¸� ã�Ƽ�, ã�� ��ü�� �������� ������.
	private static Account findAccount(String ano) {
		Account account = null;
		//�ڵ� �ۼ�
		
		
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
