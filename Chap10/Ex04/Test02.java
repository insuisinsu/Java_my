package Chap10.Ex04;

class Animal3 {
	String name;
	int age;
	
	void cry() {
		System.out.println("동물은 웁니다.");
	}
	
	//Object.toString() 메소드는 객체 자체를 출력할 때 호출 
	@Override
	public String toString() {
		return "이름은 : " +name+" 이고, 나이는 : "+ age+" 입니다.";
	}
}

class Tiger3 extends Animal3{
	Tiger3(){}
	//생성자 : 객체를 생성할 때 메모리의 초기값을 할당할 때 사용
	Tiger3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		super.cry();
		
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
}
class Cat3 extends Animal3{
	Cat3(){};
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
		super.cry();
		System.out.println("고양이는 야옹 하고 웁니다");
	}
	
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		super.cry();
		System.out.println("개는 멍멍 하고 웁니다");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
	
		Animal3 a3 = new Animal3();
		System.out.println(a3);
		System.out.println(a3.toString());
		
		
		//Tiger3 를 Animal3 로 업캐스팅
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		//부모의 cry()를 호출할 경우 오버라이딩된 Tiger3의 cry()를 호출
		t3.cry();
		c3.cry();
		d3.cry();
		
		System.out.println("================");
		Animal3[] arr = {t3, c3, d3};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		for(Animal3 k : arr) {
			k.cry();
		}
		System.out.println("=================");
		
		Animal3 aa3 = new Tiger3("호랑이", 5);
		Animal3 cc3 = new Cat3("고양이", 10);
		Animal3 dd3 = new Dog3("강아지", 7);
		
		System.out.println(aa3);
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("==");
		
		Animal3[] arr2 = {aa3, cc3, dd3};
		for( int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		for(Animal3 k : arr2) {
			System.out.println(k);
		}
	}

}
