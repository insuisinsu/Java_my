package Work;

class Students {
	int studentID;
	String name;
	int kor ;
	int eng;
	
	Students(int studentID, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Students)obj).studentID){
			return true;
		}else {
			return false;
		}
	}*/
}

public class Quiz_0317 {

	public static void main(String[] args) {

		Students s1 = new Students(1111, "ȫ�浿", 90, 80);
		Students s2 = new Students(2222, "���μ�", 100, 100);
		Students s3 = new Students(3333, "�̼���", 98, 87);
		Students s4 = new Students(1111, "�͸�", 97, 78);
		
		//studentID �� ���� ���, ���� �л��̴� ��� ���
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.name);
		if(s1.studentID == s4.studentID) {
			System.out.println("���� �л��̴�.");
		}else {
			System.out.println("�ٸ� �л��̴�.");
		}
	}

}
