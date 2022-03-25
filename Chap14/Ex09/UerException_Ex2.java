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
	private String season;		//��, ����, ����, �ܿ� (�ܿ� �ٸ� ���� ������ ���� �߻�)
	private String week;		//��, ȭ, ��, ��, ��, ��, �� (���� �߻� : ��, ȭ, ��, ��, ��, ��, �� �� �Է��ϼ���)
	private int scoreKor;		// 0~100 ���� (���� �߻� : 0 ~ 100 ���� ������ �Է��ϼ���)
	private int scoreEng;
	private String userID;		// 12 ~ 20�� ������ ���� (���� �߻� : 12�� �̻�, 20�� �̸��� ���ڸ� ��������)

	
	void checkAll(String season, String week, int scoreKor, int scoreEng, String userID) throws myException{
		if(season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new myException("��, ����, ����, �ܿ� �߿� �ϳ��� �Է��ϼ���.");
		}else if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��") {
			throw new myException("��, ȭ, ��, ��, ��, ��, �� �߿� �ϳ��� �Է��ϼ���.");
		}else if(scoreKor < 0 || scoreKor > 100) {
			throw new myException("0 ~ 100 ������ ������ �Է��ϼ���.");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new myException("0 ~ 100 ������ ������ �Է��ϼ���.");
		}else if(userID.length() < 12 || userID.length()>20) {
			throw new myException("userID �� 8�ڸ� �̻� 20�ڸ� �̸����� �Է����ּ���.");
		}else {
			System.out.println("���������� ���� ��� �� �Է� �Ǿ����ϴ�.");
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		System.out.print(season+", "+week+", "+scoreKor+", "+scoreEng+", "+userID);
		
	}
	
}



public class UerException_Ex2 {

	public static void main(String[] args) {
		
		B b = new B();
		try {
			b.checkAll("����", "��", 12, 14, "1234567890123");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b.checkAll("��", "��", 102, -14, "1234567");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
