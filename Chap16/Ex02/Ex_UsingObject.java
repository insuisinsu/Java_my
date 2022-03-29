package Chap16.Ex02;

// Object �� ����ؼ� 4 ���� ��ü�� �����ϰ�, ��� �غ���

class Student{
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "�л� �̸� : "+name+", id : "+id+", ��й�ȣ : "+pass;
	}
	
}

class Professor{
	String name;
	int year;
	String email;
	
	Professor (String name, int year, String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	@Override
	public String toString() {
		return "���� �̸� : "+name+", ���� : "+year+", email : "+email;
	}
	
}

class Tiger{
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "ȣ���� �̸� : "+name+" , ȣ���̴� "+run;
	}
}



class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�ٳ����� �̸��� : "+name+" , ������ : "+color+" , ������ : "+price;
	}
	
}

class Using{
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

//
class All<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class Ex_UsingObject {

	public static void main(String[] args) {
		
		Using student = new Using();
		student.setObject(new Student("���μ�", "���̵�", 1234));
		System.out.println((Student)student.getObject());
		
		Using professor = new Using();
		professor.setObject(new Professor("���μ�", 5, "geoinsu@gmail.com"));
		System.out.println((Professor)professor.getObject());
		
		Using tiger = new Using();
		tiger.setObject(new Tiger("ȣ����", "����"));
		System.out.println((Tiger)tiger.getObject());
		
		Using banana = new Using();
		banana.setObject(new Banana("�ٳ���", "���", 1000));
		System.out.println((Banana)banana.getObject());
		
		System.out.println("=================");
		
		//
		
		All<Student> student1 = new All();
		student1.set(new Student("�л� �̸�", "���̵�", 1234));
		System.out.println(student1.get());
		
		All<Professor> professor1 = new All();
		professor1.set(new Professor("���� �̸�", 5, "�̸��� �ּ�"));
		System.out.println(professor1.get());
		
		All<Tiger> tiger1 = new All();
		tiger1.set(new Tiger("ȣ����", "����"));
		System.out.println(tiger1.get());
		
		All<Banana> banana1 = new All();
		banana1.set(new Banana("�ٳ���", "���", 3000));
		System.out.println(banana1.get());
		
		
		
	}

}
