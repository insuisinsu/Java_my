package Work;
class Student{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	void hobby() {
		System.out.println(name + " �л��� ��̴� ~ �Դϴ�.");
	}

	@Override
	public String toString() {
		sum = kor + eng + math;
		avg = (double) sum / 3;
		return "�̸�: "+name+", �й�: "+studentID+", ����: "+kor+", ����: "+eng
				+", ����: "+math+"�հ�: "+sum+", ���: "+avg;
	}
	
	
}

class S_ö�� extends Student{

	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
	
	S_ö��(String a, int b, int c, int d, int e){	
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
	}
}
class S_���� extends Student{
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� �����Դϴ�.");
	}
	
	S_����(String a, int b, int c, int d, int e){	
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
	}	
}
class S_�Ѽ� extends Student{
	
	@Override
	void hobby() {
		System.out.println("�Ѽ��� ��̴� �߰����Դϴ�.");
	}
	S_�Ѽ�(String a, int b, int c, int d, int e){	
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
	}	
}
public class Quiz_0314 {

	public static void main(String[] args) {

		Student cs = new S_ö��("ö��", 1, 34, 45, 67);
		Student ja = new S_����("����", 2, 88, 78, 68);
		Student hs = new S_�Ѽ�("�Ѽ�", 3, 99, 98, 97);
		
		Student[] str = {cs, ja, hs};
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			str[i].hobby();
		}
		
		System.out.println("=========");
		for(Student k : str) {
			System.out.println(k);
			k.hobby();
		}
		
	}

}
