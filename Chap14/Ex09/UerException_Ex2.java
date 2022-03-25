package Chap14.Ex09;

//season
class myException1 extends Exception{
	public myException1() {
		super();
	}
	public myException1(String message) {
		super(message);
	}
}

//실행 클래스
class B{
	private String season;		//봄, 여름, 가을, 겨울 (외에 다른 값이 들어오면 예외 발생)
	private String week;		//월, 화, 수, 목, 금, 토, 일 (예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입렵하세요)
	private int scoreKor;		// 0~100 값만 (예외 발생 : 0 ~ 100 까지 정수만 입력하세요)
	private int scoreEng;
	private String userID;		// 12 ~ 20자 사이의 문자 (예외 발생 : 12자 이상, 20자 미만의 문자만 넣으세요)

	
	void checkAll(String season, String week, int scoreKor, int scoreEng, String userID) throws myException{
		if(season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new myException("봄, 여름, 가을, 겨울 중에 하나를 입력하세요.");
		}else if(week != "월" && week != "화" && week != "수" && week != "목" && week != "금" && week != "토" && week != "일") {
			throw new myException("월, 화, 수, 목, 금, 토, 일 중에 하나를 입력하세요.");
		}else if(scoreKor < 0 || scoreKor > 100) {
			throw new myException("0 ~ 100 사이의 정수를 입력하세요.");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new myException("0 ~ 100 사이의 정수를 입력하세요.");
		}else if(userID.length() < 12 || userID.length()>20) {
			throw new myException("userID 는 8자리 이상 20자리 미만으로 입력해주세요.");
		}else {
			System.out.println("정상적으로 값이 모두 잘 입력 되었습니다.");
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		System.out.print(season+", "+week+", "+scoreKor+", "+scoreEng+", "+userID);
		
	}
	
}



public class UerException_Ex2 {

	public static void main(String[] args) {
		
		B b = new B();
		try {
			b.checkAll("가을", "금", 12, 14, "1234567890123");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b.checkAll("가", "나", 102, -14, "1234567");
		} catch (myException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
