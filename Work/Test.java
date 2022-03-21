package Work;

class A{
	int data;
	A(int data){
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
	
		return super.toString();
	}
}

public class Test {

	public static void main(String[] args) {

		
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
		
	}

}
