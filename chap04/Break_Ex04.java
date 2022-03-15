package chap04;

public class Break_Ex04 {

	public static void main(String[] args) {

		//1. 단일 loop 가 적용된 곳에서 break 탈출
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; 		//break를 만나면, 해당 구문을 빠져 나옴
			
		}
		
		//2. for 내에서 if 조건을 사용하여 break 사용
		
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {				//i가 5일 때 for 에서 문장을 빠져나옴
				break;
			}
			System.out.print(i +" ");
		}System.out.println("=========");
		
		//3. 다중 loop 일 때 break 탈출  ( 하나의 반복문만 빠져 나옴 )
		
		for (int i = 0; i<5; i++) {				//i가 2일 때 break 가 걸리기 때문에, 두 번째 for만 실행하지 않음 // i 가 2가 아닌 경우만 실행함
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					break;
				}
				System.out.println(i +" , "+j);
			}
		}System.out.println("==========");
		
		//4. 다중 loop 에서 한꺼번에 탈출,  i) 라벨 이름을 사용하여 탈출 (break 라벨 ,,, 라벨: 위치로)
		
POS1:		for (int i = 0; i < 5 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (i == 2) {
					break POS1;
				}
				
				System.out.println(i +", " + j);
			}
		}System.out.println("========");
		
		//4. 다중 loop 에서 한꺼번에 탈출,  ii) 변수의 조건을 false 로 만들어서 탈출  (끊고 싶은 부분에서 / 첫번째 for 에서 false 가 발생하게 하는 / 변수를 할당) 
		
			for (int i = 0; i < 5 ; i++) {
				for (int j = 0 ; j < 5 ; j++) {
					if (i == 2) {
						i = 100;
						break;
					}
				System.out.println(i +", " + j);
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
