package Chap14.Ex08;


//ID�� ���� Null �� ��� Exception �߻�
//userID �� 8�� �̻� 20�� �Ʒ��� �ƴ� ��� Exception

class IDFormatException extends Exception{		//2���� �����ڸ� ����
	public IDFormatException(){
		super();
	}
	public IDFormatException(String message) {	//���� �߻��� ���� �޼����� ���, e.getMessage();
		super(message);
	}
}

public class IDFormatTest {

	private String userID;			//üũ : null, 8�� �̻� 20 �� �Ʒ��� �ƴ� ��� Exception
		//userID �� ĸ��ȭ ��. ?private ���� ������ (�ٸ� Ŭ�������� ���� �ȵ�)
		//������, setter �� ����ؼ� ���� �Ҵ�
		// private ���� ������ ��� : getter �� setter �� ����ؾ� ��
		
	
	public String getUserID() {		//�޼��� ȣ��� �޸��� userID�� ������
		return userID;
	}
	
	public void setUserID (String userID) throws IDFormatException {		//setter : �޸��� ���� �Ҵ�
		if(userID == null) {
			throw new IDFormatException("���̵�� Null�� �� �����ϴ�.");
		}else if (userID.length() <8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8~20�� ���̿��� �մϴ�.");
		}else {
			System.out.println("���������� �ԷµǾ����ϴ�.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();
		
		//userID�� null�� ���
		String userID= null;
		try {
			test.setUserID(userID);		//setter ȣ��� null �Է� �� ȣ��
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		} 	
		System.out.println("=================");
		
		//userID �� 7���� ��� (���ǿ� ���� �ʴ� ���)
		userID = "asdfjkl";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("====================");
		
		//userID �� ���ǿ� ���յǴ� ���
		userID = "12345678";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		
		
		
		
		
		
		
	}

}
