package Chap12.Ex9;

public interface PhoneInterface {
	int TIMEOUT = 10000;	//public static final ����
	void sendCall();		//public abstact ����
	void receiveCall();		//public abstact ����
	default void printLogo() {
		System.out.println("�ΰ� ���");
	}
}
