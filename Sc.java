package Chap3;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.reset();	//스캐닝할 준비를 마침
		
		System.out.println("이름 나이 주소를 입력하세요:");
		System.out.println(">>> ");
		
		while(scan.hasNext()) { // 소비할 token이 있느냐?
			// 소비할 token이 있다면, 계속 소비하겠다
			String token = scan.next();
			
			System.out.println(token);
		} // while
		
		//자원반납: 스캐너 객체는 소위 "자원객체"임
		//자원객체는 다 사용하고 나면, 반드시 닫아주어야 사용한 자원을 해제하게 됨
		scan.close();
		
	} // main
	
} // end class
