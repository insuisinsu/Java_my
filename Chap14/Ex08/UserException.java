package Chap14.Ex08;

/*
	1. Exception �� ��� �޴� ����� ���� - �Ϲ� ����
	1.1. ������ ������ ��� ����
	1.2. ������ 100���� �ʰ��ϴ� ��� ����
*/

	//������ ������ ������ ���� �߻� ��Ŵ
class MinusException extends Exception{
	//�⺻ ������
	public MinusException() {
		super();	//�θ�(Exception) ������ ȣ��
	}
	public MinusException(String message) {
		super(message);		//���� �޼��� ���, e.getMessage();
	}
	
}
	//100 �̻��� ���� ������ ȣ��
class OverException extends Exception{
	
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
	
}

class AAA{
	
	int score;
	
	void checkScore (int score) throws MinusException, OverException{
		if(score < 0) {
			throw new MinusException("���ܹ߻� : ������ �Է��� �� �����ϴ�.");
		}else if(score > 100){
			throw new OverException("���ܹ߻� : 100 ���� Ŭ �� �����ϴ�.");	
		}else {
			System.out.println("���������� �ԷµǾ����ϴ�.");
			this.score = score;
			System.out.println("������ :" + this.score);
		}
	}

}



public class UserException {

	public static void main(String[] args) {

		AAA a = new AAA();
		try {
			a.checkScore(-33);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkScore(90);
		} catch (MinusException | OverException e) {
			System.out.println(e.getLocalizedMessage());
		}
		try {
			a.checkScore(102);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
