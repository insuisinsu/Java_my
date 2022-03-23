package Chap14.Ex05;


// 자동 리소스(객체) 제거


//필드 값 할당. 생성자 호출시 필드에 값 부여, 
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;
	
	Abc (String name, int studentID, int kor, int eng, int math, double avg){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
	}
	
	@Override
	public void close() throws Exception {
		if(name != null | studentID != 0 | kor != 0 | eng != 0 | math != 0 | avg !=0.0) {
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			
			System.out.println("리소스가 해제되었습니다.");
		}
	}
	
}

public class TryWithResource_3 {

	public static void main(String[] args) {

		//1. 객체의 모든 필드를 초기화 하고 자동으로 close() 호출
		
		try(Abc abc = new Abc("박인수", 001, 100, 99, 100, 99.67)){
			
		}catch(Exception e){
			System.out.println("예외처리 자동");
		}
		
		
		//2. '' 수동 close() // finally 블락에서 close() 호출
		
		Abc abc2 = null;
		
		try {
			abc2 = new Abc("박인수", 002, 100, 99, 100, 99.67);
		}catch(Exception e) {
			System.out.println("예외처리 수동");
		}finally {
			try {
				abc2.close();
			} catch (Exception e) {
			}
		}
		
	}

}
