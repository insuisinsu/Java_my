package Chap17.Ex13;

import java.util.Scanner;

class Account{
	private String ano;		//계좌번호
	private String owner;	//계좌 주, 이름
	private int balance;	//통장 금액
	
}

public class BankAccountUsingArray {
	//배열을 사용해서 Account 객체 등록
	private static Account[] accountArray = new Account[100];		//배열에 객체 저장.
	private static Scanner sc = new Scanner(System.in);
	
	//아래 사용되는 메소드 정의
	private static void createAccount() {
		//코드 작성 : 1. 계좌생성 // 스캐너로 1) 계좌번호, 2) 이름, 3) 초기 통장장금액
		//위의 값을 인풋 받아서 배열 객체에 저장
		System.out.println("계좌생성");
	}
	
	private static void accountList() {
		//코드 작성 : 2. 계좌 목록 출력 // 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액 을 출력
		System.out.println("계좌목록");
	}
	private static void deposit () {
		//코드 작성 : 3. 예금 // 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금액을 인풋받고(입금액 : ) 해당 계좌에 저장
		System.out.println("예금");
	}
	private static void withdraw() {
		//코드 작성 : 4. 출금 // 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금액을 인풋받고(출금액 : ) 해당 계좌에 저장
		System.out.println("출금");
	}
	
	//배열에서 Account 객체 내의 ano'계좌번호' 와 동일한 계좌를 찾아서, 찾은 객체를 리턴으로 돌려줌.
	private static Account findAccount(String ano) {
		Account account = null;
		//코드 작성
		
		
		return account;
	}
	
	public static void main(String[] args) {
		
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성  |  2. 계좌목록  |  3. 예금  |  4. 출금  |  5. 종료  ");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택>>");
			int selectNO = sc.nextInt();
			
			if(selectNO == 1) {
				createAccount(); 	//메소드 호출
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
		System.out.println("프로그램 종료");
		
	}

}
