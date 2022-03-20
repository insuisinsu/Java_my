package Chap12.Ex3;

interface A{}
interface B{}

//1. 단일 인터페이스 상속
//C 클래스는 A 인터페이스를 구현(상속)
class C implements A {}

//2. 다중 인터페이스 상속
class D implements A, B {}

//3. 클래스와 인터페이스를 한 번에 상속
// extends 와 impements 의 순서는 변경 불가
class E extends C implements A, B{}


public class Interface_3 {

	public static void main(String[] args) {

	}

}
