package Chap10.Ex02;

class AAA {
	void print() {
		System.out.println("A class");
	}
	void print1() {
		System.out.println("A class");
	}
}

class BBB extends AAA{
	void print1() {
		System.out.println("B class");
	}
}

public class MerhodOverriding_12 {

	public static void main(String[] args) {
		AAA a = new BBB();
		a.print();
		a.print1();
		
	}

}
