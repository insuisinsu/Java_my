package Work;

class Students {
	int studentID;
	String name;
	int kor ;
	int eng;
	
	Students(int studentID, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Students)obj).studentID){
			return true;
		}else {
			return false;
		}
	}*/
}

public class Quiz_0317 {

	public static void main(String[] args) {

		Students s1 = new Students(1111, "홍길동", 90, 80);
		Students s2 = new Students(2222, "박인수", 100, 100);
		Students s3 = new Students(3333, "이순신", 98, 87);
		Students s4 = new Students(1111, "익명", 97, 78);
		
		//studentID 가 같은 경우, 같은 학생이다 라고 출력
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.name);
		if(s1.studentID == s4.studentID) {
			System.out.println("같은 학생이다.");
		}else {
			System.out.println("다른 학생이다.");
		}
	}

}
