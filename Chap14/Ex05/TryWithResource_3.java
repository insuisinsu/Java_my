package Chap14.Ex05;


// �ڵ� ���ҽ�(��ü) ����


//�ʵ� �� �Ҵ�. ������ ȣ��� �ʵ忡 �� �ο�, 
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;
	
	Abc (String name, int studentID, int kor, int eng, int math, double avg){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
	}
	
	@Override
	public void close() throws Exception {
		if(name != null | studentID != 0 | kor != 0 | eng != 0 | math != 0 | avg !=0.0) {
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
		}
	}
	
}

public class TryWithResource_3 {

	public static void main(String[] args) {

		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close() ȣ��
		
		try(Abc abc = new Abc("���μ�", 001, 100, 99, 100, 99.67)){
			
		}catch(Exception e){
			System.out.println("����ó�� �ڵ�");
		}
		
		
		//2. '' ���� close() // finally ������� close() ȣ��
		
		Abc abc2 = null;
		
		try {
			abc2 = new Abc("���μ�", 002, 100, 99, 100, 99.67);
		}catch(Exception e) {
			System.out.println("����ó�� ����");
		}finally {
			try {
				abc2.close();
			} catch (Exception e) {
			}
		}
		
	}

}
