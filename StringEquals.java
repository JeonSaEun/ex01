package Chap4;

public class StringEquals {

	public static void main(String...args) {
		// 문자열 리터럴(힙영역에 한번 생성하고 주소 공유)
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) { //두 문자열 객체의 주소비교
			System.out.println("strVar1 == strVar2");
		} else {
			System.out.println("strVar1 != strVar2");
		} // if-else
		
		if(strVar1.equals(strVar2)) { // 값을 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} // if
		
//		---------------------//
		
//		객체 생성 연산자 new로 무조건 힙에 객체 생성
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) { // 주소비교
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		} // if-else
		
		if(strVar3.equals(strVar4)) { // 값을 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} // if
		
	} // main
	
} // end class
