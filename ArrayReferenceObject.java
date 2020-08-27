package Chap4;

public class ArrayReferenceObject {

	public static void main(String...args) {
		String[] strArray = new String[3];
		
		strArray[0] = "Java";				// 문자열 리터럴
		strArray[1] = "Java";				// 문자열 리터럴
		strArray[2] = new String("Java");	// 문자열 객체 생성
		
		// 두 문자열의 주소가 같은가?
		System.out.println( strArray[0] == strArray[1]);
		System.out.println( strArray[0] == strArray[2]);
		
		// 두 문자열의 내용이 같은가?
		System.out.println( strArray[0].equals(strArray[2]));
	
	} // main
	
} // end class
