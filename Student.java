package Chap4;

public class Student {
	
	String name;
	int age;
	
	static String nation = "Korea";
	
	// 인스턴스 필드의 초기화 -> 생성자의 역할
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	} // constructor
	
} // end class