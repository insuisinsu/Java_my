package Chap14.Ex08;


//�޼ҵ��� throws �� ����, ����, ���� �ϴٰ� main�� ����

// main ���� ���ܰ� ������ ��쿡�� ������ ���â�� ���� ���α׷� ����
// main �޼���� ����ó�� ���� �ʴ´�.

class AA{
	public void abc() throws NumberFormatException{
		bcd();
	}
	public void bcd() throws NumberFormatException{
		cde();
	}
	public void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");		//Exception �߻�, NumberFormatException �߻�
	}
	
}

public class ExceptionMethod {

	public static void main(String[] args){
		
		//1. ��ü ����
		AA aa = new AA ();
		
		//2. �޼��� ȣ��
		try {
			aa.abc();  		// ���� ���� ,������ �ܰ迡���� ���� ���� 		
		}catch(NumberFormatException e) {
			e.printStackTrace(); 	//������ �ڼ��� ���� ���
		}
			System.out.println("���α׷� ����");
		
		
		
		
	}

}
