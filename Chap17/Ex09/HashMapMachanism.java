package Chap17.Ex09;

import java.util.Objects;

/*
 	Map : key 는 중복되지 않아야 됨 - equals(), hashCode() 재정의 필요
 		  Value 는 중복 가능
 		
 */

//equals(), hashCode() 를 재정의 하지 않은 클래스
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

//equals() 만 재정의한 클래스

class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override			//객체의 필드 값을 비교해서 같으면 같은 값이다.
	public boolean equals(Object obj) { 	//obj 는 Object 타입으로 업캐스팅
		if(obj instanceof B) {			//obj 가 B 타입을 내포할 때 (true)
			if(this.data == ((B) obj).data) {
			return true;
			}
		}
		return false;
	}

}

class C{
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override			//객체의 필드 값을 비교해서 같으면 같은 값이다.
	public boolean equals(Object obj) { 	//obj 는 Object 타입으로 업캐스팅
		if(obj instanceof C) {			//obj 가 B 타입을 내포할 때 (true)
			if(this.data == ((C) obj).data) {
			return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);		// 권장 방법
		//return data; 로 해도 됩니다.
	}

}





//equals(), hashCode() 를 재정의한 클래스


public class HashMapMachanism {

	public static void main(String[] args) {

	}

}
