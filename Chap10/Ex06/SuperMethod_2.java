package Chap10.Ex06;

class AAAA{
	AAAA(){
		this(3);
		System.out.println("AAAA 持失切 1");
	}
	AAAA(int a){
		System.out.println("AAAA 持失切 2");
	}
}

class BBBB extends AAAA{
	BBBB(){
		this(3);
		System.out.println("BBBB 持失切 1");
	}
	BBBB(int a){
		System.out.println("BBBB 持失切 2");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {

		//1. 梓端持失
		AAAA aaaa = new AAAA();
		System.out.println("=========");
		AAAA aaaa2 = new AAAA(3);
		System.out.println("=========");
		
		//2. 切縦 梓端 持失
		AAAA aabb = new BBBB();
		System.out.println("==========");
		AAAA aabb2 = new BBBB(3);
		System.out.println("==========");
		
		
		
	}

}
