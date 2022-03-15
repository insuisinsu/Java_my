package chap05;

public class CreatStringObject {

	public static void main(String[] args) {

		//String 객체 생성
		
		//1) new 키를 사용해서 객체 생성 : Heap 영역의 별도의 공간에 저장
		// RAM의 값을 절대 공유하지 않는다.
		// new 키는 객체를 생성하라. (Heap 메모리에 저장)
		
		String str1 = new String("안녕");	
		System.out.println(str1);	
		//String은 객체를 출력했을 때 객체의 번지가 아닌 객체의 값이 출력됨.
		//String 만의 특성
		//보통은 객체 자체를 출력하면 Heap 메모리의 번지가 출력됨
		//객체의 값을 출력할 때는 객체명.toSting() 재정의 해야함

		String str11 = new String("안녕");
		//str1 과 str11 는 별도의 RAM 에 저장됨. (Heap)
		
		if (str1 == str11) {
			System.out.println(true);
		}else {
			System.out.println(false); 		// flase <-- str1 과 str11 의 주소가 다르다는 의미
		}
		
		
		//2) 리터럴의 값을 바로 할당.
		//같은 값일 경우 RAM 의 값을 공유하게 됨. (Heap)
		String str2 = "안녕하세요.";	
		String str22 = "안녕하세요.";
		//str2 와 str22 는 동일한 메모리 공간을 공유함 (Heap)
		
		if (str2 == str22) {
			System.out.println(true);		// true <-- str2 와 str22 가 같은 주소라는 의미
		}else {
			System.out.println(false);
		}
		
		
		
		
	}

}
