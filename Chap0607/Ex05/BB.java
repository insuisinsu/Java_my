package Chap0607.Ex05;

public class Bb {		// 클래스 이름에 public : 같은 패키지 뿐만 아니라 다른 패키에서도 접근 가능
	private int a = 1;			//private   : 같은 클래스 내에서만 사용 가능
	int b = 2;					//default   : 같은 패키지 내의 다른 클래스에서 접근 가능
	protected int c = 3 ;		//protected : default + 다른 패키지에서도 접근 가능(단, 상속된 경우만)
	public int d = 4 ;			//public    : 다른 패키지에서도 접근 가능
				
				//private < default < protected < public
	
	private void print1() {		// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {				// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {	// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {		// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}
