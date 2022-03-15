package chap04;

public class Continue_Ex05 {

	public static void main(String[] args) {

		//1. 단일 루프에서 continue
		
		for (int i = 0; i < 10 ; i++) {
			continue;
			// System.out.println("출력 구문 오류");
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(i +" ");
			continue;					// continue 는 조건 없이 하위에 실행문을 사용하면 오류
//			System.out.println();
		} 
		System.out.println();
		System.out.println("조건을 넣은 continue");
		
		//2. 조건을 넣어서 continue 사용하기
		
		for (int i = 0 ; i < 10 ; i++) {
			if (i==5) {
				continue;
			}
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("조건을 넣은 break");
		
		//2. 조건을 넣어서 break 사용하기
		
		for (int i = 0 ; i < 10 ; i++) {
			if (i==5) {
				break;
			}
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("continue 는 5만 빠졌지만, break 는 5 부터 모두 빠짐");
		System.out.println();
		System.out.println("다중 루프에서의 continue");
		
		//3. 다중 loop 에서 continue 사용
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <5 ; j++) {
				if (j == 3) {
					continue;
				}
					System.out.println(i +", "+j);
			}
		}
		System.out.println();
		System.out.println("다중 루프에서의 break");
		
		//3. 다중 loop 에서 continue 사용
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <5 ; j++) {
				if (j == 3) {
					break;
				}
					System.out.println(i +", "+j);
			}
		}
		
		//4. continue 에서 라벨 사용하기
		System.out.println();
		System.out.println("continue 에서 라벨 사용");
POS2:	for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <5 ; j++) {
				if (j == 3) {
					continue POS2;
				}
					System.out.println(i +", "+j);
			}
		}
		
		
		//4. break 에서 라벨 사용하기
		System.out.println();
		System.out.println("break 에서 라벨 사용");
POS3:	for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <5 ; j++) {
				if (j == 3) {
					break POS3;
				}
					System.out.println(i +", "+j);
			}		
		}System.out.println("두 번째 for 의 첫 실행에서 j 가 3이 되자마자 POS3 로 break 됨");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
