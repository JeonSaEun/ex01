package Chap4;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println("- args.length: " + args.length);
		
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayAgument num1 num2");
		
			// 프로그램 강제종료(괄호안의 숫자는 종료코드, exit code라 함)
			System.exit(0); // 0은 정상종료, 그 외 값은 비정상종료
		} // if
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
//		--------------------------
//		숫자형태의 문자열을 --> 정수로 바꿔주는 메소드
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
//		--------------------------
		
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
	} // main
	
} // end class
