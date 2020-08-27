package Chap4;

public class StudentExample {
	
	public static void main(String...args) {
		Student s1 = new Student("Yoseph", 24);
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1);
		
		Student s2 = new Student("Penny", 33);
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(s2);
		
	} // main
	
} // end class
