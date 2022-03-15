package chap05;
import java.util.Arrays;
public class CreatStringObjext02 {

	public static void main(String[] args) {

		//객체의 값을 복사한 후 수정 했을 때의 변화
		//1. 문자열 수정 (객체 내의 내용은 변경이 불가 --> 새로운 객체가 생성됨)
		
		String str1 = new String("안녕");
		String str2 = str1;		//참조 자료형일 때는 Stack 의 주소값 복사
		
		str1 = "안녕하세요.";		//별도의 메모리 공간에 "안녕하세요'가 생성됨.
		
		System.out.println(str1);
		System.out.println(str2);
		
		//배열인 경우
		//값을 변경하면 수정됨.
		int[] arr1 = new int[] { 3, 4, 5};
		int[] arr2 = arr1;
		
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
