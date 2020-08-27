package Chap4;

public class Person {

		int age;				// 인스턴스 필드
		String name;			// 인스턴스 필드
		
		static String nation;	// 정적 필드, 클래스 필드
		
		static {
			nation = "KOREA";
		} // static initializer
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		} // constructor
	
} // end class
