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

//Account 객체를 TreeSet 에 저장.  ano[계좌번호], owner[이름], balance[예금]
//TreeSet 에 일반객체를 넣을 때 어떤 컬럼을 정렬할지를 지정해줘야 함 / Comparable<E>, Comparator<E>
//Account 객체를 수정하지 않고, balance 를 내림차순으로 정렬

public class BankAccountUsingTreeSet_1 {
	private static Set<Account> aSet = new TreeSet();		//배열에 객체 저장.
	private static Scanner sc = new Scanner(System.in);
	
	//아래 사용되는 메소드 정의
	private static void createAccount() {	//메소드 호출, 객체 생성 없이 메소드명으로 호출(static)
		//코드 작성 : 1. 계좌생성 // 스캐너로 1) 계좌번호, 2) 이름, 3) 초기 통장장금액
		//위의 값을 인풋 받아서 배열 객체에 저장
		System.out.println("--------------------------------------------------------");
		System.out.println("1. 계좌생성");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("계좌번호를 입력하세요. >>");
		String ano = sc.next();		//계좌번호를 인풋 받아서 ano 변수에 할당 (지역변수 : 메소드 내에서만 사용)
		
		System.out.println("이름을 입력하세요. >>");
		String owner = sc.next();
		
		System.out.println("계좌 개설시 초기 금액을 입력하세요.");
		int balance = sc.nextInt();
		
		//각 필드의 정보를 사용자로부터 할당 받아서 객체를 생성 후 객체에 필드의 값을 저장
		Account newAccount = new Account(ano, owner, balance);	//생성자를 통해서 객체에 필드값 적용후 객체 생성
		
		//배열 선언은 메소드 외부에서 선언됨, 전역변수임 : 모든 메소드에서 사용 가능
			
		aSet.add(newAccount);
				
	}
	
	private static void accountList() {
		//코드 작성 : 2. 계좌 목록 출력 // 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액 을 출력
		System.out.println("--------------------------------------------------------");
		System.out.println("2. 계좌목록");
		System.out.println("--------------------------------------------------------");
		
		Iterator<Account> iterator = aSet.iterator();
		
		while(iterator.hasNext()) {				//첫번째 값
			Account account = iterator.next();	//iterator 의 값을 account 로 가져옴
			if(account != null) {
				System.out.print("계좌번호 : "+iterator.next().getAno()+"     ");
				System.out.print("소유주 : "+iterator.next().getOwner()+"    ");
				System.out.println("잔액 : " + iterator.next().getBalance()+" 원");
			}
		}
		
	}
	private static void deposit () {
		//코드 작성 : 3. 예금 // 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금액을 인풋받고(입금액 : ) 해당 계좌에 저장
		//1) 사용자로부터 입금할 계좌를 입력 받는다.
		//2) 사용자에게 받은 계좌번호를 배열에 저장된 객체에서 확인한 후 해당 계좌에 입금함
		System.out.println("--------------------------------------------------------");
		System.out.println("3. 예금하기");
		System.out.println("--------------------------------------------------------");
		System.out.println("예금할 계좌 번호를 입력하세요.>>");
		String ano = sc.next();
		
		//해당 계좌를 찾아서, 찾은 객체를 리턴받아 온다.
		Account account = findAccount(ano);		//findAccount(ano) 를 호출해서 선택한 계좌 찾기
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;		//메소드 종료
		}
		System.out.print("계좌번호 : "+account.getAno()+"     ");
		System.out.print("소유주 : "+account.getOwner()+"    ");
		System.out.println("잔액 : " + account.getBalance()+" 원");
		
		//입금할 금액 인풋 받기
		System.out.println("예금할 금액을 입력하세요.>>");
		int money = sc.nextInt();
		
		//기존의 잔액을 getBalance() 로 불러오고 입력 받은 money를 더해서 .setBalance 로 저장함
		account.setBalance(account.getBalance() + money);	
		System.out.println("해당 계좌에 성공적으로 입금 되었습니다.");
		System.out.print("계좌번호 : "+account.getAno()+"     ");
		System.out.print("소유주 : "+account.getOwner()+"    ");
		System.out.println("잔액 : " + account.getBalance()+" 원");
	}
	private static void withdraw() {
		//코드 작성 : 4. 출금 // 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금액을 인풋받고(출금액 : ) 해당 계좌에 저장
		System.out.println("출금");
		System.out.println("--------------------------------------------------------");
		System.out.println("4. 출금하기");
		System.out.println("--------------------------------------------------------");
		System.out.println("출금할 계좌 번호를 입력하세요.>>");
		String ano = sc.next();
		
		//해당 계좌를 찾아서, 찾은 객체를 리턴받아 온다.
		Account account = findAccount(ano);		//findAccount(ano) 를 호출해서 선택한 계좌 찾기
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;		//메소드 종료
		}
		System.out.print("계좌번호 : "+account.getAno()+"     ");
		System.out.print("소유주 : "+account.getOwner()+"    ");
		System.out.println("잔액 : " + account.getBalance()+" 원");
		
		//출금할 금액 인풋 받기
		System.out.println("출금할 금액을 입력하세요.>>");
		int money = sc.nextInt();
		
		//기존의 잔액을 getBalance() 로 불러오고 입력 받은 money를 더해서 .setBalance 로 저장함
		account.setBalance(account.getBalance() - money);	
		System.out.println("해당 계좌에서 성공적으로 출금 되었습니다.");
		System.out.print("계좌번호 : "+account.getAno()+"     ");
		System.out.print("소유주 : "+account.getOwner()+"    ");
		System.out.println("잔액 : " + account.getBalance()+" 원");
		
		
		
	}
	
	//배열에서 Account 객체 내의 ano'계좌번호' 와 동일한 계좌를 찾아서, 찾은 객체를 리턴으로 돌려줌.
	// 여러 메소드에서 중복으로 사용되는 부분은 별도의 메소드를 생성해서 간단하게 만들어줌
	// 예금 및 출금에 사용되는 공통 코드
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
