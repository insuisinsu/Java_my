package chap05;

public class MethodOfString {

	public static void main(String[] args) {

		//1. 문자열 길이 (length()) : int 타입으로 변환
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
			//str1 : 참조변수, 객체, 인스턴스
		
		System.out.println(str1.length()); // 11
		System.out.println(str2.length()); // 13
			// 자바에서 length 는 글자수를 뜻함. (한글도 마찬가지)
		
		//2. 문자열 검색 ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1));		// 1번 방의 문자를 출력
		System.out.println(str2.charAt(1));
		System.out.println();
		
		//indexOf() 0번째 방에서 부터 마지막 방 까지 글자의 방번호(index)를 출력
		//lastIndexOf()	마지막 방부터 0번째 방으로 글자의 방 번호 출력
		
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		
		
		
		
		
	}

}
