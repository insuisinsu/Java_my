package Chap16.Ex06;

//Generic Printer 에 사용될 객체 (재료)

public class Plastic {

	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력");
	}
	
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다";
	}
	

}
