package Chap16.Ex06;

/* 다양한 재료로 프린팅 하는 프린터 (파우더, 플라스틱, 물, 등)
  
 */

//제너릭 클래스 : 다양한 타입을 사용할 수 있는 클래스
public class GenericPrinter<T> {
	
	private T material; 		//material : 참조변수, 객체, 인스턴스

	//객체를 전송
	public T getMaterial() {
		return material;
	}
	
	//객체를 활성화
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//해당 객체의 toString() 메서드 호출
	public String toString() {
		return material.toString();
	}
	
	//메서드만 정의
	public void printing() {
//		material.doPrinting();
	}
	
}
