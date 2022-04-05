package Chap17.Ex09;

import java.util.Objects;

/*
 	Map : key �� �ߺ����� �ʾƾ� �� - equals(), hashCode() ������ �ʿ�
 		  Value �� �ߺ� ����
 		
 */

//equals(), hashCode() �� ������ ���� ���� Ŭ����
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

//equals() �� �������� Ŭ����

class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override			//��ü�� �ʵ� ���� ���ؼ� ������ ���� ���̴�.
	public boolean equals(Object obj) { 	//obj �� Object Ÿ������ ��ĳ����
		if(obj instanceof B) {			//obj �� B Ÿ���� ������ �� (true)
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
	@Override			//��ü�� �ʵ� ���� ���ؼ� ������ ���� ���̴�.
	public boolean equals(Object obj) { 	//obj �� Object Ÿ������ ��ĳ����
		if(obj instanceof C) {			//obj �� B Ÿ���� ������ �� (true)
			if(this.data == ((C) obj).data) {
			return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);		// ���� ���
		//return data; �� �ص� �˴ϴ�.
	}

}





//equals(), hashCode() �� �������� Ŭ����


public class HashMapMachanism {

	public static void main(String[] args) {

	}

}
