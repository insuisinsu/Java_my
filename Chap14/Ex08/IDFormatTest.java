package Chap14.Ex08;


//ID의 값을 Null 일 경우 Exception 발생
//userID 가 8자 이상 20자 아래가 아닌 경우 Exception

class IDFormatException extends Exception{		//2개의 생성자만 구성
	public IDFormatException(){
		super();
	}
	public IDFormatException(String message) {	//예외 발생시 예외 메세지가 출력, e.getMessage();
		super(message);
	}
}

public class IDFormatTest {

	private String userID;			//체크 : null, 8자 이상 20 자 아래가 아닌 경우 Exception
		//userID 는 캡슐화 됨. ?private 지정 제어자 (다른 클래스에서 접근 안됨)
		//생성자, setter 를 사용해서 값을 할당
		// private 으로 설정된 경우 : getter 나 setter 를 사용해야 함
		
	
	public String getUserID() {		//메서드 호출시 메모리의 userID를 던져줌
		return userID;
	}
	
	public void setUserID (String userID) throws IDFormatException {		//setter : 메모리의 값을 할당
		if(userID == null) {
			throw new IDFormatException("아이디는 Null일 수 없습니다.");
		}else if (userID.length() <8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8~20자 사이여야 합니다.");
		}else {
			System.out.println("정상적으로 입력되었습니다.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();
		
		//userID가 null인 경우
		String userID= null;
		try {
			test.setUserID(userID);		//setter 호출시 null 입력 후 호출
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		} 	
		System.out.println("=================");
		
		//userID 가 7자인 경우 (조건에 맞지 않는 경우)
		userID = "asdfjkl";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("====================");
		
		//userID 가 조건에 부합되는 경우
		userID = "12345678";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		
		
		
		
		
		
		
	}

}
