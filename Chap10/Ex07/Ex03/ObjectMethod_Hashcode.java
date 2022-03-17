package Chap10.Ex07.Ex03;

import java.util.HashMap;
//HashMap : Key = 값으로 저장되는 자료구조.
//key 는 중복될 수 없음
//HashMap 의 Key 에 객체를 저장할 경우, key에 저장되는 객체가 중복되지 않는 고유한 정보를 저장해야 함
//--> Object 클래스의 hashcode() 를 사용해서, 객체가 key에 저장될 경우 중복되지 않도록 설정할 수 있음 

class A {
	String name;
	A (String name){
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name;
	}
	
}

//hashCode() + equals() 재정의 
// 두 가지를 모두 만족해야 동일한 객체로 인식
class B {
	String name;
	B (String name){
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return name;
	}
	
}


public class ObjectMethod_Hashcode {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
//     	Integer - key    , String - Value
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		
		System.out.println(hm1);
		System.out.println("========");
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		//HashMap이 잘못 구현된 경우
		//equal() 만 확인하고 hashcode() 는 확인하지 않음 
		System.out.println(hm2); 
		System.out.println();
		
		//HashMap에 정확하게 구현이 된 경우
			//key 가 중복되지 않아 첫번째(key) 데이터1 이 아닌 데이터2 가 저장됨
		//hm3 는 toString() 가 재정의 됨
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);

		System.out.println("첫번째".hashCode());
		System.out.println("첫번째".hashCode());
		
	}

}
