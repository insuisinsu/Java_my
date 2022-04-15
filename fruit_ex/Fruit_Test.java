package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	상속을 다루어 봅시다.
 	하위의 생성자에 super() 사용
 	
 	자바 파일과 실행파일 함께 제출
  
 */

class Fruit {
	String fruitName;	//과일 이름
	String color;		//과일의 색
	int large;			//과일 크기

	public String toString () {		//과일의 정보를 출력하는 메소드
		return "과일의 이름은 < "+fruitName+" > 이고, 색깔은 < "+color+" > 이고, 크기는 < "+large+" > 입니다.";
	}
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	

}

class Apple extends Fruit {
	Apple (String fruitName, String color, int large){
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
	
}

class Orange extends Fruit{
	Orange (String fruitName, String color, int large){
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Banana extends Fruit{
	Banana (String fruitName, String color, int large){
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}


public class Fruit_Test {

	public static void main(String[] args) {

		ArrayList<Fruit> fruitList = new ArrayList ();
		Scanner sc = new Scanner(System.in);
		
		String name;
		String col;
		int size;
		
		boolean run = true; 
		while (run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1. 사과		|	2. 오렌지		| 	3. 바나나		|	4. 정보 출력		|	5. 종료");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("선택>>");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("과일의 이름 : ");
				name = sc.next();
				System.out.println("과일의 색상 : ");
				col = sc.next();
				System.out.println("과일의 크기 : ");
				size = sc.nextInt();
				Apple apple = new Apple(name, col, size);
				fruitList.add(apple);
			}else if (selectNO == 2) {
				System.out.println("과일의 이름 : ");
				name = sc.next();
				System.out.println("과일의 색상 : ");
				col = sc.next();
				System.out.println("과일의 크기 : ");
				size = sc.nextInt();
				Orange orange = new Orange(name, col, size);
				fruitList.add(orange);
			}else if (selectNO == 3) {
				System.out.println("과일의 이름 : ");
				name = sc.next();
				System.out.println("과일의 색상 : ");
				col = sc.next();
				System.out.println("과일의 크기 : ");
				size = sc.nextInt();
				Banana banana = new Banana(name, col, size);
				fruitList.add(banana);
			}else if (selectNO == 4) {
				for(Fruit k : fruitList) {
					System.out.println(k);
				}
			}else if (selectNO == 5) {
				run = false; 
			}
			
		}
		sc.close(); 
		System.out.println("프로그램 종료");
		
		
		/*	1. 코드 작성
		 	스캐너로 받으세요.
		 	선택하세요.
		  	----------------------------------------------------------------------------
		  	1. 사과		|	2. 오렌지		| 	3. 바나나		|	4. 정보 출력		|	5. 종료
		  	----------------------------------------------------------------------------
		 
		 	선택 >> 1, 2, 3 		을 하면
		 	과일명	:
		 	색상		:
		 	크기		:		인풋받기
		 
		2. 코드작성 : 스캐너로 인풋 받은 값으로 각각의 객체를 생성하고 ArrayList 에 저장
		
		3. 선택 4, 정보출력 - ArrayList 의 모든 객체를 출력	- Enhanced For 문 사용
		과일의 이름은 <사과> 이고, 색깔은 <빨간색> 이고, 크기는 <10> 입니다.
		과일의 이름은 <오렌지> 이고, 색깔은 <주황색> 이고, 크기는 <20> 입니다.
		과일의 이름은 <바나나> 이고, 색깔은 <노란색> 이고, 크기는 <30> 입니다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
