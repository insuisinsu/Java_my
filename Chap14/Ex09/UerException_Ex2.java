package Chap14.Ex09;

//season
class myException1 extends Exception{
	public myException1() {
		super();
	}
	public myException1(String message) {
		super(message);
	}
}

//���� Ŭ����
class B{
	String season;		//��, ����, ����, �ܿ� (�ܿ� �ٸ� ���� ������ ���� �߻�)
	String week;		//��, ȭ, ��, ��, ��, ��, �� (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���)
	int scoreKor;		// 0~100 ���� (���� �߻� : 0 ~ 100 ���� ������ �Է��ϼ���)
	int scoreEng;
	String userID;		// 12 ~ 20�� ������ ���� (���� �߻� : 12�� �̻�, 20�� �̸��� ���ڸ� ��������)

	
	
	
	//���� Ȯ��
	void checkSeason (String season) throws myException1{
		if(season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new myException1("��, ����, ����, �ܿ� �߿� �ϳ��� �Է��ϼ���.");
		}else {
			this.season = season;
			System.out.println("�Է��Ͻ� ������ : " + season +" �Դϴ�.");
		}
	}

	//���� Ȯ��
	void checkWeek (String week) throws myException1{
		if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��") {
			throw new myException1("��, ȭ, ��, ��, ��, ��, �� �߿� �ϳ��� �Է��ϼ���.");
		}else {
			this.week = week;
			System.out.println("�Է��Ͻ� ������ : " + week +" �Դϴ�.");
		}
	}
	
	//���� ����
	void checkKor (int scoreKor) throws myException1{
		if(scoreKor < 0 || scoreKor > 100) {
			throw new myException1("0 ~ 100 ������ ������ �Է��ϼ���.");
		}else {
			this.scoreKor = scoreKor;
			System.out.println("�Է��Ͻ� ���������� " +scoreKor+ " �Դϴ�.");
		}
	}
	
	//���� ����
	void checkEng (int scoreEng) throws myException1{
		if(scoreEng < 0 || scoreEng > 100) {
			throw new myException1("0 ~ 100 ������ ������ �Է��ϼ���.");
		}else {
			this.scoreEng = scoreEng;
			System.out.println("�Է��Ͻ� ���������� " +scoreEng+ " �Դϴ�.");
		}
	}
	
	//ID Ȯ��
		void checkUserID (String userID) throws myException1{
			if(userID.length() < 8 || userID.length()>20) {
				throw new myException1("userID �� 8�ڸ� �̻� 20�ڸ� �̸����� �Է����ּ���.");
			}else {
				this.userID = userID;
				System.out.println("�Է��Ͻ� userID�� : " + userID +" �Դϴ�.");
			}
		}
	
	
	
	
	
	
	
}



public class UerException_Ex2 {

	public static void main(String[] args) {

		B a= new B();
		//����
		try {
			a.checkSeason("����");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkSeason("����");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//����
		try {
			a.checkWeek("�ϴ�");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkWeek("��");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//���� ����
		try {
			a.checkKor(-12);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkKor(88);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkKor(105);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//���� ����
		try {
			a.checkEng(-12);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkEng(88);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkEng(105);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}		
		System.out.println();
		
		try {
			a.checkUserID("1234567");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("1234567890");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("123456789012345678901");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
	}

}
