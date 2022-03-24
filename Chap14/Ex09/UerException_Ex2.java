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
	String season;		//봄, 여름, 가을, 겨울 (외에 다른 값이 들어오면 예외 발생)
	String week;		//월, 화, 수, 목, 금, 토, 일 (예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입렵하세요)
	int scoreKor;		// 0~100 값만 (예외 발생 : 0 ~ 100 까지 정수만 입력하세요)
	int scoreEng;
	String userID;		// 12 ~ 20자 사이의 문자 (예외 발생 : 12자 이상, 20자 미만의 문자만 넣으세요)

	
	
	
	//계절 확인
	void checkSeason (String season) throws myException1{
		if(season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new myException1("봄, 여름, 가을, 겨울 중에 하나를 입력하세요.");
		}else {
			this.season = season;
			System.out.println("입력하신 계절은 : " + season +" 입니다.");
		}
	}

	//요일 확인
	void checkWeek (String week) throws myException1{
		if(week != "월" && week != "화" && week != "수" && week != "목" && week != "금" && week != "토" && week != "일") {
			throw new myException1("월, 화, 수, 목, 금, 토, 일 중에 하나를 입력하세요.");
		}else {
			this.week = week;
			System.out.println("입력하신 요일은 : " + week +" 입니다.");
		}
	}
	
	//국어 점수
	void checkKor (int scoreKor) throws myException1{
		if(scoreKor < 0 || scoreKor > 100) {
			throw new myException1("0 ~ 100 사이의 정수를 입력하세요.");
		}else {
			this.scoreKor = scoreKor;
			System.out.println("입력하신 국어점수는 " +scoreKor+ " 입니다.");
		}
	}
	
	//영어 점수
	void checkEng (int scoreEng) throws myException1{
		if(scoreEng < 0 || scoreEng > 100) {
			throw new myException1("0 ~ 100 사이의 정수를 입력하세요.");
		}else {
			this.scoreEng = scoreEng;
			System.out.println("입력하신 영어점수는 " +scoreEng+ " 입니다.");
		}
	}
	
	//ID 확인
		void checkUserID (String userID) throws myException1{
			if(userID.length() < 8 || userID.length()>20) {
				throw new myException1("userID 는 8자리 이상 20자리 미만으로 입력해주세요.");
			}else {
				this.userID = userID;
				System.out.println("입력하신 userID는 : " + userID +" 입니다.");
			}
		}
	
	
	
	
	
	
	
}



public class UerException_Ex2 {

	public static void main(String[] args) {

		B a= new B();
		//계절
		try {
			a.checkSeason("가가");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkSeason("가을");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//요일
		try {
			a.checkWeek("하늘");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkWeek("금");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//국어 점수
		try {
			a.checkKor(-12);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkKor(88);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkKor(105);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		//영어 점수
		try {
			a.checkEng(-12);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkEng(88);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkEng(105);
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}		
		System.out.println();
		
		try {
			a.checkUserID("1234567");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("1234567890");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("123456789012345678901");
		} catch (myException1 e) {
			System.out.println(e.getMessage());
		}
	}

}
