package Chap3;

public class AssignmentOperator {
//	복합연산자
	public static void main(String...args) {
		int result = 0;
		result += 10;
		
		System.out.println("result=" + result);
		
		result -= 5;
		System.out.println("result=" + result);
		
		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5;
		System.out.println("result=" + result);
		
		result %= 3;
		System.out.println("result=" + result);
	} // main
} // end class
