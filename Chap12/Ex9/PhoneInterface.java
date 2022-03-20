package Chap12.Ex9;

public interface PhoneInterface {
	int TIMEOUT = 10000;	//public static final 생략
	void sendCall();		//public abstact 생략
	void receiveCall();		//public abstact 생략
	default void printLogo() {
		System.out.println("로고 출력");
	}
}
