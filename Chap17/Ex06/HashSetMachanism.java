package Chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 	Set : �ߺ��� ���� ���� �� ����.
 	
 	equals(), hashCode() �� ���ǵǾ� �־�� �Ѵ�.
 	String, Integer Ŭ�������� equals(), hashCode() �� ������ �Ǿ� �ִ�.
 	Ư�� ��ü�� set  �� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ� ���ؼ��� equals() �� hashCode() �� ������ �Ǿ�� �Ѵ�.
 	Object Ŭ������ equals() �� == �� ����.
 		. ==  �� Stack �޸��� ���� ���ϴ� ��
 	 
 */

//1. equals(), hashCode() �� ������ ���� ���� ����

class A{
	int data;
	public A (int data) {
		this.data = data;
	}
}

//2. equals() ������, hashCode() �� ������ ���� ����
class B{
	int data;
	public B (int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {		//��ü�� �ּҰ� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����
		if(obj instanceof B) {				//obj �� B Ÿ���� �����ϰ� ���� ���� �ٿ� ĳ���� �ϵ���
			this.data = ((B)obj).data;		//���� : �߸� �ٿ�ĳ������ �� ��� ���ܰ� �߻���
			return true;
		}
		return false;
	}
	
}

//3. equals(), hashCode() ��� ������
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
	public int hashCode() {				//Objects.hash(�ʵ��, �ʵ��, ..., �ʵ��) 
		return Objects.hash(data);		
		
		//����ó�� �ʵ尡 �ϳ���� �Ʒ� ó�� ����
//		return data; 		//	data �ʵ��� ���� ������ hashCode �� �����ϰ� ����
	
	}
}

public class HashSetMachanism {

	public static void main(String[] args) {

		
		//1. equals(), hashCode() �� ������ ���� ���� ����
		
		Set<A> hashSet1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);	//false 		// == : Stack �޸��� ���� ��
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));	//false, Object�� equals() �� == ��
		System.out.println(a1.hashCode()+" , "+a2.hashCode());
		
		hashSet1.add(a1);
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size());
		
//		2. equals() ������ (��ü�� data �ʵ��� ���� ��), hashCode() �� ������ ���� ���� ����
		Set<B> hashSet2 = new HashSet();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);		//false
		System.out.println(b1.equals(b2));	//true
		System.out.println(b1.hashCode() +" , "+ b2.hashCode());
		
//		3. equals() (��ü�� data �ʵ��� �� ��), hashCode() ������
		Set<C> hashSet3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" , "+c2.hashCode());
		// -> �� ��ü�� ������ ��ü���� Ȯ��
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
		
	}

}
