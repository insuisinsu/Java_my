package Chap14.Ex09;

//season
class myException extends Exception{
	public myException() {
		super();
	}
	public myException(String message) {
		super(message);
	}
}

//���� Ŭ����
class A{
	String season;		//��, ����, ����, �ܿ� (�ܿ� �ٸ� ���� ������ ���� �߻�)
	String week;		//��, ȭ, ��, ��, ��, ��, �� (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���)
	int scoreKor;		// 0~100 ���� (���� �߻� : 0 ~ 100 ���� ������ �Է��ϼ���)
	int scoreEng;
	String userID;		// 12 ~ 20�� ������ ���� (���� �߻� : 12�� �̻�, 20�� �̸��� ���ڸ� ��������)

	//���� Ȯ��
	void checkSeason (String season) throws myException{
		if(season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new myException("��, ����, ����, �ܿ� �߿� �ϳ��� �Է��ϼ���.");
		}else {
			this.season = season;
			System.out.println("�Է��Ͻ� ������ : " + season +" �Դϴ�.");
		}
	}

	//���� Ȯ��
	void checkWeek (String week) throws myException{
		if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��") {
			throw new myException("��, ȭ, ��, ��, ��, ��, �� �߿� �ϳ��� �Է��ϼ���.");
		}else {
			this.week = week;
			System.out.println("�Է��Ͻ� ������ : " + week +" �Դϴ�.");
		}
	}
	
	//���� ����
	void checkKor (int scoreKor) throws myException{
		if(scoreKor < 0 || scoreKor > 100) {
			throw new myException("0 ~ 100 ������ ������ �Է��ϼ���.");
		}else {
			this.scoreKor = scoreKor;
			System.out.println("�Է��Ͻ� ���������� " +scoreKor+ " �Դϴ�.");
		}
	}
	
	//���� ����
	void checkEng (int scoreEng) throws myException{
		if(scoreEng < 0 || scoreEng > 100) {
			throw new myException("0 ~ 100 ������ ������ �Է��ϼ���.");
		}else {
			this.scoreEng = scoreEng;
			System.out.println("�Է��Ͻ� ���������� " +scoreEng+ " �Դϴ�.");
		}
	}
	
	//ID Ȯ��
		void checkUserID (String userID) throws myException{
			if(userID.length() < 8 || userID.length()>20) {
				throw new myException("userID �� 8�ڸ� �̻� 20�ڸ� �̸����� �Է����ּ���.");
			}else {
				this.userID = userID;
				System.out.println("�Է��Ͻ� userID�� : " + userID +" �Դϴ�.");
			}
		}
	
	
	
	
	
	
	
}



public class UerException_Ex {

	public static void main(String[] args) {

		A a= new A();
		//����
		try {
			a.checkSeason("����");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkSeason("����");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//����
		try {
			a.checkWeek("�ϴ�");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkWeek("��");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//���� ����
		try {
			a.checkKor(-12);
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkKor(88);
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkKor(105);
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//���� ����
		try {
			a.checkEng(-12);
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkEng(88);
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkEng(105);
		} catch (myException e) {
			System.out.println(e.getMessage());
		}		
		System.out.println();
		
		try {
			a.checkUserID("1234567");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("1234567890");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("123456789012345678901");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
	}

}
