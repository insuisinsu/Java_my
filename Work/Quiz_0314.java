package Work;
class Student{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	void hobby() {
		System.out.println(name + " 학생의 취미는 ~ 입니다.");
	}

	@Override
	public String toString() {
		sum = kor + eng + math;
		avg = (double) sum / 3;
		return "이름: "+name+", 학번: "+studentID+", 국어: "+kor+", 영어: "+eng
				+", 수학: "+math+"합계: "+sum+", 평균: "+avg;
	}
	
	
}

class S_철수 extends Student{

	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}
	
	S_철수(String a, int b, int c, int d, int e){	
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
	}
}
class S_지안 extends Student{
	
	@Override
	void hobby() {
		System.out.println("지안의 취미는 볼링입니다.");
	}
	
	S_지안(String a, int b, int c, int d, int e){	
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
	}	
}
class S_한솔 extends Student{
	
	@Override
	void hobby() {
		System.out.println("한솔의 취미는 뜨개질입니다.");
	}
	S_한솔(String a, int b, int c, int d, int e){	
		super.name = a;
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
	}	
}
public class Quiz_0314 {

	public static void main(String[] args) {

		Student cs = new S_철수("철수", 1, 34, 45, 67);
		Student ja = new S_지안("지안", 2, 88, 78, 68);
		Student hs = new S_한솔("한솔", 3, 99, 98, 97);
		
		Student[] str = {cs, ja, hs};
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			str[i].hobby();
		}
		
		System.out.println("=========");
		for(Student k : str) {
			System.out.println(k);
			k.hobby();
		}
		
	}

}
