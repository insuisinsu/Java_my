package Chap14.Ex07;

// Exception - Checked Exception - ������ ����, �ݵ�� ����ó��
//			 - unChecked Exception, RunTime Exception - ����ÿ� ����
// 
//����ó�� ���  try catch - �ڽ��� ���� ���ܸ� ó��
//			  throws - ����ó���� �̷�� ��, �޼��� ������� ���ܸ� �޼��� ȣ��� ȣ���ϴ� �ʿ� �̷�� ��
//			  throw - ���ܸ� ������ �߻���Ŵ

// ���� �޼����� ���ܸ� ó���ϴ� ���


//1. Exception�� �߻��Ǵ� �޼��� ���ο��� �ڽ��� ���� ���ܸ� ó���ϴ� ���
class A {
	void abc() {
		bcd();
	}
	//Class.forName : ���� �ε� - �����Ͻÿ� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ��
	//����� Ŭ���� ������ ������ ���� �ְ� �������� ���� ���� �ֱ� ������ ����ó�� �ؾ���
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");   //�Ϲ� ����
			Thread.sleep(1000); 						      // �Ϲ� ����	//�и����� ms, 1000ms = 1��
		} catch (ClassNotFoundException | InterruptedException e) {
		}	
	}
}

//2. Throws �� ����ؼ� Exception �� �̷�� ���
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException_3 {

	public static void main(String[] args) {

	}

}
