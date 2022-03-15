package Chap0607.Ex02;
import java.util.Arrays;
public class ArrayArgumentMethod {

	
	//static 이 있으면서 같은 클래스 안에 있는 메서드 : 메소드 이름으로 호출 가능
	//public :: 다른 패키지에서 접근 가능하도록 설정 : 접근 제어자  (public, protected, default, private)
	//접근제어자가 생략되어 있으면 'default' (같은 패키지에서 접근 가능)
	static void printArray (int[] a) {

		System.out.println("Arrays.toString() 으로 출력");
		System.out.println(Arrays.toString(a));
		
		//for 를 사용해서 출력해보세용
		System.out.println("for 문으로 출력");
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
								
		//enhanced for 를 사용해서 출력해보세용
		System.out.println("향상된 for 문으로 출력");
		for(int j : a) {
			System.out.print(j +" ");
		}
		System.out.println();
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		//배열을 매개 변수로 가지는 메소드 호출
		int[] a = new int[] {1, 2, 3};			// 배열변수를 선언하고 값을 넣은 후
		
		printArray(a);							// 배열변수를 메소드 호출 시 배열 변수 입력
		printArray (new int[] {4, 5, 6, 7, 8});		
		
//		parintArray({1, 2, 3, 4});				오류 발생
		
		
	}

}
