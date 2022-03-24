package Chap14.Ex08;

/*
	1. Exception 을 상속 받는 사용자 예외 - 일반 예외
	1.1. 점수가 음수인 경우 예외
	1.2. 점수에 100점을 초과하는 경우 예외
*/

	//음수가 들어오면 강제로 예외 발생 시킴
class MinusException extends Exception{
	//기본 생성자
	public MinusException() {
		super();	//부모(Exception) 생성자 호출
	}
	public MinusException(String message) {
		super(message);		//예외 메세지 출력, e.getMessage();
	}
	
}
	//100 이상의 값이 들어오면 호출
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
			throw new MinusException("예외발생 : 음수는 입력할 수 없습니다.");
		}else if(score > 100){
			throw new OverException("예외발생 : 100 보다 클 수 없습니다.");	
		}else {
			System.out.println("정상적으로 입력되었습니다.");
			this.score = score;
			System.out.println("점수는 :" + this.score);
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
