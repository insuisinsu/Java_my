package Chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 	Set : 중복된 값을 넣을 수 없다.
 	
 	equals(), hashCode() 가 정의되어 있어야 한다.
 	String, Integer 클래스들은 equals(), hashCode() 가 재정의 되어 있다.
 	특정 객체를 set  에 저장할 경우 중복 저장을 하지 못하도록 하기 위해서는 equals() 와 hashCode() 가 재정의 되어야 한다.
 	Object 클래스의 equals() 는 == 와 같다.
 		. ==  은 Stack 메모리의 값을 비교하는 것
 	 
 */

//1. equals(), hashCode() 가 재정의 되지 않은 상태

class A{
	int data;
	public A (int data) {
		this.data = data;
	}
}

//2. equals() 재정의, hashCode() 는 재정의 하지 않음
class B{
	int data;
	public B (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		//객체의 주소가 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정
		if(obj instanceof B) {				//obj 가 B 타입을 내포하고 있을 때만 다운 캐스팅 하도록
			this.data = ((B)obj).data;		//주의 : 잘못 다운캐스팅을 할 경우 예외가 발생됨
			return true;
		}
		return false;
	}
	
}

//3. equals(), hashCode() 모두 재정의
class C{
	int data;
	public C (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof C) {				
			this.data = ((C)obj).data;		
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {				//Objects.hash(필드명, 필드명, ..., 필드명) 
		return Objects.hash(data);		
		
		//예제처럼 필드가 하나라면 아래 처럼 가능
//		return data; 		//	data 필드의 값이 같으면 hashCode 를 동일하게 생성
	
	}
}

public class HashSetMachanism {

	public static void main(String[] args) {

		
		//1. equals(), hashCode() 가 재정의 되지 않은 상태
		
		Set<A> hashSet1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);	//false 		// == : Stack 메모리의 값을 비교
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));	//false, Object의 equals() 는 == 임
		System.out.println(a1.hashCode()+" , "+a2.hashCode());
		
		hashSet1.add(a1);
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size());
		
//		2. equals() 재정의 (객체의 data 필드의 값을 비교), hashCode() 는 재정의 되지 않은 상태
		Set<B> hashSet2 = new HashSet();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);		//false
		System.out.println(b1.equals(b2));	//true
		System.out.println(b1.hashCode() +" , "+ b2.hashCode());
		
//		3. equals() (객체의 data 필드의 값 비교), hashCode() 재정의
		Set<C> hashSet3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" , "+c2.hashCode());
		// -> 두 객체는 동일한 객체임을 확인
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
		
	}

}
