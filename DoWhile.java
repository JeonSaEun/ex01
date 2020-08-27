package Chap3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String...args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString = "999";
		int number = -1;
		
		do {
			System.out.print(">");
			
//			inputString = scanner.nextLine();
			number = scanner.nextInt();
			
			System.out.println(number);
		} while( ! inputString.equals(String.valueOf(number)) );
//		} while( scanner.hasNext() );
		
		System.out.println();
		System.out.println("프로그램 종료");
	} // main
	
} // end class
