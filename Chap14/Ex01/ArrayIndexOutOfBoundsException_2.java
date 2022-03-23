package Chap14.Ex01;

//Exception 이 예외의 최상위 클래스 임
// ArrayIndexOutOfBoundsException 도 Exception 을 상속함
public class ArrayIndexOutOfBoundsException_2 {

	public static void main(String[] args) {

		
		//arr 배열 및 방 갯수 선언,, index : 0, 1, 2, 3, 4
		int[] arr = new int[5];
		
		try {
			
			for(int i = 0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch (Exception e) {			//하위의 모든 예외를 처리할 수 있음
//			e.printStackTrace();		// 예외에 대한 정보를 출력
			System.out.println("배열의 인덱스 방번호를 넘겼습니다.");
		}finally {
			System.out.println("출력(finally)");
		}

		
		
		System.out.println("프로그램 종료");
		
		
	}

}
