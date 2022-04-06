package Chap17.Ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Account{					//계좌 정보를 저장하는 객체, 중요한 필드이기 때문에 private 를 통해 캡슐화 되어있음
								//객체명으로 필드 접근이 불가능,, 생성자(), getter(), setter() 통해서 처리
								//DTO, VO : 각 계증으로 필드의 값을 저장하고 전달하는 기능
	private String ano;		//계좌번호
	private String owner;	//계좌 주, 이름
	private int balance;	//통장 금액
	
	Account(String ano, String owner, int balance){	// 객체 생성시 필드의 값을 받아서 필드에 로드 시킴
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
	//컬렉션(ArrayList<E>)을 사용해서 Account 객체 등록
	//배열은 생성시에 방크기(index)를 지정해줘야 함,, index 는 0 부터 시작 / .length() 로 방의 크기 확인 / 
	//배열은 방의 크기가 고정되어 있으나, 컬렉션은 방의 크기가 동적임(늘어났다(무한) 줄어들었다 가능)
	//컬렉션은 .add() 를 사용하여 가장 마지막 방에 값을 넣고,
	// .remove(방번호) 를 통해 값을 삭제함
	private static ArrayList<Account> aList = new ArrayList();		//배열에 객체 저장.
	//Account[] : 배열 타입.참조타입.. 배열의 각 방에 값이 존재하지 않을 경우 -> 기본값으로 Null
	
	
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
			
		aList.add(newAccount);
				
	}
	
	private static void accountList() {
		//코드 작성 : 2. 계좌 목록 출력 // 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액 을 출력
		System.out.println("--------------------------------------------------------");
		System.out.println("2. 계좌목록");
		System.out.println("--------------------------------------------------------");
		
		//배열의 각 방을 순회하면서 null 이 아닌경우 객체를 꺼내서 필드의 정보 출력
		for(int i = 0; i < aList.size() ; i++) {
			//각 방의 객체를 담는 변수를 선언
			Account account = aList.get(i); // 0 ~ 99 방의 객체를 account 참조 변수에 담는다.
			if(account != null) {
				System.out.print("계좌번호 : "+account.getAno()+"     ");
				System.out.print("소유주 : "+account.getOwner()+"    ");
				System.out.println("잔액 : " + account.getBalance()+" 원");
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
		for(int i = 0; i < aList.size(); i++) {
			if(aList.get(i) != null) {	//배열방의 값이 null 이 아닐 경우에 객체의 ano'계좌번호'를 확인
				//각 객체의 방에 ano 를 담는 변수 선언
				String dbAno = aList.get(i).getAno();	//각 방에 저장된 객체의 ano 를 dbAno에 저장
											//get(i) 가 객체를 불러오고, getAno()가 그 객체의 필드값을 물러옴 
				if(dbAno.equals(ano)) {
					account = aList.get(i); //account 참조변수는 객체의 주소정보를 담는다.
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
