package Chap0607.Ex04;

//명시적 this 키워드 추가  - 반드시 this 를 추가해야 하는 경우


//this key를 사용하지 않는 경우
//this 키를 사용하지 않아 '필드의 m' 이 아닌 '지역변수 m'을 의미
class Aa {						
	int m;						//-> 지역변수로 인식
	int n;
	void init (int m, int n) {
		m = m ;					
		n = n ;
	}
}

// this 를 사용하는 경우
// this 키를 사용하여 '필드의 m' 이라는 것을 알려줘야함
class Bb {			
	int m;
	int n;
	void init (int m, int n) {
		this.m = m;				
		this.n = n;
	}
}

public class ThisKeyword_02 {

	public static void main(String[] args) {

		//1. 필드의 명과 지역변수의 명이 같은 경우에
		//this 키워드를 사용하지 않는 경우
		//지역변수에 저장
		
		Aa aa = new Aa();
		aa.init(2, 3);
		System.out.println(aa.m);		//0
		System.out.println(aa.n);		//0
				
		
		//2. 필드의 명과 지역변수의 명이 같은 경우
		//this 키워드르 사용하는 경우
		//필드 변수에 저장
		
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);		//2
		System.out.println(bb.n);		//3
		
	}

}
