package Chap14.Ex06;

//�Ϲ� ���� (Checked Exception) : ������ �ܰ迡�� ���� �߻�
// 1. try catch �� �̿��Ͽ� ���� ó��
// 2. throws �� ����ؼ� ����

//main �޼��忡 throws �� ������Ű�� ���?
// Exception�� �߻��ϸ� ������ ������ְ� ����.


public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//���������� ������ ������ -> ClassNotFoundException �� �߻����� ����
		Class cls = Class.forName("java.lang.Object");
		//���� ���� -> ClassNotFoundException �� �߻�
		Class cls2 = Class.forName("java.lang.Object0");
		
	}

}
