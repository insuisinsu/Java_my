package Chap10.Ex04;

class Animals{
	void run() {
	}
}
class Tiger extends Animals{
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 고기 먹어요");
	}
}
class Egle extends Animals{
	@Override
	void run() {
		System.out.println("독수리는 날라다녀요.");
	}
	void egleEat() {
		System.out.println("독수리도 고기 먹어요");
	}
}
class Snake extends Animals{
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}

public class MethodOverriding_02 {

	public static void main(String[] args) {

		//1. 모든 객체는 Animals 타입으로 생성
		Animals tiger = new Tiger();
		Animals egle = new Egle();
		Animals snake = new Snake();
		
		
		//2. Animals 배열에 각 개체를 저장하고
		Animals[] animals = {tiger, egle, snake};
		
		//3. for 를 통해 출력
		for(int i = 0; i < animals.length; i++){
			animals[i].run();
		}
		System.out.println();
		//4. Enhanced For 사용, run() 출력 
		for(Animals k : animals) {
			k.run();
		}
		
		//5. 다운 캐스팅(instanceof) 사용하여 출력
		if(tiger instanceof Tiger) {
			Tiger t_down = (Tiger) tiger;
			t_down.tigerEat();
		}else {
			System.out.println("tiger 는 Tiger로 다운캐스팅 불가능");
		}
		
		if(egle instanceof Egle) {
			((Egle) egle).egleEat();
		}else {
			System.out.println("egle은 Egle로 다운캐스팅 불가능");
		}
		
		
	}

}
